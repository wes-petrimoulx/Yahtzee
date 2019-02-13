package yahtzee;

import java.util.*;

public class Dice {

	
	private int value;
	
	public int roll() {
		value =  (int)(6 * Math.random()) + 1;
		return value;
	}
	
	
}
