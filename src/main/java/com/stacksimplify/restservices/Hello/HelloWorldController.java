package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//URI - /helloworld
	//GET
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "HelloWorld";
	}
	@GetMapping("/helloworldbean")
	public UserDetails helloWorldBean() {
		return new UserDetails("J","B", "Belfast");
	}
}
