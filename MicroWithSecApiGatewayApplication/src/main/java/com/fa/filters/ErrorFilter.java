/**
 * 
 */
package com.fa.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author testing
 *
 */
public class ErrorFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		System.out.println(
				"Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());

		System.out.println("Using ErrorFilter Filter");

		return null;
	}

}
