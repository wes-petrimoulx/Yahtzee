package yahtzee;

/*****************************************************************
Scores class calculates scores to be updated on GUI.
*****************************************************************/
public class Scores {
	
	/**Creates dice object to be used to calculate scores.**/
	Dice dice = new Dice();
	
	/*****************************************************************
    New roll method rolls a set of 5 dice for current round.
    *****************************************************************/
	void newRoll() {
		dice.roll();
	}
	
	/*****************************************************************
    Get roll allows total score to be used for scoring purposes.
    @return an array of integers(a turn roll)
    *****************************************************************/
	public int[] getRoll() {
		return dice.diceRolls;
	}
	
	/*****************************************************************
    Calculates the score for the ones category.
    @return total integer for ones category
    *****************************************************************/
	public int ones() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 1) {
				total += 1;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the twos category.
    @return total integer for twos category
    *****************************************************************/
	public int twos() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 2) {
				total += 2;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the threes category.
    @return total integer for threes category
    *****************************************************************/
	public int threes() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 3) {
				total += 3;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the fours category.
    @return total integer for fours category
    *****************************************************************/
	public int fours() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 4) {
				total += 4;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the fives category.
    @return total integer for fives category
    *****************************************************************/
	public int fives() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 5) {
				total += 5;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the sixes category.
    @return total integer for sixes category
    *****************************************************************/
	public int sixes() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			if (dice.diceRolls[i] == 6) {
				total += 6;
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the three of a kind category.
    @return total integer for three of a kind category
    *****************************************************************/
	public int threeOfKind() {
		int total = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 4; j++) {
				if (dice.diceRolls[i] == dice.diceRolls[j]) {
					for (int k = j+1; k < 5; k++) {
						if (dice.diceRolls[k] == dice.diceRolls[i]) {
							total = dice.diceRolls[i] * 3;
						}
					}
				}
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the four of a kind category.
    @return total integer for four of a kind category
    *****************************************************************/
	public int fourOfKind() {
		int total = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = i+1; j < 3; j++) {
				if (dice.diceRolls[i] == dice.diceRolls[j]) {
					for (int k = j+1; k < 4; k++) {
						if (dice.diceRolls[k] == dice.diceRolls[i]) {
							for (int l = k+1; l < 5; l++) {
								if (dice.diceRolls[l] == dice.diceRolls[i]) {
									total = dice.diceRolls[i] * 4;
								}
							}
						}
					}
				}
			}
		}
		
		return total;
	}
	
	/*****************************************************************
    Calculates the score for the yahtzee category.
    @return total integer for yahtzee category
    *****************************************************************/
	public int yahtzee() {
		int total = 0;
		int i = 0;
		int j = 1;
		int k = 2;
		int l = 3;
		int h = 4;
		
		if (dice.diceRolls[i] == dice.diceRolls[j]) {
			if (dice.diceRolls[i] == dice.diceRolls[k]) {
				if (dice.diceRolls[i] == dice.diceRolls[l]) {
					if (dice.diceRolls[i] == dice.diceRolls[h]) {
						total = dice.diceRolls[i] * 5;
					}
				}
			}
		}
		
		return total;
	}
}
