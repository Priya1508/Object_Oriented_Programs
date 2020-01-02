package com.bridgelabz.designpattern.singleton;

public class BillPughSingleton
{
	public static void main(String[] args)
	{
		BillPugh obj=BillPugh.getInstance();
	}
}

class BillPugh
{
    private BillPugh()
    {
    	System.out.println("Bill Pugh Instance");
    }
    private static class BillPughInner
    {
        private static BillPugh instance = new BillPugh();
    }
   
    public static BillPugh getInstance()
    {
        return BillPughInner.instance;
    }
}

