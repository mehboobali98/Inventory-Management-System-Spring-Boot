package com.example.IMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemReturnController {
	 @GetMapping("/ItemReturnCreate")
	 public String Create(){
        return "/Item Return/Create";
	 }
	 
	 @GetMapping("/ItemReturnViewAll")
	 public String Index()
	 {
		 return "/Item Return/View";
	 }
}

