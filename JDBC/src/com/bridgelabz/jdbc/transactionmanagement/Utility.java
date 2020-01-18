package com.bridgelabz.jdbc.transactionmanagement;

import java.util.Scanner;

public class Utility 
{
	//Creation of scanner object
			static Scanner sc=new Scanner(System.in);
			
			/**
			 * Purpose : static function to check for inputting Integer value
			 * @return Integer of Scanner type
			 */
			public static int inputInteger()
			{
				return(sc.nextInt());
			}
			
			/**
			 * Purpose : static function to check for inputting Boolean value
			 * @return Boolean of Scanner type
			 */
			public static boolean inputBoolean()
			{
				return(sc.nextBoolean());
			}
			
			/**
			 * Purpose: static function to check for inputting Long value
			 * @return Long of Scanner type
			 */
			public static long inputLong()
			{
				return(sc.nextLong());
			}
			
			/**
			 * Purpose : static function to check for inputting Double value
			 * @return Integer of Scanner type
			 */
			public static double inputDouble()
			{
				return(sc.nextDouble());
			}
			
			/**
			 * Purpose : static function to check for inputting string value
			 * @return String of Scanner type
			 */
			public static String inputString()
			{
				return(sc.next());
			}
			
			/**
			 * Purpose : static function to check for inputting single string value
			 * @return String of Scanner type
			 */
			public static String singleString()
			{
				return(sc.nextLine());
			}
			
			/**
			 * Purpose : static function to check for inputting float value
			 * @return Float of Scanner type
			 */
			public static float inputFloat()
			{
				return(sc.nextFloat());
			}
			
			/*
			 * static function to close scanner object
			 */
			public static void closeScanner()
			{
				sc.close();
				
			}
}
