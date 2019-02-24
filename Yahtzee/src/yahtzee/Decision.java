package yahtzee;

import java.util.*;


public class Decision {

	Dice newDice = new Dice();
	Scanner sc = new Scanner(System.in);
	public static int[] score = {0,0,0,0,0,0,0,0,0,0};
	public static int scoreSum = 0;
	
	
	void roll() {
		newDice.roll();
	}
	
	void reRoll() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Here is your roll: ");
		newDice.roll();
	}
	
	void decisionYes() {
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
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		newDice.roll();
	}
	
	void decisionNo() {
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
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		newDice.roll();
	}
	
	public int sumScore() {
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		return scoreSum;
	}
	
	
	
	
}
