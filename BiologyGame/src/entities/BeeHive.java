package entities;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class BeeHive extends Sprite implements Interaction {
	
	private final double MAX_HEALTH = 10;
	private double health = 7;
	

	public BeeHive(Image spriteImage, double posX, double posY, double width, double height) {
		super(spriteImage, posX, posY, width, height);
		
	}
	
	public void takeDamage() {
		health -= 1;
	}
	
	public double getHealth() {
		return health;
	}

	@Override
	public Rectangle2D getBoundary() {
		return new Rectangle2D(posX+10, posY+20, width-20, height-30);
	}

	@Override
	public boolean collision(Rectangle2D rect) {
		return this.getBoundary().intersects(rect);
	}

	@Override
	public void move() {
		

	}

	@Override
	public void update(double timer) {
		

	}

	@Override
	public void render(GraphicsContext gc) {

		if(health > 0)
		gc.drawImage(this.getSpriteImage(), posX, posY);

		//gc.setStroke(Color.RED);
		//gc.strokeRect(this.getBoundary().getMinX(), this.getBoundary().getMinY(), this.getBoundary().getWidth(),
				//this.getBoundary().getHeight());

	}

}
