package test.java.bowling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.bowling.BowlingGame;
import main.java.bowling.NormalFrame;

public class BowlingGameTest {

	@Test
	public void gametest()
	{
		BowlingGame bowlingGame = new BowlingGame("X X X X X X X X X X X X");
		
		assertEquals(300, bowlingGame.getScore());
		
		BowlingGame bowlingGame2 = new BowlingGame("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-");
		
		assertEquals(90, bowlingGame2.getScore());
		
		BowlingGame bowlingGame3 = new BowlingGame("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/");
		
		assertEquals(200, bowlingGame3.getScore());
		
	}
	
	
	@Test
	public void SecondRollNotValidTest() {
		
		NormalFrame normalFrame = new NormalFrame("77");
		assertEquals(false, normalFrame.isValidSecondRoll('7'));
	}
	
	
	
	

	
}
