package yahtzee;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Yahtzee{
	
	public static void main(String[] args) {	
		
		/** Creates new gui on run of the main method **/
		gui guiFrame = new gui();
		
		/** allows user to exit application on use of exit button **/
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/** sets the size oft the gui **/
		guiFrame.setSize(700, 300);
		
		/** allows the gui to be visible **/
		guiFrame.setVisible(true);
		
	}
}