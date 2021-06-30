package com.example.IMS.convertor;

import org.springframework.stereotype.Component;

import com.example.IMS.dto.ItemRepairDto;
import com.example.IMS.model.ItemRepair;

@Component
public class ItemRepairConvertor {

	public ItemRepairDto modelToDto(ItemRepair item) {
		ItemRepairDto itemRepairDto = new ItemRepairDto();
		itemRepairDto.setItem_id(item.getItem().getId());
		itemRepairDto.setPrice(item.getPrice());
		itemRepairDto.setRepair_cost(item.getCost());
		itemRepairDto.setVendor_id(item.getVendor().getId());
		return itemRepairDto;
	}

	public ItemRepair DtoToModel(ItemRepairDto item) {
		ItemRepair itemRepair = new ItemRepair();
		itemRepair.setCost(item.getRepair_cost());
		itemRepair.setPrice(item.getPrice());
		return itemRepair;
	}
}
