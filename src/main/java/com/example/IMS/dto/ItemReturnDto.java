package com.example.IMS.dto;

public class ItemReturnDto {
	private long itemId;
	private long borrowerId;
	private String returnDate;

	public ItemReturnDto() {

	}

	public ItemReturnDto(long itemId, long borrowerId, String returnDate) {
		super();
		this.itemId = itemId;
		this.borrowerId = borrowerId;
		this.returnDate = returnDate;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
