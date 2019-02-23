package yahtzee;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.*;

public class Yahtzee {
	
	
	public static void main(String[] args) {
		
		
		//Initial start of program 
		
		Decision newDecision = new Decision();
		
		System.out.println("Welcome to Yahtzee!");
		System.out.println("Rules: This game consists of 10 turns, trying to get the highest score at the end of those 10 turns.");
		System.out.println("You will roll 5 die at the start of your turn. You have the choice to add the sum of all 5 die that were");
		System.out.println("rolled during your turn to your scorecard, or you may re-roll ONCE to try to get a higher score.");
		System.out.println("Regardless if your re-roll score is higher or lower, it will be added to your scorecard.");
		
		for(int x = 0; x < 10; x++) {
			newDecision.reRoll();
		}
			
		System.out.println("Thank you for playing!");
		
		
	
		
		
	}
}
