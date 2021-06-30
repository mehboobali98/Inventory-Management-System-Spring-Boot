package com.example.IMS.dto;

public class ItemRepairDto {
	private long id;
	private long itemId;
	private long vendorId;
	private double repairCost;
	private double price;

	public ItemRepairDto() {

	}

	public ItemRepairDto(long id, long itemId, long vendorId, double repairCost, double price) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.vendorId = vendorId;
		this.repairCost = repairCost;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getVendorId() {
		return vendorId;
	}

	public void setVendorId(long vendorId) {
		this.vendorId = vendorId;
	}

	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}