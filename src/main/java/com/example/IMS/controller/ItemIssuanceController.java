package com.example.IMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemIssuanceController {
	 @GetMapping("/High Precedence")
	 public String issueHighPrecedence(){
	        return "/Item Issuance/High Precedence";
	 }
	 
	 
	 @GetMapping("/Low Precedence")
	 public String issueLowPrecedence()
	 {
		 return "/Item Issuance/Low Precedence";
	 }
	 
	 
}
