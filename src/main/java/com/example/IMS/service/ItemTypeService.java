package com.example.IMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.ItemType;
import com.example.IMS.repository.IItemTypeRepository;

@Service
public class ItemTypeService implements IItemTypeService {

	@Autowired
	private IItemTypeRepository itemTypeRepository;

	@Override
	public void saveItemType(ItemType itemType) {
		itemTypeRepository.save(itemType);
	}

	@Override
	public List<ItemType> getAllItemTypes() {
		return itemTypeRepository.findAll();
	}

	@Override
	public ItemType getItemTypeByName(String name) {
		List<ItemType> itemTypeList = getAllItemTypes();
		ItemType itemType = null;
		for (ItemType it : itemTypeList) {
			if (it.getTypeName().equalsIgnoreCase(name)) {
				itemType = it;
				break;
			}
		}
		return itemType;
	}

	@Override
	public String validateItemTypeByName(String name) {
		String errorMessage = "";
		ItemType itemType = getItemTypeByName(name);
		if (itemType == null) {
			errorMessage = "ItemType with name: " + name + " does not exist.";
		}
		return errorMessage;
	}

}
