package com.bridgelabz.designpattern.proxy;

public class Vodafone implements ISP
{
	@Override
	public String getResource(String site)
	{
	switch(site)
	{
	case "www.google.com":
		return "GOOOOOOGLE";
		
	case "www.yahoo.com":
		return "Yahoooooo";
		
		default:
			return "Sorry no resource found";
	}
	}
}
