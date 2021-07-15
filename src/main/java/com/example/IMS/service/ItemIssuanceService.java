package com.example.IMS.service;

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
		return itemIssuanceRepository.findAll();
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

}
