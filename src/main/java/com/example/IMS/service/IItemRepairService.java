package com.example.IMS.service;

import java.util.List;
import com.example.IMS.model.ItemRepair;

public interface IItemRepairService {
	List<ItemRepair> getAllRepairItems();

	void saveItemRepair(ItemRepair itemRepair);

	void deleteItemRepairById(long id);

	ItemRepair findItemRepairById(long id);
}