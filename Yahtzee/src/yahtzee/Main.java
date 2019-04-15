package yahtzee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Main extends JFrame {

	Scores scores = new Scores();
	
	int turnNum = 0;
	
	private JPanel contentPane;
	private JLabel roll5;
	private JLabel roll1;
	private JLabel roll2;
	private JLabel roll3;
	private JLabel roll4;
	private JLabel acesNum;
	private JLabel twosNum;
	private JLabel threesNum;
	private JLabel foursNum;
	private JLabel fivesNum;
	private JLabel sixesNum;
	private JButton acesAdd;
	private JButton twosAdd;
	private JButton threesAdd;
	private JButton foursAdd;
	private JButton fivesAdd;
	private JButton sixesAdd;
	private JLabel acesScore;
	private JLabel twosScore;
	private JLabel threesScore;
	private JLabel foursScore;
	private JLabel fivesScore;
	private JLabel sixesScore;
	private JLabel threeoakNum;
	private JLabel fouroakNum;
	private JLabel yahtzeeNum;
	private JButton threeoakAdd;
	private JButton fouroakAdd;
	private JButton yahtzeeAdd;
	private JLabel threeoakScore;
	private JLabel fouroakScore;
	private JLabel yahtzeeScore;
	private JButton reRollButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		super("Yahtzee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 12, 788, 566);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAces = new JLabel("Aces");
		lblAces.setBounds(20, 55, 37, 16);
		panel.add(lblAces);
		
		JLabel lblTwos = new JLabel("Twos");
		lblTwos.setBounds(20, 100, 37, 16);
		panel.add(lblTwos);
	
		
		JLabel lblThrees = new JLabel("Threes");
		lblThrees.setBounds(20, 147, 52, 16);
		panel.add(lblThrees);
		
		JLabel lblFours = new JLabel("Fours");
		lblFours.setBounds(20, 196, 37, 16);
		panel.add(lblFours);
		
		
		JLabel lblFives = new JLabel("Fives");
		lblFives.setBounds(20, 247, 37, 16);
		panel.add(lblFives);
		
		JLabel lblSixes = new JLabel("Sixes");
		lblSixes.setBounds(20, 293, 37, 16);
		panel.add(lblSixes);
		
		JButton newGameButton = new JButton("New Game");
        newGameButton.setBounds(6, 14, 117, 29);
        panel.add(newGameButton);
		
		acesNum = new JLabel("0");
		acesNum.setBounds(117, 60, 26, 16);
		panel.add(acesNum);
		
		twosNum = new JLabel("0");
		twosNum.setBounds(117, 105, 26, 16);
		panel.add(twosNum);
		
		threesNum = new JLabel("0");
		threesNum.setBounds(117, 152, 26, 16);
		panel.add(threesNum);
		
		foursNum = new JLabel("0");
		foursNum.setBounds(117, 201, 26, 16);
		panel.add(foursNum);
		
		fivesNum = new JLabel("0");
		fivesNum.setBounds(117, 252, 26, 16);
		panel.add(fivesNum);
		
		sixesNum = new JLabel("0");
		sixesNum.setBounds(117, 298, 26, 16);
		panel.add(sixesNum);
		
		acesAdd = new JButton("Add");
		acesAdd.setBounds(151, 55, 57, 29);
		panel.add(acesAdd);
		
		twosAdd = new JButton("Add");
		twosAdd.setBounds(151, 100, 57, 29);
		panel.add(twosAdd);
		
		threesAdd = new JButton("Add");
		threesAdd.setBounds(151, 147, 57, 29);
		panel.add(threesAdd);
		
		foursAdd = new JButton("Add");
		foursAdd.setBounds(151, 196, 57, 29);
		panel.add(foursAdd);
		
		fivesAdd = new JButton("Add");
		fivesAdd.setBounds(151, 247, 57, 29);
		panel.add(fivesAdd);
		
		sixesAdd = new JButton("Add");
		sixesAdd.setBounds(151, 293, 57, 29);
		panel.add(sixesAdd);
		
		
		JLabel label = new JLabel("Aces");
		label.setBounds(293, 55, 37, 16);
		panel.add(label);
		
		JLabel label_7 = new JLabel("Twos");
		label_7.setBounds(345, 55, 37, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Threes");
		label_8.setBounds(394, 55, 52, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Fours");
		label_9.setBounds(451, 55, 37, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Fives");
		label_10.setBounds(500, 55, 37, 16);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Sixes");
		label_11.setBounds(549, 55, 37, 16);
		panel.add(label_11);
		
		acesScore = new JLabel("0");
		acesScore.setBounds(293, 79, 26, 16);
		panel.add(acesScore);
		
		twosScore = new JLabel("0");
		twosScore.setBounds(345, 79, 26, 16);
		panel.add(twosScore);
		
		threesScore = new JLabel("0");
		threesScore.setBounds(394, 79, 26, 16);
		panel.add(threesScore);
		
		foursScore = new JLabel("0");
		foursScore.setBounds(451, 79, 26, 16);
		panel.add(foursScore);
		
		fivesScore = new JLabel("0");
		fivesScore.setBounds(500, 79, 26, 16);
		panel.add(fivesScore);
		
		sixesScore = new JLabel("0");
		sixesScore.setBounds(549, 79, 26, 16);
		panel.add(sixesScore);
		
		JLabel lblScorecard = new JLabel("Scorecard");
		lblScorecard.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblScorecard.setBounds(451, 6, 128, 44);
		panel.add(lblScorecard);
		
		JLabel lblOfA = new JLabel("3 of a Kind");
		lblOfA.setBounds(20, 339, 76, 16);
		panel.add(lblOfA);
		
		JLabel lblOfA_1 = new JLabel("4 of a Kind");
		lblOfA_1.setBounds(20, 379, 76, 16);
		panel.add(lblOfA_1);
		
		JLabel lblYahtzee = new JLabel("Yahtzee");
		lblYahtzee.setBounds(20, 425, 61, 16);
		panel.add(lblYahtzee);
		
		threeoakNum = new JLabel("0");
		threeoakNum.setBounds(117, 339, 26, 16);
		panel.add(threeoakNum);
		
		fouroakNum = new JLabel("0");
		fouroakNum.setBounds(117, 379, 26, 16);
		panel.add(fouroakNum);
		
		yahtzeeNum = new JLabel("0");
		yahtzeeNum.setBounds(117, 425, 26, 16);
		panel.add(yahtzeeNum);
		
		threeoakAdd = new JButton("Add");
		threeoakAdd.setBounds(151, 334, 57, 29);
		panel.add(threeoakAdd);
		
		fouroakAdd = new JButton("Add");
		fouroakAdd.setBounds(151, 374, 57, 29);
		panel.add(fouroakAdd);
		
		yahtzeeAdd = new JButton("Add");
		yahtzeeAdd.setBounds(151, 420, 57, 29);
		panel.add(yahtzeeAdd);
		
		JLabel lblOfA_2 = new JLabel("3 Of a Kind");
		lblOfA_2.setBounds(598, 55, 76, 16);
		panel.add(lblOfA_2);
		
		JLabel lblOfA_3 = new JLabel("4 Of a Kind");
		lblOfA_3.setBounds(686, 55, 70, 16);
		panel.add(lblOfA_3);
		
		threeoakScore = new JLabel("0");
		threeoakScore.setBounds(598, 79, 26, 16);
		panel.add(threeoakScore);
		
		fouroakScore = new JLabel("0");
		fouroakScore.setBounds(686, 79, 26, 16);
		panel.add(fouroakScore);
		
		JLabel lblNewLabel = new JLabel("Yahtzee");
		lblNewLabel.setBounds(475, 131, 61, 16);
		panel.add(lblNewLabel);
		
		yahtzeeScore = new JLabel("0");
		yahtzeeScore.setBounds(476, 147, 26, 16);
		panel.add(yahtzeeScore);
		
		roll1 = new JLabel("0");
		roll1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		roll1.setBounds(394, 425, 37, 35);
		panel.add(roll1);
		
		roll2 = new JLabel("0");
		roll2.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		roll2.setBounds(440, 425, 37, 35);
		panel.add(roll2);
		
		roll3 = new JLabel("0");
		roll3.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		roll3.setBounds(489, 425, 37, 35);
		panel.add(roll3);
		
		roll4 = new JLabel("0");
		roll4.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		roll4.setBounds(538, 425, 37, 35);
		panel.add(roll4);
		
		roll5 = new JLabel("0");
		roll5.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		roll5.setBounds(587, 425, 37, 35);
		panel.add(roll5);
		
		JLabel lblYourRoll = new JLabel("Your Roll");
		lblYourRoll.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblYourRoll.setBounds(440, 379, 128, 34);
		panel.add(lblYourRoll);
		
		reRollButton = new JButton("Re-Roll");
        reRollButton.setBounds(652, 425, 76, 39);
        panel.add(reRollButton);
        
        newGameButton.addActionListener(e -> {
        	turnNum = 0;
        	reRollButton.setEnabled(true);
        	acesAdd.setEnabled(true);
        	twosAdd.setEnabled(true);
        	threesAdd.setEnabled(true);
        	foursAdd.setEnabled(true);
        	fivesAdd.setEnabled(true);
        	sixesAdd.setEnabled(true);
        	threeoakAdd.setEnabled(true);
        	fouroakAdd.setEnabled(true);
        	yahtzeeAdd.setEnabled(true);
        	acesScore.setText("0");
        	twosScore.setText("0");
        	threesScore.setText("0");
        	foursScore.setText("0");
        	fivesScore.setText("0");
        	sixesScore.setText("0");
        	threeoakScore.setText("0");
        	fouroakScore.setText("0");
        	yahtzeeScore.setText("0");
        	turn();
        	
        });
        
        reRollButton.addActionListener(e ->{
        	turn();
        	reRollButton.setEnabled(false);
        });
        
        acesAdd.addActionListener(e -> {
        	turnNum++;
        	acesScore.setText(Integer.toString(scores.ones()));
        	acesAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        twosAdd.addActionListener(e -> {
        	turnNum++;
        	twosScore.setText(Integer.toString(scores.twos()));
        	twosAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        threesAdd.addActionListener(e -> {
        	turnNum++;
        	threesScore.setText(Integer.toString(scores.threes()));
        	threesAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        foursAdd.addActionListener(e -> {
        	turnNum++;
        	foursScore.setText(Integer.toString(scores.fours()));
        	foursAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        fivesAdd.addActionListener(e -> {
        	turnNum++;
        	fivesScore.setText(Integer.toString(scores.fives()));
        	fivesAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        sixesAdd.addActionListener(e -> {
        	turnNum++;
        	sixesScore.setText(Integer.toString(scores.sixes()));
        	sixesAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        threeoakAdd.addActionListener(e -> {
        	turnNum++;
        	threeoakScore.setText(Integer.toString(scores.threeOfKind()));
        	threeoakAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
         
        fouroakAdd.addActionListener(e -> {
        	turnNum++;
        	fouroakScore.setText(Integer.toString(scores.fourOfKind()));
        	fouroakAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        yahtzeeAdd.addActionListener(e -> {
        	turnNum++;
        	yahtzeeScore.setText(Integer.toString(scores.yahtzee()));
        	yahtzeeAdd.setEnabled(false);
        	reRollButton.setEnabled(true);
        	turn();
        });
        
        turn();
	}
	
	private void turn() {
		
		if(turnNum < 9) {
		scores.newRoll();
        roll1.setText(Integer.toString(scores.getRoll()[0]));
        roll2.setText(Integer.toString(scores.getRoll()[1]));
        roll3.setText(Integer.toString(scores.getRoll()[2]));
        roll4.setText(Integer.toString(scores.getRoll()[3]));
        roll5.setText(Integer.toString(scores.getRoll()[4]));
        
        acesNum.setText(Integer.toString(scores.ones()));
        twosNum.setText(Integer.toString(scores.twos()));
        threesNum.setText(Integer.toString(scores.threes()));
        foursNum.setText(Integer.toString(scores.fours()));
        fivesNum.setText(Integer.toString(scores.fives()));
        sixesNum.setText(Integer.toString(scores.sixes()));
        threeoakNum.setText(Integer.toString(scores.threeOfKind()));
        fouroakNum.setText(Integer.toString(scores.fourOfKind()));
        yahtzeeNum.setText(Integer.toString(scores.yahtzee()));
		}
		else {
			reRollButton.setEnabled(false);
			JOptionPane.showMessageDialog(null, "End of Game. Final score: " + finalScore());
		}
        
	}
	
	private int finalScore() {
		int score = 0;
		score += Integer.parseInt(acesScore.getText());
		score += Integer.parseInt(twosScore.getText());
		score += Integer.parseInt(threesScore.getText());
		score += Integer.parseInt(foursScore.getText());
		score += Integer.parseInt(fivesScore.getText());
		score += Integer.parseInt(sixesScore.getText());
		score += Integer.parseInt(threeoakScore.getText());
		score += Integer.parseInt(fouroakScore.getText());
		score += Integer.parseInt(yahtzeeScore.getText());
		
		return score;
	}

	
}
