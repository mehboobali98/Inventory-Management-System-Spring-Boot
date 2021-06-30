package com.example.IMS.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ItemRepairDto {

	private long id;

	@NotNull(message = "Item ID is mandatory")
	@Min(value = 1, message = "Item ID must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Item ID must be lesser than " + Long.MAX_VALUE)
	private long itemId;

	@NotNull(message = "Vendor ID is mandatory")
	@Min(value = 1, message = "Vendor ID must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Vendor ID must be lesser than " + Long.MAX_VALUE)
	private long vendorId;

	@NotNull(message = "Repair Cost is mandatory")
	@Min(value = 1, message = "Repair Cost must be greater than 0")
	@Max(value = (long) Double.MAX_VALUE, message = "Repair Cost must be lesser than " + Double.MAX_VALUE)
	private double repairCost;

	@NotNull(message = "Item Price is mandatory")
	@Min(value = 1, message = "Item Price must be greater than 0")
	@Max(value = (long) Double.MAX_VALUE, message = "Item Price must be lesser than " + Double.MAX_VALUE)
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