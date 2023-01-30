package com.example.accessingdatamysql.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class DefaultController {


	/*
	 * @return welcome message with the current date
	 */
	@RequestMapping(path="/", method=RequestMethod.GET) 
	public @ResponseBody String index() {

		return "Welcome " + new Date();
	}

}
