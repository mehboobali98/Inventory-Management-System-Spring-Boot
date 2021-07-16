package com.example.IMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Loan;
import com.example.IMS.repository.IItemIssuanceRepository;

@Service
public class ItemIssuanceService implements IItemIssuanceService {

	@Autowired
	private IItemIssuanceRepository itemIssuanceRepository;

	@Override
	public void saveItemIssued(Loan loan) {
		this.itemIssuanceRepository.save(loan);
	}

	@Override
	public List<Loan> getAllIssuedItems() {
		List<Loan> loanList = itemIssuanceRepository.findAll();
		List<Loan> issuedItems = new ArrayList<>();
		for (Loan l : loanList) {
			if (l.getReturnDate().isEmpty()) {
				issuedItems.add(l);
			}
		}
		return issuedItems;
	}

	@Override
	public void deleteIssuedItemById(long id) {
		this.itemIssuanceRepository.deleteById(id);
	}

	@Override
	public Loan findItemIssuedById(long id) {
		Optional<Loan> optional = itemIssuanceRepository.findById(id);
		Loan loanItem = null;
		if (optional.isPresent()) {
			loanItem = optional.get();
		} else {
			// Exception
		}
		return loanItem;
	}

	@Override
	public Loan findItemIssued(long borrowerId, long itemId) {
		List<Loan> loanList = getAllIssuedItems();
		Loan loan = null;
		for (Loan l : loanList) {
			if (l.getReturnDate() == null | l.getReturnDate().isEmpty()) {
				if (l.getBorrower().getId() == borrowerId & l.getItem().getId() == itemId) {
					loan = l;
					break;
				}
			}
		}
		return loan;
	}

	@Override
	public List<Loan> getAllReturnedItem() {
		List<Loan> loanList = itemIssuanceRepository.findAll();
		List<Loan> returnedItems = new ArrayList<>();
		for (Loan l : loanList) {
			if (!(l.getReturnDate().isEmpty())) {
				returnedItems.add(l);
			}
		}
		return returnedItems;
	}

	@Override
	public String validateLoanId(long loanId) {
		String errorMessage = "";
		Loan loan = findItemIssuedById(loanId);
		if (loan == null) {
			errorMessage = "Loan ID does not exist. Invalid Input.";
		}
		return errorMessage;
	}

	@Override
	public List<Loan> getItemsWithFine() {
		List<Loan> loanList = itemIssuanceRepository.findAll();
		List<Loan> itemsWithFine = new ArrayList<>();
		for (Loan l : loanList) {
			if (l.getTotalFine() > 0) {
				itemsWithFine.add(l);
			}
		}
		return itemsWithFine;
	}

}
