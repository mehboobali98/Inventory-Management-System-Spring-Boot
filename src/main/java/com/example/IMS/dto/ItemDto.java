package com.example.IMS.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ItemDto {

	private long itemId;

	@NotNull(message = "Item quantity is mandatory.")
	@Min(value = 1, message = "Item quantity must be greater than 0.")
	@Max(value = Integer.MAX_VALUE, message = "Item quantity must be lesser than " + Integer.MAX_VALUE)
	private int itemQuantity;

	@NotNull(message = "Invoice number is mandatory.")
	@Min(value = 1, message = "Invoice must be greater than 0.")
	@Max(value = Long.MAX_VALUE, message = "Invoice number must be lesser than " + Long.MAX_VALUE)
	private long invoiceNumber;

	@NotNull(message = "Item price is mandatory.")
	@Min(value = 1, message = "Item price must be greater than 0.")
	@Max(value = (long) Double.MAX_VALUE, message = "Item price must be lesser than " + Double.MAX_VALUE)
	private double itemPrice;

	@NotNull(message = "Fine rate is mandatory.")
	@Min(value = 1, message = "Fine rate must be greater than 0.")
	@Max(value = (long) Double.MAX_VALUE, message = "Fine rate must be lesser than " + Double.MAX_VALUE)
	private double fineRate;

	@NotNull(message = "Item name is mandatory.")
	@Pattern(regexp = "(^[A-Za-z]{3,16})([ ]{0,1})([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?", message = "Item name can only contain alphabets.")
	private String itemName;

	private String itemType;

	@NotNull(message = "Item name is mandatory.")
	@Pattern(regexp = "(^[A-Za-z]{3,16})([ ]{0,1})([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?([ ]{0,1})?([A-Za-z]{3,16})?", message = "Vendor name can only contain alphabets.")
	private String vendorName;

	public ItemDto() {

	}

	public ItemDto(long itemId, int itemQuantity, double itemPrice, double fineRate, String itemName,
			long invoiceNumber, String itemType, String vendorName) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.fineRate = fineRate;
		this.itemName = itemName;
		this.invoiceNumber = invoiceNumber;
		this.itemType = itemType;
		this.vendorName = vendorName;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getFineRate() {
		return fineRate;
	}

	public void setFineRate(double fineRate) {
		this.fineRate = fineRate;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}
