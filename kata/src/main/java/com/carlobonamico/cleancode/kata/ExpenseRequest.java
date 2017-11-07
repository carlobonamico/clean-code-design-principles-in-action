package com.carlobonamico.cleancode.kata;

import java.util.ArrayList;
import java.util.List;

class ExpenseRequest {
    private List<Expense> expenses = new ArrayList<Expense>(); 
    private String month; 
    private int year; 
    private String status; 
    
    //TODO add Employee model

    public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}


	@Override
    public String toString() {
        return "expenses";
    }

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}