package yahtzee;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	
	Dice test1 = new Dice();
	
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

	
}
