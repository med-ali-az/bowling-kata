package main.java.bowling;

import java.util.ArrayList;
import java.util.List;

public class LineParser {

	public static List<Frame> parse(String line) {
		List<Frame> frames = new ArrayList<Frame>();
		String[] frameLines = line.split(" ");
		for (String frameLine : frameLines) {
			
			switch (identifyFrame(frameLine)) {
			case "Normal":
				NormalFrame normalFrame = new NormalFrame(frameLine);
				frames.add(normalFrame);
				break;
			case "Spare":
				SpareFrame spareFrame = new SpareFrame();
				frames.add(spareFrame);
				break;

			case "Strike":
				StrikeFrame strikeFrame = new StrikeFrame();
				frames.add(strikeFrame);
				break;
				
			case "NotValid":

				break;
			}
		}
		
		return frames;
	}

	static String identifyFrame(String frameLine) {
		if (frameLine.length() == 1 && frameLine.equals("X")) {
			return "Strike";
		} else if (frameLine.length() == 2 && frameLine.contains("/")) {
			return "Spare";
		} else if (frameLine.length() == 2) {
			return "Normal";
		}

		return "NotValid";
	}

}
