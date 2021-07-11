package com.example.IMS.service;

import java.util.List;

import com.example.IMS.model.Loan;

public interface IItemIssuanceService {
	void saveItemRepair(Loan loan);

	List<Loan> getAllIssuedItems();

	void deleteIssuedItemById(long id);

	Loan findItemIssuedById(long id);
}
