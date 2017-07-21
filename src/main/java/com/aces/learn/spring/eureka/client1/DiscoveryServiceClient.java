/**
 * 
 */
package com.aces.learn.spring.eureka.client1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author aagarwal
 *
 */
@Component
public class DiscoveryServiceClient {
	@Autowired
	private DiscoveryClient discoveryClient;
	/**
	 * 
	 * @return
	 */
	public String getMessage(){
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> instances = discoveryClient.getInstances("client2");		
		ResponseEntity<String> restExchange =
				restTemplate.exchange(
					instances.get(0).getUri()+"/sayHello",
					HttpMethod.GET,
					null, 
					String.class				
				);	
		return restExchange.getBody();
	}
}
