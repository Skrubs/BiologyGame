package game;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

public class GameTimer extends AnimationTimer{
	
	private static double timer;
	private long startTime = System.nanoTime();
	private Game game;
	private GraphicsContext gc;
	
	public GameTimer(GraphicsContext gc) {
		this.gc = gc;
		game = new Game();
		game.gameInit();
		
	}

	@Override
	public void handle(long now) {
		timer = (now - startTime) / 1000000000.0;
		
		game.update(timer);
		game.render(gc);
		
	}

	public static double getTimer() {
		return timer;
	}

	public static void setTimer(double timer) {
		GameTimer.timer = timer;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	

}
