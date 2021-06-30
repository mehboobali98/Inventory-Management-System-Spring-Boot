package com.example.IMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.IMS.dto.ItemRepairDto;
import com.example.IMS.model.ItemRepair;
import com.example.IMS.service.ItemRepairService;

@Controller
public class ItemRepairController {
	
	@Autowired
	private ItemRepairService itemRepairService;
	
	@GetMapping("/ItemRepairView")
	public String View(Model model)
	{
		model.addAttribute("listItemRepair", itemRepairService.getAllRepairItems());
		return "/Item Repair/View";
	}
	
	@GetMapping("/ItemRepairCreate")
	public String Create(Model model)
	{
		ItemRepairDto itemRepairDto = new ItemRepairDto();
		model.addAttribute("itemRepairDto", itemRepairDto);
		return "/Item Repair/Create"; 
	}
	
	@PostMapping("/createItemRepair")
	public String createItemRepair(@ModelAttribute("itemRepairDto") ItemRepairDto itemRepairDto)
	{
		//itemRepairService.saveItemRepair(itemRepair);
		return "redirect:/ItemRepairView";
		
	}
	
	@GetMapping("/ItemRepairEdit")
	public String Edit()
	{
		return "/Item Repair/Edit";
	}
	
	@GetMapping("/ItemRepairDelete")
	public String Delete()
	{
		return "/Item Repair/Delete";
	}
	
}
