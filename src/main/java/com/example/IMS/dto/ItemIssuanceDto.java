package com.example.IMS.dto;

import java.sql.Timestamp;

public class ItemIssuanceDto {
	private long id;
	private long itemId;
	private long borrowerId;
	private double fineAmount;
	private Timestamp issueDate;
	private Timestamp dueDate;

	public ItemIssuanceDto() {
	}

	public ItemIssuanceDto(long id, long itemId, long borrowerId, double fineAmount, Timestamp issueDate,
			Timestamp dueDate) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.borrowerId = borrowerId;
		this.fineAmount = fineAmount;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
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

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Timestamp getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

}
