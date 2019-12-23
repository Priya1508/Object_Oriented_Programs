package com.bridgelabz.commercialdataprocessing.model;

public class CustomerDetails 
{
	private String customerName;
	private int numOfShare;
	private float shareprice;
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public int getNumOfShare() 
	{
		return numOfShare;
	}
	public void setNumOfShare(int numOfShare)
	{
		this.numOfShare = numOfShare;
	}
	public float getShareprice() 
	{
		return shareprice;
	}
	public void setShareprice(float shareprice)
	{
		this.shareprice = shareprice;
	}
	
	public String toString() 
	{
		return "CustomerDetails [customerName=" + customerName + ", numOfShare=" + numOfShare + ", shareprice="
				+ shareprice + "]";
	}
}
