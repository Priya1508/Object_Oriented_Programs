package com.bridgelabz.designpattern.proxy;

import java.util.Calendar;

public class InternetProxy implements ISP
{
	/**
	 * A Proxy method to do logging and filtering
	 */
	
	public String getResource(String site)
	{
		this.logRequest(site);
		if(this.isBlocked(site))
		{
			return "This site is blocked as per compnay policy";
		}
		
		NetworkSettings networkSettings=new NetworkSettings();
		return networkSettings.getISP().getResource(site);
	}
	
	private void logRequest(String site)
	{
		System.out.println(Calendar.getInstance().getTime()+"Request for-"+site);
	}
	
	private boolean isBlocked(String site)
	{
		switch(site)
		{
		case "www.google.com" :
			return false;
			
		case "www.yahoo.com" :
			return false;
			
			default:
				return true;
		}
	}
}
