package com.example.IMS.service;

import com.example.IMS.model.Vendor;

public interface IVendorService {
	Vendor getVendorById(long id);

	String validateVendorId(long id);
}
