package com.example.IMS.dto;

public class ItemRepairDto {
	private long id;
	private long itemId;
	private long vendorId;
	private int repairCost;
	private double price;

	public ItemRepairDto() {

	}

	public ItemRepairDto(long id, long itemId, long vendorId, int repairCost, double price) {
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

	public int getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(int repairCost) {
		this.repairCost = repairCost;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}