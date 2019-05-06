package entities;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import util.AnimationReader;
import util.ImageLoader;
import util.Movement;

public class Player extends Sprite implements Interaction {

	private Movement movement;
	Image[] frames_up;
	Image[] frames_down;
	Image[] frames_left;
	Image[] frames_right;

	public Player(Image spriteImage, double posX, double posY, double width, double height) {
		super(spriteImage, posX, posY, width, height);

		movement = new Movement(this);

		frames_up = new Image[3];
		frames_down = new Image[3];
		frames_left = new Image[3];
		frames_right = new Image[3];
		

		frames_up[0] = ImageLoader.ratelUp_1;
		frames_up[1] = ImageLoader.ratelUp_2;
		frames_up[2] = ImageLoader.ratelUp_3;
		
		frames_down[0] = ImageLoader.ratelDown_1;
		frames_down[1] = ImageLoader.ratelDown_2;
		frames_down[2] = ImageLoader.ratelDown_3;
		
		frames_left[0] = ImageLoader.ratelLeft_1;
		frames_left[1] = ImageLoader.ratelLeft_2;
		frames_left[2] = ImageLoader.ratelLeft_3;
		
		frames_right[0] = ImageLoader.ratelRight_1;
		frames_right[1] = ImageLoader.ratelRight_2;
		frames_right[2] = ImageLoader.ratelRight_3;

	}

	@Override
	public Rectangle2D getBoundary() {
		return new Rectangle2D(posX+30, posY+10, width-45, height+30);
	}

	@Override
	public boolean collision(Rectangle2D rect) {
		return this.getBoundary().intersects(rect);
	}

	@Override
	public void move() {

		posX += velX;
		posY += velY;

	}

	@Override
	public void update(double timer) {

		movement.move();

	}

	@Override
	public void render(GraphicsContext gc) {
		
		
		if (velY < 0  && movement.getInputList().get(0).equals("W") ) {
			gc.drawImage(AnimationReader.animateImage(frames_up, .2), posX, posY);
		} 

		if (velY > 0 && movement.getInputList().get(0).equals("S") ) {
			gc.drawImage(AnimationReader.animateImage(frames_down, .2), posX, posY);
		} 

		if (velX < 0 && movement.getInputList().get(0).equals("A") ) {
			gc.drawImage(AnimationReader.animateImage(frames_left, .2), posX, posY);
		} 

		if (velX > 0 && movement.getInputList().get(0).equals("D") ) {
			gc.drawImage(AnimationReader.animateImage(frames_right, .2), posX, posY);
		} 
		
		if(velX == 0 && velY == 0) {
			if(movement.getLastInput().equals("W")) {
				gc.drawImage(ImageLoader.ratelUp_1, posX, posY);
			}else if(movement.getLastInput().equals("S")) {
				gc.drawImage(ImageLoader.ratelDown_1, posX, posY);
			}else if(movement.getLastInput().equals("A")) {
				gc.drawImage(ImageLoader.ratelLeft_1, posX, posY);
			}else if(movement.getLastInput().equals("D")) {
				gc.drawImage(ImageLoader.ratelRight_1, posX, posY);
			}else {
				gc.drawImage(ImageLoader.ratelUp_1, posX, posY);
			}
			
		}
		
		//gc.setStroke(Color.RED);;
		//gc.strokeRect(this.getBoundary().getMinX(), this.getBoundary().getMinY(), 
					//this.getBoundary().getWidth(), this.getBoundary().getHeight());

	}

}
