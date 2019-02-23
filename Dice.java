package yahtzee;

import java.util.*;

public class Dice {

	
	public int value;
	public int sum;
	
	public int roll() {
		sum = 0;
		for(int i = 0; i < 5; i++) {
			value =  (int)(6 * Math.random()) + 1;
			System.out.print(value+" ");
			sum += value;
			if(i == 4) {
				System.out.println("");
				System.out.println("Turn Total Score: " + sum);
			}
		}
		return sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	
}