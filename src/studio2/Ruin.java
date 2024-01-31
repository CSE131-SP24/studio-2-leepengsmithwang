package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		//inserted scanner thing
		Scanner in = new Scanner(System.in);
		
		//initialize variables 
		System.out.println("How much are you starting with?");
		int startAmount = in.nextInt();
		System.out.println("What do you want your win chance to be (*remember you want to optimize!)?");
		double winChance = in.nextDouble();
		System.out.println("Enter an amount that you feel comfortable with leaving for the day: ");
		int winLimit = in.nextInt();
		
		System.out.println("Welcome to the game. You are starting off with " + startAmount + ".");
		while (startAmount>0 && winLimit>startAmount)
		
		//System.out.println("Would you like to continue the game?");
		//boolean yesNo = in.nextBoolean();
		{
		if (Math.random() <= winChance)
		{
			
			startAmount++;
		}
		else
		{	startAmount--;
		
		
		}
		System.out.println("Your Win Chance is " + winChance);
		
		
		
	}
		}
}
	

