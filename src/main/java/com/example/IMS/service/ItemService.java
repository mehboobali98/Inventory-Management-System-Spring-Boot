package com.example.IMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.Item;
import com.example.IMS.model.Loan;
import com.example.IMS.repository.IItemRepository;

@Service
public class ItemService implements IItemService {
	@Autowired
	private IItemRepository itemRepository;

	@Override
	public Item getItemById(long id) {
		Optional<Item> optional = itemRepository.findById(id);
		Item item = null;
		if (optional.isPresent()) {
			item = optional.get();
		} else {
			// Exception
		}
		return item;
	}

	@Override
	public String validateItemId(long id) {
		String errorMessage = "";
		Item item = getItemById(id);
		if (item == null) {
			errorMessage = "Item id does not exist";
		}
		return errorMessage;
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public long findItemIdByLoanId(long loanId) {
		List<Item> itemList = getAllItems();
		List<Loan> loanList;
		boolean found = false;
		long itemId = -1;
		for (Item item : itemList) {
			loanList = item.getLoan();
			for (Loan loan : loanList) {
				if (loan.getId() == loanId) {
					itemId = item.getId();
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		return itemId;
	}

}
