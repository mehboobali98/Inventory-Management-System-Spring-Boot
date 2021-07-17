package com.example.IMS.dto;

public class ItemDto {

	private long itemId;

	private int itemQuantity;

	private long invoiceNumber;

	private double itemPrice;

	private double fineRate;

	private String itemName;

	private String itemType;

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
