package main.java.bowling;


public class NormalFrame implements Frame{
	
	int firstRoll;
	int secondRoll;
	
	public NormalFrame(String rolls) {
		
		if(rolls.charAt(0) == '-') {
			firstRoll = 0;
		}else {
			firstRoll = Integer.parseInt(String.valueOf(rolls.charAt(0)));
		}
			
		if(rolls.charAt(1) == '-') {
			secondRoll = 0;
		}else if(isValidSecondRoll(rolls.charAt(1))){
			secondRoll = Integer.parseInt(String.valueOf(rolls.charAt(1)));
		}
	}

	@Override
	public int getNumberOfSucceedingFrameBonusScore() {
		
		return 0;
	}

	@Override
	public int getScore() {
		return this.firstRoll + this.secondRoll;
	}
	
	public boolean isValidSecondRoll(char roll) {
		if(Integer.parseInt(String.valueOf(roll)) + firstRoll > 10) return false;
		else return true;
	}
	
	
	

}
