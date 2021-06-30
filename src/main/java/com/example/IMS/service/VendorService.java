package com.example.IMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Vendor;
import com.example.IMS.repository.IVendorRepository;

@Service
public class VendorService implements IVendorService {

	@Autowired
	private IVendorRepository vendorRepository;

	@Override
	public Vendor getVendorById(long id) {
		int count = (int) vendorRepository.count();
		Vendor vendor = new Vendor();
		List<Vendor> vendorList = vendorRepository.findAll();
		for (int i = 0; i < vendorList.size(); i++) {
			if (vendorList.get(i).getId() == id) {
				vendor = vendorList.get(i);
				break;
			}
		}
		return vendor;
	}
}
