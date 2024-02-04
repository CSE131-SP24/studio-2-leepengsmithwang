package studio2;

import java.util.Scanner;

public class RuinTwo {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in) ;
			
			// starting amt
			System.out.println ("what is your starting amount?") ;
			int startAmount = in.nextInt() ;
			// win chance
			System.out.println ("what is your win chance?") ;
			double winChance = in.nextDouble() ;
			
			// win limit
			System.out.println ("what is your win limit?") ;
			int winLimit = in.nextInt() ;
			
			
			System.out.println ("how many days do you want to play?") ;
			int totalSimulation = in.nextInt () ;
			
			int day = 0 ;
			int loses = 0 ;
			int wins = 0 ;
			
		for (int i = 0; i < totalSimulation; i++){
			
			day ++ ;
			
			int amt = startAmount ;
			
			int plays = 0 ;
			
			while (amt > 0 && amt < winLimit) {
			
				plays ++ ;
				
				//System.out.println ("your current balance is $" + amt ) ; 
				if ( Math.random () < winChance) {
					amt ++ ;
					//System.out.println ("you won $1 :)") ;
				}
				else {
					amt -- ;
					// System.out.println ("you lost $1 :(") ;
				}
			
			}
			
			//System.out.println ("you played " + plays + "times! ") ;
			if ( amt == 0 ) {
				loses ++ ;
				System.out.println ("on day " + day + " you lost in " + plays + " plays");
				//System.out.println ("your current balance is $0") ;
				//System.out.println ("you lost all your money. lame !") ;
			} 
			else {
				wins ++ ;
				System.out.println ("on day " + day + " you won in " + plays + " plays");
				//System.out.println ("your current balance is $" + winLimit );
				//System.out.println ("you met your win limit. yay !") ;
			}
		}
		double expectedRuin ;
		if (winChance == 0.5) {
			expectedRuin = 1 - startAmount/winLimit ;
		}
		else {
			double a = (1-winChance)/winChance;
			expectedRuin = (Math.pow(a,startAmount)-Math.pow(a, winLimit)) / (1-Math.pow(a, winLimit)) ;
		}
		
		//final report
		System.out.println () ;
		System.out.println ("total simulations : " + totalSimulation) ;
		System.out.println ("total loses : " + loses) ;
		System.out.println ("total wins : " + wins) ;
		
		System.out.println ("expected ruin was " + expectedRuin) ;
		System.out.println ("actual ruin was " + (double) loses/totalSimulation) ;
		
	}

}
