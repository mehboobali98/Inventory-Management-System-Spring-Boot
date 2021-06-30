package com.example.IMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.ItemRepair;
import com.example.IMS.repository.IItemRepairRepository;

@Service
public class ItemRepairService implements IItemRepairService {

	@Autowired
	private IItemRepairRepository itemRepairRepository;
	
	@Override
	public List<ItemRepair> getAllRepairItems() {
		// TODO Auto-generated method stub
		return itemRepairRepository.findAll();
	}
	
	@Override
	public void saveItemRepair(ItemRepair itemRepair)
	{
		this.itemRepairRepository.save(itemRepair);
	}

}
