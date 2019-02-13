package yahtzee;

import java.util.*;

public class Yahtzee {
	
	public static void main(String[] args) {
		
		Dice newDice = new Dice();
		Scanner sc = new Scanner(System.in);
		
		
			for(int i = 0; i < 5; i++) {
				int num = newDice.roll();
				System.out.print(num + " ");
				if(i == 4) {
					System.out.println("");
				}
			}
			
			
			
			System.out.print("Would you like to roll again? (y/n): ");
			String name = sc.nextLine();
			
			if(name.equals("y")) {
				for(int i = 0; i < 5; i++) {
					int num = newDice.roll();
					System.out.print(num + " ");
					if(i == 4) {
						System.out.println("");
					}
				}
			}
			else if(name.equals("n")) {
				System.out.print("okay");
			}
			else {
				System.out.print("error");
			}
			
		
	}
}
