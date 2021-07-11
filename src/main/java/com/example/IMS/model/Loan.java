package com.example.IMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private long id;

	@Column(name = "loan_duration")
	private long loanDuration;

	@Column(name = "issue_date")
	private String issueDate;

	@Column(name = "fine_amount")
	private double fineAmount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public long getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(long loanDuration) {
		this.loanDuration = loanDuration;
	}

}
