package com.bridgelabz.designpattern.singleton;

public class StaticBlockInitialization 
{
	public static void main(String[] args) 
	{
		StaticBlockSingleton instance=StaticBlockSingleton.getInstance();
	}
}

class StaticBlockSingleton
{
    private static StaticBlockSingleton instance;   
    private StaticBlockSingleton()
    {
         System.out.println("Static Block Initialization created");    
    }   
    //static block initialization for exception handling
    static
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

