/**
 * 
 */
package com.fa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author testing
 *
 */
@Component
public class ApiGatewayInterceptorConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	ApiGatewayInterceptor apiGatewayInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(apiGatewayInterceptor);
	}
}
