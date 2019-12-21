package com.bridgelabz.stockmanagement.model;

public class StockDetails
{
	private String name;
	private int numOfShare;
	private float sharePrice;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNumOfShare() 
	{
		return numOfShare;
	}
	public void setNumOfShare(int numOfShare) 
	{
		this.numOfShare = numOfShare;
	}
	public float getSharePrice() 
	{
		return sharePrice;
	}
	public void setSharePrice(float sharePrice)
	{
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() 
	{
		return "StockDetails [name=" + name + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice + "]";
	}
}
