package com.example.IMS.dto;

public class FineDto {
	private long borrowerId;
	private double totalFine;
	private double finePaid;

	public FineDto() {
	}

	public FineDto(long borrowerId) {
		super();
		this.borrowerId = borrowerId;
	}

	public long getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(long borrowerId) {
		this.borrowerId = borrowerId;
	}

	public double getTotalFine() {
		return totalFine;
	}

	public void setTotalFine(double totalFine) {
		this.totalFine = totalFine;
	}

	public double getFinePaid() {
		return finePaid;
	}

	public void setFinePaid(double finePaid) {
		this.finePaid = finePaid;
	}

}
