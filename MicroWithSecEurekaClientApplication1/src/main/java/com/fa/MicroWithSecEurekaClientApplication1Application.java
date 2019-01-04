package com.fa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableZuulProxy
//@EnableResourceServer
public class MicroWithSecEurekaClientApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroWithSecEurekaClientApplication1Application.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		/*RestTemplate restTemplate = new RestTemplate();
		MappingJacksonHttpMessageConverter converter = new MappingJacksonHttpMessageConverter();
		converter.setObjectMapper(new ObjectMapper());
		restTemplate.getMessageConverters().add(converter);*/
		return new RestTemplate();
	}
}
