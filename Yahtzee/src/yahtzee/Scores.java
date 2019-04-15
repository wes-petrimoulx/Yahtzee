package yahtzee;

public class Scores {
	
	Dice dice = new Dice();
	
	void newRoll() {
		dice.roll();
	}
	
	public int[] getRoll() {
		return dice.diceRolls;
	}
	
	public int ones() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 1) {
				total += 1;
			}
		}
		
		return total;
	}
	
	
	public int twos() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 2) {
				total += 2;
			}
		}
		
		return total;
	}
	
	
	public int threes() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 3) {
				total += 3;
			}
		}
		
		return total;
	}
	
	
	public int fours() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 4) {
				total += 4;
			}
		}
		
		return total;
	}
	
	
	public int fives() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 5) {
				total += 5;
			}
		}
		
		return total;
	}
	
	
	public int sixes() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(dice.diceRolls[i] == 6) {
				total += 6;
			}
		}
		
		return total;
	}
	
	
	public int threeOfKind() {
		int total = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = i+1; j < 4; j++) {
				if(dice.diceRolls[i] == dice.diceRolls[j]) {
					for(int k = j+1; k < 5; k++) {
						if(dice.diceRolls[k] == dice.diceRolls[i]) {
							total = dice.diceRolls[i] * 3;
						}
					}
				}
			}
		}
		
		return total;
	}
	
	
	public int fourOfKind() {
		int total = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = i+1; j < 3; j++) {
				if(dice.diceRolls[i] == dice.diceRolls[j]) {
					for(int k = j+1; k < 4; k++) {
						if(dice.diceRolls[k] == dice.diceRolls[i]) {
							for(int l = k+1; l < 5; l++) {
								if(dice.diceRolls[l] == dice.diceRolls[i]) {
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
	
	
	public int yahtzee() {
		int total = 0;
		int i = 0;
		int j = 1;
		int k = 2;
		int l = 3;
		int h = 4;
		
		if(dice.diceRolls[i] == dice.diceRolls[j]) {
			if(dice.diceRolls[i] == dice.diceRolls[k]) {
				if(dice.diceRolls[i] == dice.diceRolls[l]) {
					if(dice.diceRolls[i] == dice.diceRolls[h]) {
						total = dice.diceRolls[i] * 5;
					}
				}
			}
		}
		
		return total;
	}
}
