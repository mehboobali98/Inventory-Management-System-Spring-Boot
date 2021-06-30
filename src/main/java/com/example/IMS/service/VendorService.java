package com.example.IMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Vendor;
import com.example.IMS.repository.IVendorRepository;

@Service
public class VendorService implements IVendorService {

	@Autowired
	IVendorRepository vendorRepository;

	@Override
	public Vendor getVendorById(long id) {
		return vendorRepository.getById(id);
	}
}
