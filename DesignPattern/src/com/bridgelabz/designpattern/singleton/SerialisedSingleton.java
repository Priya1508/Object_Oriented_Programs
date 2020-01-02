package com.bridgelabz.designpattern.singleton;

import java.io.Serializable;

class SerialisedSingleton 
{
    public static class SerializedSingleton implements Serializable
    {
    	 private  long serialVersionUID = -7604766932017737115L;
    	 private SerializedSingleton()
    	 {
    		 
    	 }
         private static  class SingletonHelper
         {
        	 private static  SerializedSingleton instance = new SerializedSingleton();
         }
         public static SerializedSingleton getInstance()
         {
         return SingletonHelper.instance;
         }
    }
}


