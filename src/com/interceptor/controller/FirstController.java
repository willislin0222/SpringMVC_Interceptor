package com.interceptor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/first")
public class FirstController {
	
	 @RequestMapping(method = RequestMethod.GET, value = "first")
	 public String doFirst(HttpServletRequest request, HttpServletResponse response,ModelMap model){
        System.out.println("doFirst");
        return "DEMO";
    }

}
