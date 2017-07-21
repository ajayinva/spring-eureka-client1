/**
 * 
 */
package com.aces.learn.spring.eureka.client1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author aagarwal
 *
 */
@FeignClient("client2")
public interface FeignServiceClient{	
	@RequestMapping(method= RequestMethod.GET, value="/sayHello", consumes="application/json")
	String getMessage();
}
