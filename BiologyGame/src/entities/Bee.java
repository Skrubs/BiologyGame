package entities;

import java.util.Random;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import util.AnimationReader;
import util.ImageLoader;

public class Bee extends Sprite implements Interaction {
	
	
	Image[] frames_up;
	Image[] frames_down;
	Image[] frames_left;
	Image[] frames_right;

	public Bee(Image spriteImage, double posX, double posY, double width, double height) {
		super(spriteImage, posX, posY, width, height);
		
		
		frames_up = new Image[2];
		frames_down = new Image[2];
		frames_left = new Image[2];
		frames_right = new Image[2];
		

		frames_up[0] = ImageLoader.beeUp_1;
		frames_up[1] = ImageLoader.beeUp_2;
		
		
		frames_down[0] = ImageLoader.beedown_1;
		frames_down[1] = ImageLoader.beedown_2;
		
		frames_left[0] = ImageLoader.beeleft_1;
		frames_left[1] = ImageLoader.beeleft_2;
		
		frames_right[0] = ImageLoader.beeright_1;
		frames_right[1] = ImageLoader.beeright_2;
		
		this.setVelocity(new Random().nextInt(4), new Random().nextInt(4));
	}

	@Override
	public Rectangle2D getBoundary() {
		return new Rectangle2D(posX,posY,width,height);
	}

	@Override
	public boolean collision(Rectangle2D rect) {
		
		return false;
	}

	@Override
	public void move() {
		posX += velX;
		posY += velY;
		
	}

	@Override
	public void update(double timer) {
		move();
		
	}

	@Override
	public void render(GraphicsContext gc) {
		if (velY < 0 ) {
			gc.drawImage(AnimationReader.animateImage(frames_up, .1), posX, posY);
		} else if (velY > 0 ) {
			gc.drawImage(AnimationReader.animateImage(frames_down, .1), posX, posY);
		} else if (velX < 0 ) {
			gc.drawImage(AnimationReader.animateImage(frames_left, .1), posX, posY);
		} else if (velX > 0 ) {
			gc.drawImage(AnimationReader.animateImage(frames_right, .1), posX, posY);
		}
		
	}

}
