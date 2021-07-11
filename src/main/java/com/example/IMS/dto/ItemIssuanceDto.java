package com.example.IMS.dto;

public class ItemIssuanceDto {
	private long id;
	private long itemId;
	private long borrowerId;
	private long loanDuration;
	private long fineAmount;

	public ItemIssuanceDto() {
	}

	public ItemIssuanceDto(long id, long itemId, long borrowerId, long loanDuration) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.borrowerId = borrowerId;
		this.loanDuration = loanDuration;
		this.fineAmount = 0;
	}
	
	public ItemIssuanceDto(long id, long itemId, long borrowerId, long loanDuration, long fineAmount) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.borrowerId = borrowerId;
		this.loanDuration = loanDuration;
		this.fineAmount = fineAmount;
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

	public long getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public long getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(long loanDuration) {
		this.loanDuration = loanDuration;
	}

	public long getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(long fineAmount) {
		this.fineAmount = fineAmount;
	}

}
