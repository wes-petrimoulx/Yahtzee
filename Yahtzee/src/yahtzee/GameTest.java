package yahtzee;

import static org.junit.Assert.*;

import org.junit.Test;

/*****************************************************************
Class that will run the junit tests for code coverage.
*****************************************************************/
public class GameTest {
	
	/**creates object dice for test purposes.**/
	Dice test1 = new Dice();
	
	/**creates object main for test purposes.**/
	Main test = new Main();
	
	/**creates object scores for test purposes.**/
	Scores test2 = new Scores();
	
	@Test
	public void testRoll() {
		test1.roll();
		assertNotEquals(0, Dice.sum);
	}
	
	@Test
	public void testGetSum() {
		test1.roll();
		assertNotEquals(0, Dice.getSum());
	}
	
	@Test
	public void testEndGame() {
		test.turnNum = 9;
		test.turn();
		assertNotEquals(0, Dice.getSum());
	}
	
	@Test
	public void testFinalScore() {
		test.finalScore();
		assertEquals(0, test.finalScore());
	}

	@Test
	public void testYahtzee() {
		test1.diceRolls[0] = 1;
		test1.diceRolls[1] = 1;
		test1.diceRolls[2] = 1;
		test1.diceRolls[3] = 1;
		test1.diceRolls[4] = 1;
		assertEquals(0, test2.yahtzee());
	}
	
}
