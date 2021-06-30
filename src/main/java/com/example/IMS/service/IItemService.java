package com.example.IMS.service;

import com.example.IMS.model.Item;

public interface IItemService {
	Item getItemById(long id);

	String validateItemId(long id);
}
