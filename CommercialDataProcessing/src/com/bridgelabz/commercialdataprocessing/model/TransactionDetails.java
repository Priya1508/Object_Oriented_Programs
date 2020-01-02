package com.bridgelabz.commercialdataprocessing.model;

import java.time.LocalDateTime;

public class TransactionDetails
{
	private String companyName;
	private int numbOfShareComp;
	private String customerName;
	private int numOfShareCust;
	private LocalDateTime ldt;
	
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	@Override
	public String toString() {
		return "TransactionDetails [companyName=" + companyName + ", numbOfShareComp=" + numbOfShareComp
				+ ", customerName=" + customerName + ", numOfShareCust=" + numOfShareCust + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getNumbOfShareComp() {
		return numbOfShareComp;
	}
	public void setNumbOfShareComp(int numbOfShareComp) {
		this.numbOfShareComp = numbOfShareComp;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getNumOfShareCust() {
		return numOfShareCust;
	}
	public void setNumOfShareCust(int numOfShareCust) {
		this.numOfShareCust = numOfShareCust;
	}
}
