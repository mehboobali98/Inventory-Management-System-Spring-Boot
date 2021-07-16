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

import com.example.IMS.dto.FineDto;
import com.example.IMS.model.Borrower;
import com.example.IMS.service.BorrowerService;
import com.example.IMS.service.ItemIssuanceService;

@Controller
public class FineController {

	@Autowired
	private BorrowerService borrowerService;

	@Autowired
	private ItemIssuanceService itemIssuanceService;

	@GetMapping("/FineView")
	public String Index(Model model) {
		model.addAttribute("itemsWithFineList", itemIssuanceService.getItemsWithFine());
		return "/Fine/View";
	}

	@GetMapping("/FineCreate")
	public String Create(Model model) {
		FineDto fineDto = new FineDto();
		model.addAttribute("fineDto", fineDto);
		return "/Fine/Create";
	}

	@PostMapping("/FineDetails")
	public String Details(@Valid @ModelAttribute("fineDto") FineDto fineDto, BindingResult result) {
		Borrower borrower = borrowerService.getBorrowerById(fineDto.getBorrowerId());
		double totalFine = borrower.totalFine();
		fineDto.setTotalFine(totalFine);
		return "/Fine/Details";
	}

	@PostMapping("/FinePayment/{borrowerId}")
	public String FinePayment(@PathVariable(value = "borrowerId") long borrowerId,
			@Valid @ModelAttribute("fineDto") FineDto fineDto, BindingResult result) {
		Borrower borrower = null;
		String err = borrowerService.validateBorrowerId(fineDto.getBorrowerId());
		if (!err.isEmpty()) {
			ObjectError error = new ObjectError("globalError", err);
			result.addError(error);
		} else {
			borrower = borrowerService.getBorrowerById(fineDto.getBorrowerId());
		}
		if (result.hasErrors()) {
			return "/Fine/Create";
		}
		try {
			borrower.updateFine(fineDto.getFinePaid());
			borrowerService.updateBorrower(borrower);
		} catch (Exception e) {
			System.out.println("Exception caught in Fine Controller.");
			err = "Unable to update borrower fine details.";
			ObjectError error = new ObjectError("globalError", err);
			result.addError(error);
		}
		return "redirect:/FineView";
	}
}
