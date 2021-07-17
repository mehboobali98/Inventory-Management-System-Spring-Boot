package com.example.IMS.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.IMS.dto.ItemDto;
import com.example.IMS.model.Item;

@Component
public class ItemConvertor {

	public ItemDto modelToDto(Item item) {
		ItemDto itemDto = new ItemDto();
		itemDto.setItemId(item.getId());
		itemDto.setFineRate(item.getFineRate());
		itemDto.setItemPrice(item.getPrice());
		itemDto.setInvoiceNumber(item.getInvoiceNumber());
		itemDto.setItemName(item.getName());
		itemDto.setItemQuantity(item.getQuantity());
		try {
			itemDto.setItemType(item.getItemType().getTypeName());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Caught in Item Convertor.");
			itemDto.setItemType("-");
		}
		try {
			itemDto.setVendorName(item.getVendor().getName());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Caught in Item Convertor.");
			itemDto.setVendorName("-");
		}

		return itemDto;
	}

	public List<ItemDto> modelToDto(List<Item> itemList) {
		List<ItemDto> itemDtoList = new ArrayList<>();
		for (Item item : itemList) {
			itemDtoList.add(modelToDto(item));
		}
		return itemDtoList;
	}

	public Item dtoToModel(ItemDto itemDto) {
		Item item = new Item();
		item.setFineRate(itemDto.getFineRate());
		item.setInvoiceNumber(itemDto.getInvoiceNumber());
		item.setQuantity(itemDto.getItemQuantity());
		item.setPrice(itemDto.getItemPrice());
		item.setName(itemDto.getItemName());
		return item;
	}
}
