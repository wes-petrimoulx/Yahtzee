package yahtzee;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Yahtzee{
	
	public static void main(String[] args) {		
		gui guiFrame = new gui();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setSize(700, 300);
		guiFrame.setVisible(true);
		
	}
}