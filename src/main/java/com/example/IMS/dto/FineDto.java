package com.example.IMS.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class FineDto {
	@NotNull(message = "Borrower ID is mandatory")
	@Min(value = 1, message = "Borrower ID must be greater than 0")
	@Max(value = Long.MAX_VALUE, message = "Borrower ID must be lesser than " + Long.MAX_VALUE)
	private long borrowerId;

	private double totalFine;

	@NotNull(message = "Fine Amount Paid is mandatory")
	@Min(value = 0, message = "Fine Amount Paid must be greater than 0")
	@Max(value = (long) Double.MAX_VALUE, message = "Fine Amount Paid must be lesser than " + Double.MAX_VALUE)
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
