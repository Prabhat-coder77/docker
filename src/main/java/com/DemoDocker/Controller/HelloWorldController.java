package com.DemoDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/message")
	public String getMessage()
	{
        return "Hello World Java Developers I hope you Enjoy This diwali ..........!!";
	}
}
