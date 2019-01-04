/**
 * 
 */
package com.fa.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author testing
 *
 */
@Component
public class ApiGatewayInterceptor implements HandlerInterceptor {

	@Override
	   public boolean preHandle
	      (HttpServletRequest request, HttpServletResponse response, Object handler) 
	      throws Exception {
	    
		System.out.println("::"+request.getRequestURL());
		
	      System.out.println("Pre Handle method is Calling");
	      return true;
	   }
	   @Override
	   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, ModelAndView modelAndView) throws Exception {
	      
			System.out.println("::"+request.getRequestURL());
	      System.out.println("Post Handle method is Calling");
	   }
	   @Override
	   public void afterCompletion
	      (HttpServletRequest request, HttpServletResponse response, Object 
	      handler, Exception exception) throws Exception {
			System.out.println("::"+request.getRequestURL());
	      System.out.println("Request and Response is completed");
	   }
	
}
