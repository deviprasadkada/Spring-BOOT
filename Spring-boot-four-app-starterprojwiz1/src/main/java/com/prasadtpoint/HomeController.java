package com.prasadtpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello u are in spring boot application four!";
	}
}
