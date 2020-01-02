package com.bridgelabz.designpattern.prototype;

public class PrototypeMain
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop bs=new BookShop();  
		bs.setShopname("Novelty");
		bs.loadData();
		
		BookShop bs1=bs.clone(); 
		//bs.getBooks().remove(2);
		bs1.setShopname("A1");
		System.out.println(bs);
		System.out.println(bs1);

	}
}
