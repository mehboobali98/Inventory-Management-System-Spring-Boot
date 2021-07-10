package com.example.IMS.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Borrower;
import com.example.IMS.repository.IBorrowerRepository;

@Service
public class BorrowerService implements IBorrowerService {

	@Autowired
	private IBorrowerRepository borrowerRepository;

	@Override
	public Borrower getBorrowerById(long id) {
		Optional<Borrower> optional = borrowerRepository.findById(id);
		Borrower borrower = null;
		if (optional.isPresent()) {
			borrower = optional.get();
		} else {
			// Exception
		}
		return borrower;
	}

}
