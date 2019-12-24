package com.bridgelabz.inventorymanagement.model;

public class Details 
{
	private String Name;
	private long Weight;
	private float Priceperkg;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public long getWeight() 
	{
		return Weight;
	}
	public void setWeight(long weight)
	{
		Weight = weight;
	}
	public float getPriceperkg()
	{
		return Priceperkg;
	}
	public void setPriceperkg(float priceperkg)
	{
		Priceperkg = priceperkg;
	}
	@Override
	public String toString() {
		return "Details [Name=" + Name + ", Weight=" + Weight + ", Priceperkg=" + Priceperkg + "]";
	}
}
