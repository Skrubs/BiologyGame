package util;

import game.GameTimer;
import javafx.scene.image.Image;

public class AnimationReader {
	
	
	public AnimationReader() {
		
	}
	
	public static Image animateImage(Image[] frames, double duration) {
		int index = (int) ((GameTimer.getTimer() % (frames.length * duration)) / duration);
		return frames[index];
	}

}
