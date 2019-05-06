package states;

import game.GameTimer;
import javafx.scene.canvas.GraphicsContext;

public class GameState {
	
	
	GameTimer gameTimer;
	
	public GameState(GraphicsContext gc) {
		gameTimer = new GameTimer(gc);
	}
	
	public void active() {
		gameTimer.start();
	}
	
	public void inactive() {
		gameTimer.stop();
	}

}
