package yahtzee;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{

	/** Text that appears at the top of the gui **/
	private JLabel item1, item2, item3, item4, item5, item6, item7, item8, item9;

	/** Dice that are being displayed in the gui(the numbers that say roll) **/
	private JLabel die1, die2, die3, die4, die5;
	
	/** Values for the scorecard in the gui, displays scores from all turns taken **/
	private JLabel score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
	
	/** sum value used to show sum of your current roll and total sum at the end of game **/
	private JLabel sum1, sum2;
	
	/** count to make sure proper number of turns occur **/
	public int count = 0;
	
	/** used to call methods from decision class **/
	Decision decision = new Decision();
	
	
	public gui() {
		
		/** all text and window name that is in the gui**/
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
		
		/** button used to start the game when launched **/
		Button start = new Button("Start");
		add(start);
		
		/** values of the dice rolled on your turn are displayed here **/
		item6 = new JLabel("Here is your roll. Would you like to re-roll?");
		add(item6);
		
		die1 = new JLabel(String.valueOf(Dice.diceRolls[0]));
		add(die1);
		
		die2 = new JLabel(String.valueOf(Dice.diceRolls[1]));
		add(die2);
		
		die3 = new JLabel(String.valueOf(Dice.diceRolls[2]));
		add(die3);
		
		die4 = new JLabel(String.valueOf(Dice.diceRolls[3]));
		add(die4);
		
		die5 = new JLabel(String.valueOf(Dice.diceRolls[4]));
		add(die5);
		
		item8 = new JLabel("Sum of roll: ");
		add(item8);
		
		sum1 = new JLabel(String.valueOf(Dice.sum));
		add(sum1);
		
		/** allows user to make decision about whether they want to re-roll or not**/
		Button yes = new Button("Yes");
		add(yes);
		
		Button no = new Button("No");
		add(no);
		
		/** all scores displayed from all turns taken throughout the game **/
		item7 = new JLabel("                                            Here is your current Scorecard: ");
		add(item7);
		
		score1 = new JLabel(String.valueOf(Decision.score[0]));
		add(score1);
		
		score2 = new JLabel(String.valueOf(Decision.score[1]));
		add(score2);
	
		score3 = new JLabel(String.valueOf(Decision.score[2]));
		add(score3);
		
		score4 = new JLabel(String.valueOf(Decision.score[3]));
		add(score4);
		
		score5 = new JLabel(String.valueOf(Decision.score[4]));
		add(score5);
		
		score6 = new JLabel(String.valueOf(Decision.score[5]));
		add(score6);
		
		score7 = new JLabel(String.valueOf(Decision.score[6]));
		add(score7);
		
		score8 = new JLabel(String.valueOf(Decision.score[7]));
		add(score8);
		
		score9 = new JLabel(String.valueOf(Decision.score[8]));
		add(score9);
		
		score10 = new JLabel(String.valueOf(Decision.score[9]));
		add(score10);
		
		item9 = new JLabel("Sum of Scorecard: ");
		add(item9);
		
		sum2 = new JLabel(String.valueOf(Decision.scoreSum));
		add(sum2);
		
		/** makes sure you cant roll before you hit the start button **/
		yes.setEnabled(false);
		
		no.setEnabled(false);
		
		/** logic for the yes button **/
		yes.addActionListener(e -> {
			decision.decisionYes();
			count++;
			if(count == 10) {
				JOptionPane.showMessageDialog(null, "End of Game. Final score: " + decision.sumScore());
				yes.setEnabled(false);
				no.setEnabled(false);
			}
			die1.setText(String.valueOf(Dice.diceRolls[0]));
			die2.setText(String.valueOf(Dice.diceRolls[1]));
			die3.setText(String.valueOf(Dice.diceRolls[2]));
			die4.setText(String.valueOf(Dice.diceRolls[3]));
			die5.setText(String.valueOf(Dice.diceRolls[4]));
			sum1.setText(String.valueOf(Dice.sum));
			sum2.setText(String.valueOf(Decision.scoreSum));
			score1.setText(String.valueOf(Decision.score[0]));
			score2.setText(String.valueOf(Decision.score[1]));
			score3.setText(String.valueOf(Decision.score[2]));
			score4.setText(String.valueOf(Decision.score[3]));
			score5.setText(String.valueOf(Decision.score[4]));
			score6.setText(String.valueOf(Decision.score[5]));
			score7.setText(String.valueOf(Decision.score[6]));
			score8.setText(String.valueOf(Decision.score[7]));
			score9.setText(String.valueOf(Decision.score[8]));
			score10.setText(String.valueOf(Decision.score[9]));
			});
		
		/** logic for the no button **/
		no.addActionListener(e -> {
			decision.decisionNo();
			count++;
			if(count == 10) {
				JOptionPane.showMessageDialog(null, "End of Game. Final score: " + decision.sumScore());
				yes.setEnabled(false);
				no.setEnabled(false);
			}
			die1.setText(String.valueOf(Dice.diceRolls[0]));
			die2.setText(String.valueOf(Dice.diceRolls[1]));
			die3.setText(String.valueOf(Dice.diceRolls[2]));
			die4.setText(String.valueOf(Dice.diceRolls[3]));
			die5.setText(String.valueOf(Dice.diceRolls[4]));
			sum1.setText(String.valueOf(Dice.sum));
			sum2.setText(String.valueOf(Decision.scoreSum));
			score1.setText(String.valueOf(Decision.score[0]));
			score2.setText(String.valueOf(Decision.score[1]));
			score3.setText(String.valueOf(Decision.score[2]));
			score4.setText(String.valueOf(Decision.score[3]));
			score5.setText(String.valueOf(Decision.score[4]));
			score6.setText(String.valueOf(Decision.score[5]));
			score7.setText(String.valueOf(Decision.score[6]));
			score8.setText(String.valueOf(Decision.score[7]));
			score9.setText(String.valueOf(Decision.score[8]));
			score10.setText(String.valueOf(Decision.score[9]));
			});
		
		/** logic for the start button **/
		start.addActionListener(e -> {
			decision.newRoll();
			die1.setText(String.valueOf(Dice.diceRolls[0]));
			die2.setText(String.valueOf(Dice.diceRolls[1]));
			die3.setText(String.valueOf(Dice.diceRolls[2]));
			die4.setText(String.valueOf(Dice.diceRolls[3]));
			die5.setText(String.valueOf(Dice.diceRolls[4]));
			sum1.setText(String.valueOf(Dice.sum));
			sum2.setText(String.valueOf(Decision.scoreSum));
			start.setEnabled(false);
			yes.setEnabled(true);
			no.setEnabled(true);
			});
		
		
	}
}
