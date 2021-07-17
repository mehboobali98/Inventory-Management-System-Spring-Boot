package com.example.IMS.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		Borrower borrower = null;
		Item item = null;
		String err = borrowerService.validateBorrowerId(itemIssuanceDto.getBorrowerId());
		if (!err.isEmpty()) {
			ObjectError error = new ObjectError("globalError", err);
			result.addError(error);
		} else {
			borrower = borrowerService.getBorrowerById(itemIssuanceDto.getBorrowerId());
		}
		err = itemService.validateItemId(itemIssuanceDto.getItemId());
		if (!err.isEmpty()) {
			ObjectError error = new ObjectError("globalError", err);
			result.addError(error);
		} else {
			item = itemService.getItemById(itemIssuanceDto.getItemId());
			if (item.getQuantity() <= 0) {
				err = "Item is out of stock.";
				ObjectError error = new ObjectError("globalError", err);
				result.addError(error);
			}
		}
		if (result.hasErrors()) {
			return "/Item Issuance/Create";
		}
		Loan loan = itemIssuanceConvertor.dtoToModel(itemIssuanceDto);
		borrower.addLoan(loan);
		item.addLoan(loan);
		item.descreaseQuantity();
		itemService.saveItem(item);
		itemIssuanceService.saveItemIssued(loan);
		return "redirect:/ItemIssuanceView";
	}

	@GetMapping("/ItemIssuanceEdit/{id}")
	public String Edit(@PathVariable(value = "id") long id, Model model) {
		Loan loan = itemIssuanceService.findItemIssuedById(id);
		model.addAttribute("itemIssuanceDto", itemIssuanceConvertor.modelToDto(loan));
		return "/Item Issuance/Edit";
	}

	@GetMapping("/ItemIssuanceDelete/{id}")
	public String Delete(@PathVariable(value = "id") long id, Model model) {
		Loan loan = itemIssuanceService.findItemIssuedById(id);
		model.addAttribute("itemIssuanceDto", itemIssuanceConvertor.modelToDto(loan));
		return "/Item Issuance/Delete";
	}

	@PostMapping("/ItemIssuanceDelete/{id}")
	public String Delete(@PathVariable(value = "id") long id,
			@ModelAttribute("itemIssuanceDto") ItemIssuanceDto itemIssuanceDto) {
		itemIssuanceService.deleteIssuedItemById(id);
		return "redirect:/ItemIssuanceView";
	}

}
