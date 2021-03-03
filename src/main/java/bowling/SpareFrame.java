package main.java.bowling;

public class SpareFrame implements Frame{
	
	private static final int SCORE = 10;
    private static final int NUMBER_OF_SUCCEEDING_FRAME_BONUS_SCORE = 1;

	@Override
	public int getScore() {
		return SCORE;
	}

	@Override
	public int getNumberOfSucceedingFrameBonusScore() {
		return NUMBER_OF_SUCCEEDING_FRAME_BONUS_SCORE;
	}

}
