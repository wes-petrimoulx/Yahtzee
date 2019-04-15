package yahtzee;

/*****************************************************************
Logic for rolling multiple dice as a game of yahtzee.

@author Wes Petrimoulx
@version Winter 2019
*****************************************************************/
public class Dice {

	/**stores value roll, displays and adds to sum before overwritten.**/
	public int value = 0;
	
	/**stores value of the sum of all numbers rolled for current turn. **/
	public static int sum = 0;
	
	/** array used to display all values in your current roll in the gui.**/
	public int[] diceRolls = {0,0,0,0,0};
	
	/**************************************************************
	method to "roll" a dice. provides a number 1-6 to be displayed
	@param none
	@return none
	***************************************************************/
	public int roll() {
		sum = 0;
		for (int i = 0; i < 5; i++) {
			value =  (int)(6 * Math.random()) + 1;
			diceRolls[i] = value;
			sum += value;
			
		}
		return sum;
	}
	
	/********************************************************
	method to get the sum of all dice rolled in current turn.
	@param none
	@return integer
	********************************************************/
	public static int getSum() {
		return sum;
	}
	
	
}