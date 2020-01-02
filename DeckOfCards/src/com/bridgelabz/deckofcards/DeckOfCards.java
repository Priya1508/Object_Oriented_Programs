package com.bridgelabz.deckofcards;

import java.util.Random;

public class DeckOfCards 
{
	public static void main(String[] args) 
	{
		String[] suit = { "Clubs", "Diamonds", "Heart", "Spade" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Ace", "King", "Queen" };
		//TO GIVE PRINT TOTAL CARDS WITHOUT SHUFFLING
		int n = suit.length * rank.length;
		String deck[] = new String[n];
		int i = 0, j = 0;
		
		for (i = 0; i < rank.length; i++) 
		{
			for (j = 0; j < suit.length; j++)
			{
				deck[suit.length * i + j] = rank[i] + " of " + suit[j];
			}
		}
		System.out.println("Before shuffling the cards");
		for (i = 0; i < n; i++) 
		{
			System.out.println((int) Math.random() + deck[i] + " ");
		}
		System.out.println();
		//TO SHUFFLE THE DECK OF CARDS
		System.out.println("======================");
		System.out.println("After shuffling the cards");
	    Random rand=new Random();
		for(i = 0 ; i < n ; i++)
		{
		    int r = i + rand.nextInt(n-i);
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		for(i = 0; i < n; i++)
		{
			System.out.println(deck[i] + " ");
		}
		System.out.println();
        //DISTRIBUTION OF CARDS TO THE PLAYERS
		System.out.println("====================");
		System.out.println("Cards for 1st player");
		for (i = 0; i < 9; i++) 
		{
			String player1 = (int) Math.random() + deck[i];
			System.out.println(player1);
		}
		System.out.println("==================");
		System.out.println("Cards for player2");
		for (i = 9; i < 18; i++) {
			
			String player2 = (int) Math.random() + deck[i];
			System.out.println(player2);
		}
		System.out.println("====================");
		System.out.println("Cards for player3");
		for (i = 18; i < 27; i++) 
		{
			String player3 = (int) Math.random() + deck[i];
			System.out.println(player3);
		}
		System.out.println("======================");
		System.out.println("Cards for player 4");
		for (i = 27; i < 36; i++) 
		{
			String player4=(int) Math.random() + deck[i];
			System.out.println(player4);
		}
	}
}
