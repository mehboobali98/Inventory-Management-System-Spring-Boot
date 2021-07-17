package com.example.IMS.service;

import java.util.List;

import com.example.IMS.model.ItemType;

public interface IItemTypeService {
	void saveItemType(ItemType itemType);
	ItemType getItemTypeByName(String name);
	List<ItemType> getAllItemTypes();
	String validateItemTypeByName(String name);
}
