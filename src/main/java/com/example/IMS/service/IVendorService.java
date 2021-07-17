package com.example.IMS.service;

import com.example.IMS.model.Vendor;

public interface IVendorService {
	Vendor getVendorById(long id);

	Vendor getVendorByName(String name);

	String validateVendorId(long id);
	
	String validateVendorName(String vendorName);
}
