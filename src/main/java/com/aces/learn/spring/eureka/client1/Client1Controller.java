/**
 * 
 */
package com.aces.learn.spring.eureka.client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aagarwal
 *
 */
@RestController
public class Client1Controller {	
	@Autowired
	private DiscoveryServiceClient discoveryServiceClient2;
	@Autowired
	private RibbonRestTemplateClient ribbonRestTemplateClient;
	@Autowired
	private FeignServiceClient feignServiceClient;
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHelloClient1")
	public String sayHelloClient1(){		
		return "Hello from Eureka Client1";
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHelloDiscoveryClient")
	public String sayHelloDiscoveryClient(){		
		return "Dsicovery Client::"+ discoveryServiceClient2.getMessage();
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHelloRestTemplateClient")
	public String sayHelloRestTemplateClient(){		
		return "Ribbon Backed Rest Template Client::"+ribbonRestTemplateClient.getMessage();
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHelloFeignClient")
	public String sayHelloFeignClient(){		
		return "Feign Client::"+feignServiceClient.getMessage();
	}
}
