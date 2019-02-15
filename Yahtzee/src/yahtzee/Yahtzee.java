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
	
	private static Text text;
	private static Text text_2;
	private static Text text_3;
	private static Text text_4;
	private static Text text_5;
	private static Text text_6;
	private static Text text_7;
	private static Text text_8;
	private static Text text_9;
	private static Text text_10;
	private static Text text_11;
	private static Text text_12;
	private static Text text_13;
	private static Text text_14;
	private static Text text_15;
	private static Text text_16;
	private static Text text_17;
	private static Text text_18;
	private static Text text_1;
	private static Text text_19;
	private static Text text_20;
	
	public static void main(String[] args) {
		
		
		//Initial start of program that was scrapped for now,unless Wes implements it.
		/*
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
		*/
		
		//New GUI Implementation
		
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(900, 900);
		shell.setText("SWT Application");
		
		
		  Button btnRoll = new Button(shell, SWT.NONE);
		  btnRoll.addSelectionListener(new SelectionAdapter() {
		  	@Override
		  	public void widgetSelected(SelectionEvent e) {
		  	}
		  });
		
		  
		  //FIX ME: Need to implement logic for the button to re-roll all the numbers.
		btnRoll.setBounds(240, 730, 74, 26);
		btnRoll.setText("Roll");
		
		
		
		Label lblOnes = new Label(shell, SWT.NONE);
		lblOnes.setBounds(10, 30, 81, 25);
		lblOnes.setText("Ones");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText("Twos");
		label.setBounds(10, 95, 81, 25);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText("Threes");
		label_1.setBounds(10, 64, 81, 25);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("Fours");
		label_2.setBounds(10, 126, 81, 25);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("Fives");
		label_3.setBounds(10, 157, 81, 25);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("Sixes");
		label_4.setBounds(10, 188, 81, 25);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("Subtotal");
		label_5.setBounds(10, 219, 81, 25);
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("Bonus");
		label_6.setBounds(10, 250, 81, 25);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("Upper Total");
		label_7.setBounds(10, 281, 99, 25);
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setText("3 of a Kind");
		label_8.setBounds(10, 325, 99, 25);
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setText("4 of a Kind");
		label_9.setBounds(10, 356, 99, 25);
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setText("Full House");
		label_10.setBounds(10, 387, 99, 25);
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setText("Small Straight");
		label_11.setBounds(10, 418, 113, 25);
		
		Label label_12 = new Label(shell, SWT.NONE);
		label_12.setText("Large Straight");
		label_12.setBounds(10, 449, 113, 25);
		
		Label label_13 = new Label(shell, SWT.NONE);
		label_13.setText("Yahtzee");
		label_13.setBounds(10, 481, 81, 25);
		
		Label label_14 = new Label(shell, SWT.NONE);
		label_14.setText("Chance");
		label_14.setBounds(10, 512, 81, 25);
		
		Label label_15 = new Label(shell, SWT.NONE);
		label_15.setText("Bonus Yahtzee");
		label_15.setBounds(10, 543, 113, 25);
		
		Label label_16 = new Label(shell, SWT.NONE);
		label_16.setText("Lower Total");
		label_16.setBounds(10, 574, 99, 25);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(129, 27, 80, 25);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(129, 61, 80, 25);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(129, 92, 80, 25);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(129, 123, 80, 25);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(129, 154, 80, 25);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(129, 185, 80, 25);
		
		text_7 = new Text(shell, SWT.BORDER);
		text_7.setBounds(129, 216, 80, 25);
		
		text_8 = new Text(shell, SWT.BORDER);
		text_8.setBounds(129, 247, 80, 25);
		
		text_9 = new Text(shell, SWT.BORDER);
		text_9.setBounds(129, 278, 80, 25);
		
		text_10 = new Text(shell, SWT.BORDER);
		text_10.setBounds(129, 322, 80, 25);
		
		text_11 = new Text(shell, SWT.BORDER);
		text_11.setBounds(129, 353, 80, 25);
		
		text_12 = new Text(shell, SWT.BORDER);
		text_12.setBounds(129, 384, 80, 25);
		
		text_13 = new Text(shell, SWT.BORDER);
		text_13.setBounds(129, 415, 80, 25);
		
		text_14 = new Text(shell, SWT.BORDER);
		text_14.setBounds(129, 446, 80, 25);
		
		text_15 = new Text(shell, SWT.BORDER);
		text_15.setBounds(129, 478, 80, 25);
		
		text_16 = new Text(shell, SWT.BORDER);
		text_16.setBounds(129, 509, 80, 25);
		
		text_17 = new Text(shell, SWT.BORDER);
		text_17.setBounds(129, 540, 80, 25);
		
		text_18 = new Text(shell, SWT.BORDER);
		text_18.setBounds(129, 571, 80, 25);
		
		Label label_17 = new Label(shell, SWT.NONE);
		label_17.setText("Upper Total");
		label_17.setBounds(10, 619, 99, 25);
		
		Label label_18 = new Label(shell, SWT.NONE);
		label_18.setText("Lower Total");
		label_18.setBounds(10, 650, 99, 25);
		
		Label label_19 = new Label(shell, SWT.NONE);
		label_19.setText("Grand Total");
		label_19.setBounds(10, 681, 99, 25);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(129, 619, 80, 25);
		
		text_19 = new Text(shell, SWT.BORDER);
		text_19.setBounds(129, 650, 80, 25);
		
		text_20 = new Text(shell, SWT.BORDER);
		text_20.setBounds(129, 681, 80, 25);
		
		
		//FIX ME: Need to implement functionality for Save? buttons to save numbers
		
		Button btnSave = new Button(shell, SWT.CHECK);
		btnSave.setBounds(346, 731, 74, 25);
		btnSave.setText("Save?");
		
		Button button = new Button(shell, SWT.CHECK);
		button.setText("Save?");
		button.setBounds(420, 731, 73, 25);
		
		Button button_1 = new Button(shell, SWT.CHECK);
		button_1.setText("Save?");
		button_1.setBounds(499, 731, 72, 25);
		
		Button button_2 = new Button(shell, SWT.CHECK);
		button_2.setText("Save?");
		button_2.setBounds(577, 731, 81, 25);
		
		Button button_3 = new Button(shell, SWT.CHECK);
		button_3.setText("Save?");
		button_3.setBounds(664, 731, 74, 25);
		
		
		
		//FIX ME: Temporary Logic for buttons.
		//currently the buttons just display a random number every time the program is run
		
		int value1;
		int value2;
		int value3;
		int value4;
		int value5;

		
		value1 = (int)(6 * Math.random()) + 1;
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(346, 681, 11, 25);
		lblNewLabel.setText(value1 + " ");
		
		value2 = (int)(6 * Math.random()) + 1;
		Label label_20 = new Label(shell, SWT.NONE);
		label_20.setText(value2+ " ");
		label_20.setBounds(424, 681, 11, 25);
		
		
		value3 = (int)(6 * Math.random()) + 1;
		Label label_21 = new Label(shell, SWT.NONE);
		label_21.setText(value3 + " ");
		label_21.setBounds(499, 681, 11, 25);
		
		value4 = (int)(6 * Math.random()) + 1;
		Label label_22 = new Label(shell, SWT.NONE);
		label_22.setText(value4 + " ");
		label_22.setBounds(582, 681, 11, 25);
		
		
		value5 = (int)(6 * Math.random()) + 1;
		Label label_23 = new Label(shell, SWT.NONE);
		label_23.setText(value5 + " ");
		label_23.setBounds(661, 681, 11, 25);
		
		
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		
	}
}
