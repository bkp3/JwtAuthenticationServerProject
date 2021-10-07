package com.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String welcome() {
		String text = "this is a private page";
		text = text + "this page is not allowed for unauthorized people";
		return text;
	}
}
