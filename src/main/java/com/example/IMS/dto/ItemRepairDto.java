package com.example.IMS.dto;

public class ItemRepairDto {
	private long item_id;
	private int repair_cost;
	private long vendor_id;
	private double price;

	public ItemRepairDto(){	
	}
	
	public ItemRepairDto(long id, int repair_cost, long vendor_id, double price) {
		super();
		this.item_id = id;
		this.repair_cost = repair_cost;
		this.price = price;
		this.vendor_id = vendor_id;
	}
	
	
	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public long getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(long vendor_id) {
		this.vendor_id = vendor_id;
	}

	public int getRepair_cost() {
		return repair_cost;
	}
	public void setRepair_cost(int repair_cost) {
		this.repair_cost = repair_cost;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
