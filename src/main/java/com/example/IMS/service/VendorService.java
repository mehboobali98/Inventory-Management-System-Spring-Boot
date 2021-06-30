package com.example.IMS.service;

import java.util.Optional;
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
		Optional<Vendor> optional = vendorRepository.findById(id);
		Vendor vendor = null;
		if (optional.isPresent()) {
			vendor = optional.get();
		} else {
			// Exception
		}
		return vendor;
	}

	@Override
	public String validateVendorId(long id) {
		String errorMessage = "";
		Vendor vendor = getVendorById(id);
		if (vendor == null) {
			errorMessage = "Vendor ID does not exist";
		}

		return errorMessage;
	}
}
