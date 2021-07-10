package com.example.IMS.model;

import java.util.Date;

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

	@Column(name = "issue_date")
	private String issueDate;

	@Column(name = "due_date")
	private String dueDate;

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

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

}
