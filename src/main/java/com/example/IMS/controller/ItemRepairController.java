package com.example.IMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.IMS.convertor.ItemRepairConvertor;
import com.example.IMS.dto.ItemRepairDto;
import com.example.IMS.model.ItemRepair;
import com.example.IMS.service.ItemRepairService;

@Controller
public class ItemRepairController {

	@Autowired
	private ItemRepairService itemRepairService;
	@Autowired
	private ItemRepairConvertor itemRepairConvertor;

	@GetMapping("/ItemRepairView")
	public String View(Model model) {
		model.addAttribute("ItemRepairDtoList", itemRepairConvertor.modelToDto(itemRepairService.getAllRepairItems()));
		return "/Item Repair/View";
	}

	@GetMapping("/ItemRepairCreate")
	public String Create(Model model) {
		ItemRepairDto itemRepairDto = new ItemRepairDto();
		model.addAttribute("itemRepairDto", itemRepairDto);
		return "/Item Repair/Create";
	}

	@PostMapping("/ItemRepairCreate")
	public String Create(@ModelAttribute("itemRepairDto") ItemRepairDto itemRepairDto) {
		itemRepairService.saveItemRepair(itemRepairConvertor.DtoToModel(itemRepairDto));
		return "redirect:/ItemRepairView";

	}

	@GetMapping("/ItemRepairEdit/{id}")
	public String Edit(@PathVariable (value = "id") long id, Model model) {
		ItemRepair itemRepair = itemRepairService.findItemRepairById(id);
		model.addAttribute("itemRepairDto", itemRepairConvertor.modelToDto(itemRepair));
		return "/Item Repair/Edit";
	}

	@GetMapping("/ItemRepairDelete/{id}")
	public String Delete(@PathVariable (value = "id") long id) {
		itemRepairService.deleteItemRepairById(id);
		return "redirect:/ItemRepairView";
	}

}
