package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your starting amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What's your win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What's your win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many times do you want to simulate?");
		int totalSimulations = in.nextInt(); 
		int day;
		for(day=0; day < totalSimulations; day++) {
			double newAmount = startAmount;
			while (newAmount >0 && newAmount < winLimit) {
			double x= Math.random();
			
			if (x< winChance) { 
				newAmount= startAmount +1 ;
			} 
			else { 
				newAmount = startAmount -1; 
			}
		}
			if (newAmount==0) {
				System.out.println("You lose.");
			}
			else {
				System.out.println("You win");
				
			}
		}
		if (winChance == 0.5) {
		double expectedRuin = 1 - (startAmount / winLimit);
		}	
		else {
			double y = (1 - winChance) / winChance ;
			double 
			expectedRuin = (Math.pow(y, startAmount)-Math.pow(y, winLimit))/(1-Math.pow(y, winLimit));
		}
		}
}
