package com.sj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormCotroller {
	
	@RequestMapping(value="/authentication")
	public String processForm()	{
		return "baselayout";
		//return "loggedin";
	}
	
	
}
