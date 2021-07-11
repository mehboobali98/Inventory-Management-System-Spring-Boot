package com.example.IMS.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.IMS.dto.ItemIssuanceDto;
import com.example.IMS.Utilities.Helper;
import com.example.IMS.model.Loan;
import com.example.IMS.service.BorrowerService;
import com.example.IMS.service.ItemService;

@Component
public class ItemIssuanceConvertor {

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private BorrowerService borrowerService;

	public ItemIssuanceDto modelToDto(Loan loan) {
		ItemIssuanceDto dto = new ItemIssuanceDto();
		dto.setId(loan.getId());
		dto.setLoanDuration(loan.getLoanDuration());
		dto.setIssueDate(loan.getIssueDate());
		dto.setDueDate(Helper.getDueDate(loan.getIssueDate(), loan.getLoanDuration()));
		dto.setFineAmount(loan.getFineAmount());
		dto.setItemId(itemService.findItemIdByLoanId(loan.getId()));
		dto.setBorrowerId(borrowerService.getBorrowerIdByLoanId(loan.getId()));
		return dto;
	}

	public Loan dtoToModel(ItemIssuanceDto dto) {
		Loan loan = new Loan();
		loan.setId(dto.getId());
		loan.setLoanDuration(dto.getLoanDuration());
		loan.setIssueDate(Helper.getCurrentTime());
		return loan;
	}

	public List<ItemIssuanceDto> modelToDto(List<Loan> loanList) {
		List<ItemIssuanceDto> DtoList = new ArrayList<>();
		int size = loanList.size();
		for (int i = 0; i < size; i++) {
			DtoList.add(modelToDto(loanList.get(i)));
		}
		return DtoList;
	}
}
