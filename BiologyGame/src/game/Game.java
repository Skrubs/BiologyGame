package game;

import java.util.ArrayList;
import java.util.Random;

import application.Main;
import entities.Bee;
import entities.BeeHive;
import entities.Player;
import entities.Sprite;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import util.ImageLoader;

public class Game {
	
	
	Random gen = new Random();
	private Player player;
	private ArrayList<BeeHive> beehives = new ArrayList<>();
	private ArrayList<Bee> bees = new ArrayList<>();
	private double startTime = 0;
	
	public Game() {
		
	}
	
	public void gameInit() {
		player = new Player(ImageLoader.ratelUp_1,400,400,100,100);
		
		for(int i = 0; i < 1; i++) {
			beehives.add(new BeeHive(ImageLoader.beehive_1,gen.nextInt(1200),gen.nextInt(500),223,195));
		}
	}
	
	public void update(double timer) {
		
		for(BeeHive b : beehives) {
			b.update(timer);
		}
		
		player.update(timer);
		player.move();
		
		//timer
		
		
		for(BeeHive b : beehives) {
			if(player.collision(b.getBoundary())) {
				if(timer - startTime > 2  && b.getHealth() > 0) {
					startTime = timer;
					b.takeDamage();
					double x = gen.nextInt((int)player.getPosX() + 200);
					double y = gen.nextInt((int) player.getPosY() + 200);
					
					bees.add(new Bee(null,x,y,77,78));
					
				}
			}
		}
		
		for(Bee b : bees) {
			b.update(timer);
		}
		
	}
	
	public void render(GraphicsContext gc) {
		gc.setFill(Color.DARKGREEN);
		gc.fillRect(0, 0, Main.WINDOW_WIDTH, Main.WINDOW_HEIGHT);
		
		//render beehives
		for(BeeHive b : beehives) {
			b.render(gc);
		}
				
		//Render Ratel
		player.render(gc);
		
		//render bee
		for(Bee b : bees) {
			b.render(gc);
		}
		
		
		
	}

}
