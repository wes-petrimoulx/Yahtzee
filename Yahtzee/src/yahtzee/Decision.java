package yahtzee;

import java.util.*;

public class Decision {

	Dice newDice = new Dice();
	Scanner sc = new Scanner(System.in);
	int[] score = {0,0,0,0,0,0,0,0,0,0};
	
	
	void reRoll() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Here is your roll: ");
		newDice.roll();
		makeDecision();
	}
	
	void makeDecision() {
		System.out.println("You may re-roll your die once, regardless if score is lower or higher, it will be ");
		System.out.println("added to your scorecard. Would you like to roll your die again?");
		System.out.println("If no, Turn Total Score will be added to scorecard (y/n): ");
		String name = sc.nextLine();
		
		if(name.equals("y")) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Here is your roll: ");
			newDice.roll();
			int turn = newDice.getSum();
			System.out.println("");
			System.out.println("Score added to scorecard: " + turn);
			for(int j = 0; j < 10; j++) {
				if(score[j] == 0) {
					score[j] = turn;
					break;
				}
			}
			int scorecardTotal = 0;
			for(int u = 0; u < 10; u++) {
				scorecardTotal += score[u];
			}
			System.out.println("This is your current scorecard: ");
			System.out.println(Arrays.toString(score));
			System.out.println("Your Total Score on Scorecard is: " + scorecardTotal);
			System.out.println("");
		}
		else if(name.equals("n")) {
			int turn = newDice.getSum();
			System.out.println("");
			System.out.println("Score added to scorecard: " + turn);
			for(int j = 0; j < 10; j++) {
				if(score[j] == 0) {
					score[j] = turn;
					break;
				}
			}
			int scorecardTotal = 0;
			for(int u = 0; u < 10; u++) {
				scorecardTotal += score[u];
			}
			System.out.println("This is your current scorecard: ");
			System.out.println(Arrays.toString(score));
			System.out.println("Your Total Score on Scorecard is: " + scorecardTotal);
			System.out.println("");
		}
		else {
			System.out.println("Error, please use 'y' or 'n' to make decision.");
			makeDecision();
		}
	}
}
