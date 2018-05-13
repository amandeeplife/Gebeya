package com.gebeya.main;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String start() {
		return "index";
	}
}
