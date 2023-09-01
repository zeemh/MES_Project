package com.mes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {

	@RequestMapping("/header")
	public String header() {
		return "header";
	}
	@RequestMapping("/headerBar")
	public String headerBar() {
		return "headerbar";
	}
	@RequestMapping("/mainPage")
	public String mainPage() {
		return "mainpage";
	}
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	@RequestMapping("/mainheader")
	public String mainheader() {
		return "mainheader";
	}
	
	
	
	
}
