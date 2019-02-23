package yahtzee;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{

	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JLabel item4;
	private JLabel item5;
	public static JList list;
	
	public gui() {
		super("Yahtzee");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Welcome to Yahtzee!");
		add(item1);
		
		item2 = new JLabel("Rules: This game consists of 10 turns, trying to get the highest score at the end of those 10 turns.");
		add(item2);
		
		item3 = new JLabel("You will roll 5 die at the start of your turn. You have the choice to add the sum of all 5 die that were");
		add(item3);
		
		item4 = new JLabel("rolled during your turn to your scorecard, or you may re-roll ONCE to try to get a higher score.");
		add(item4);
		
		item5 = new JLabel("Regardless if your re-roll score is higher or lower, it will be added to your scorecard.");
		add(item5);
		
		
		
	}
}
