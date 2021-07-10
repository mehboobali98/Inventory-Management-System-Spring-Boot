package com.example.IMS.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ItemIssuanceDto {
	private long id;
	private long itemId;
	private long borrowerId;
	private double fineAmount;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date issueDate;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dueDate;

	public ItemIssuanceDto() {
	}

	public ItemIssuanceDto(long id, long itemId, long borrowerId, double fineAmount, Date issueDate,
			Date dueDate) {
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

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
