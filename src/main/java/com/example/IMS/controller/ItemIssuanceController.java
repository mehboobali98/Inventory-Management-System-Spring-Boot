package com.example.IMS.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.IMS.convertor.ItemIssuanceConvertor;
import com.example.IMS.dto.ItemIssuanceDto;
import com.example.IMS.model.Borrower;
import com.example.IMS.model.Item;
import com.example.IMS.model.Loan;
import com.example.IMS.service.BorrowerService;
import com.example.IMS.service.ItemIssuanceService;
import com.example.IMS.service.ItemService;

@Controller
public class ItemIssuanceController {

	@Autowired
	private ItemIssuanceService itemIssuanceService;

	@Autowired
	private ItemService itemService;

	@Autowired
	private BorrowerService borrowerService;

	@Autowired
	private ItemIssuanceConvertor itemIssuanceConvertor;

	@GetMapping("/ItemIssuanceView")
	public String View(Model model) {
		model.addAttribute("ItemIssuanceDtoList",
				itemIssuanceConvertor.modelToDto(itemIssuanceService.getAllIssuedItems()));
		return "/Item Issuance/View";
	}

	@GetMapping("/ItemIssuanceCreate")
	public String Create(Model model) {
		ItemIssuanceDto itemIssuanceDto = new ItemIssuanceDto();
		model.addAttribute("itemIssuanceDto", itemIssuanceDto);
		return "/Item Issuance/Create";
	}

	@PostMapping("/ItemIssuanceCreate")
	public String Create(@Valid @ModelAttribute("itemIssuanceDto") ItemIssuanceDto itemIssuanceDto,
			BindingResult result) {
		Borrower borrower = borrowerService.getBorrowerById(itemIssuanceDto.getBorrowerId());
		Item item = itemService.getItemById(itemIssuanceDto.getItemId());
		Loan loan = itemIssuanceConvertor.dtoToModel(itemIssuanceDto);
		borrower.addLoan(loan);
		item.addLoan(loan);
		itemIssuanceService.saveItemRepair(loan);
		return "redirect:/ItemIssuanceView";
	}

}
