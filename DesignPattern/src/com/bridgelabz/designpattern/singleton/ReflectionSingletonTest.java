package com.bridgelabz.designpattern.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest
{
    public static void main(String[] args) {
    	Abc instanceOne = Abc.getInstance();
    	Abc instanceTwo = null;
        try 
        {
            Constructor[] constructors = Abc.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Abc) constructor.newInstance();
                break;
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

