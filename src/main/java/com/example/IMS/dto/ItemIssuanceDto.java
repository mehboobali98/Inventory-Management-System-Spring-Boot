package com.example.IMS.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ItemIssuanceDto {
	private long id;

	@NotNull(message = "Item ID is mandatory")
	@Min(value = 1, message = "Item ID must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Item ID must be lesser than " + Long.MAX_VALUE)
	private long itemId;

	@NotNull(message = "Vendor ID is mandatory")
	@Min(value = 1, message = "Vendor ID must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Vendor ID must be lesser than " + Long.MAX_VALUE)
	private long borrowerId;

	@NotNull(message = "Loan Duration is mandatory")
	@Min(value = 1, message = "Loan Duration must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Loan Duration must be lesser than " + 21)
	private long loanDuration;

	@NotNull(message = "Fine Amount is mandatory")
	@Min(value = 0, message = "Fine Amount must be greater than 0")
	@Max(value = (long) Double.MAX_VALUE, message = "Fine Amount must be lesser than " + Double.MAX_VALUE)
	private double fineAmount;
	private String issueDate;
	private String dueDate;
	private String returnDate;

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

	public ItemIssuanceDto(long id, long itemId, long borrowerId, long loanDuration, double fineAmount) {
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

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
