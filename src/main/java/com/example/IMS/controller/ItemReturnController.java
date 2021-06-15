package com.example.IMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemReturnController {
	
	 @GetMapping("/Item Return")
	 public String issueHighPrecedence(){
        return "/Item Return/Item Return Form";
 }
}
