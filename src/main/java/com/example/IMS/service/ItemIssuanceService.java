package com.example.IMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Loan;
import com.example.IMS.repository.IItemIssuanceRepository;

@Service
public class ItemIssuanceService implements IItemIssuanceService {

	@Autowired
	private IItemIssuanceRepository itemIssuanceRepository;

	@Override
	public void saveItemRepair(Loan loan) {
		this.itemIssuanceRepository.save(loan);
	}

	@Override
	public List<Loan> getAllIssuedItems() {
		return itemIssuanceRepository.findAll();
	}

}
