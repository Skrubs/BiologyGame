package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import states.GameState;
import states.MenuState;


public class Main extends Application {
	
	private Stage window;
	private Group root;
	private static Scene scene;
	private Canvas canvas;
	private GraphicsContext gc;
	public static final double WINDOW_WIDTH = 1200;
	public static final double WINDOW_HEIGHT = 800;
	private int state;
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		root = new Group();
		scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
		canvas = new Canvas(scene.getWidth(), scene.getHeight());
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		state = 0;
		
		GameState gameState = new GameState(gc);
		MenuState menuState = new MenuState();
		
		if(state == 0) {
			gameState.active();
		}else {
			gameState.inactive();
		}
		
		
		window.setScene(scene);
		window.setTitle("Barcelona - Ratel Simulator v0.01");
		window.show();
	
	}
	
	
	
	public Stage getWindow() {
		return window;
	}



	public void setWindow(Stage window) {
		this.window = window;
	}



	public Group getRoot() {
		return root;
	}



	public void setRoot(Group root) {
		this.root = root;
	}



	public static Scene getScene() {
		return scene;
	}



	public static void setScene(Scene scene) {
		Main.scene = scene;
	}



	public Canvas getCanvas() {
		return canvas;
	}



	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}



	public GraphicsContext getGc() {
		return gc;
	}



	public void setGc(GraphicsContext gc) {
		this.gc = gc;
	}



	public int getState() {
		return state;
	}



	public void setState(int state) {
		this.state = state;
	}



	public static double getWindowWidth() {
		return WINDOW_WIDTH;
	}



	public static double getWindowHeight() {
		return WINDOW_HEIGHT;
	}



	public static void main(String[] args) {
		launch(args);
	}
}
