package yahtzee;

import java.util.*;

public class Yahtzee {
	
	public static void main(String[] args) {
		
		Decision newDecision = new Decision();
		
		System.out.println("Welcome to Yahtzee! There are 10 turns, each turn having a possible of 3 rolls.");
		
		for(int x = 0; x < 10; x++) {
			newDecision.reRoll();
		}
			
		System.out.println("Thank you for playing!");
	}
}
