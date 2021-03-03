package main.java.bowling;

import java.util.List;

public class BowlingGame {
	
	List<Frame> frames;
	
	int totalScore = 0;

	public BowlingGame(String line) {
		frames = LineParser.parse(line);
		
	}
	
	public int getScore() {
		for (int i = 0; i < 10; i++) {
			Frame frame = frames.get(i);
			
			totalScore += frame.getScore() + calculateBonusScore(frames, i);
		}
		
		return totalScore;
	}
	
	int calculateBonusScore(List<Frame> frames, int currentFrame) {
		int bonusScore = 0;
		if(frames.get(currentFrame).getNumberOfSucceedingFrameBonusScore() == 1) {
			bonusScore = frames.get(currentFrame+1).getScore();
		}else if(frames.get(currentFrame).getNumberOfSucceedingFrameBonusScore() == 2) {
			bonusScore = frames.get(currentFrame+1).getScore() + frames.get(currentFrame+2).getScore();
		}
		
		return bonusScore;
	}
	

	
	
	

	

	

}
