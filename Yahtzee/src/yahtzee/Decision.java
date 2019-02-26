package yahtzee;

import java.util.*;


public class Decision {

	/** creates type dice to all decision to class to roll in certain decisions**/
	Dice newDice = new Dice();
	
	/** array of values in users scorecard that are displayed in the gui **/
	public static int[] score = {0,0,0,0,0,0,0,0,0,0};
	
	/** integer value of the sum of all values in the scorecard that are displayed in the gui **/
	public static int scoreSum = 0;
	
	/************************************************
	does a new roll of dice. currently rolls all dice
	@param none
	@return none
	************************************************/
	void newRoll() {
		newDice.roll();
	}
	
	/************************************************
	allows the gui to re-roll if the user wants to. 
	@param none
	@return none
	************************************************/
	void decisionYes() {
		newRoll();
		int turn = newDice.getSum();
		for(int j = 0; j < 10; j++) {
			if(score[j] == 0) {
				score[j] = turn;
				break;
			}
		}
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		newRoll();
	}
	
	/****************************************************************
	allows gui to move to next turn and not re-roll if user wants to
	@param none
	@return none
	*****************************************************************/
	void decisionNo() {
		int turn = newDice.getSum();
		for(int j = 0; j < 10; j++) {
			if(score[j] == 0) {
				score[j] = turn;
				break;
			}
		}
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		newRoll();
	}
	
	/*************************************************************
	Gets the summ of the entire scorecard for referance in the gui
	@param none
	@return none
	**************************************************************/
	public int sumScore() {
		scoreSum = 0;
		for(int x = 0; x < score.length; x++) {
			scoreSum += score[x];
		}
		return scoreSum;
	}
	
}
