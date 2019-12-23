package com.bridgelabz.commercialdataprocessing.model;

public class CompanyDetails 
{
	private String companyName;
	private int numbOfShare;
	private float sharePrice;
	
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}
	public int getNumbOfShare() 
	{
		return numbOfShare;
	}
	public void setNumbOfShare(int numbOfShare) 
	{
		this.numbOfShare = numbOfShare;
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
		return "CompanyDetails [companyName=" + companyName + ", numbOfShare=" + numbOfShare + ", sharePrice="
				+ sharePrice + "]";
	}
}
