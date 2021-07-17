package com.example.IMS.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Inventory_item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private long id;

	@Column(name = "item_quantity")
	private int quantity;

	@Column(name = "item_price")
	private double price;

	@Column(name = "item_fine_rate")
	private double fineRate;

	@Column(name = "item_name")
	private String name;

	@Column(name = "item_invoice_number")
	private long invoiceNumber;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	private List<Loan> loan = new ArrayList<>();

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_type_fk")
	private ItemType itemType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendor_id_fk")
	private Vendor vendor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getFineRate() {
		return fineRate;
	}

	public void setFineRate(double fineRate) {
		this.fineRate = fineRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}

	public void addLoan(Loan newLoan) {
		this.loan.add(newLoan);
		newLoan.setItem(this);
	}

	public void removeLoan(Loan newLoan) {
		this.loan.remove(newLoan);
		newLoan.setBorrower(null);
	}

	public void descreaseQuantity() {
		quantity--;
	}

	public void increaseQuantity() {
		quantity++;
	}

}
