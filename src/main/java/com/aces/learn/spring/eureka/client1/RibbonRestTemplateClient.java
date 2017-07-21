/**
 * 
 */
package com.aces.learn.spring.eureka.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author aagarwal
 *
 */
@Component
public class RibbonRestTemplateClient {
	@Autowired
	private RestTemplate restTemplate;
	/**
	 * 
	 * @return
	 */
	public String getMessage(){	
		ResponseEntity<String> restExchange =
				restTemplate.exchange(
					"http://client2/sayHello",
					HttpMethod.GET,
					null, 
					String.class				
				);	
		return restExchange.getBody();
	}
}
