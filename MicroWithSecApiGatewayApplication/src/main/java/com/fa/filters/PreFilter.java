/**
 * 
 */
package com.fa.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author testing
 *
 */
public class PreFilter extends ZuulFilter {
	
	private static Logger log = LoggerFactory.getLogger(PreFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
        return "/api/".equals(path);
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println(
				"Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		ctx.addZuulRequestHeader("Authorization",
                request.getHeader("Authorization"));
       log.info(String.format("%s request to %s", request.getMethod(), 
                request.getRequestURL().toString()));
		
		return null;
	}

}
