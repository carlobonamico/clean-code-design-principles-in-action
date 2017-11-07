package com.carlobonamico.cleancode.kata;

import java.math.BigDecimal;
import java.util.Date;


class Expense {
	private String id;
	private String category;
	private BigDecimal amount;
	private boolean hasDocument;
	
	private Date day;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public boolean isHasDocument() {
		return hasDocument;
	}

	public void setHasDocument(boolean hasDocument) {
		this.hasDocument = hasDocument;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

}