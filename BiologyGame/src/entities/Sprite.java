package entities;

import javafx.scene.image.Image;

public abstract class Sprite {

	protected double posX;
	protected double posY;
	protected double width;
	protected double height;
	protected double velX;
	protected double velY;
	protected Image spriteImage;

	public Sprite(Image spriteImage,double posX, double posY, double width, double height) {
		this.spriteImage = spriteImage;
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		velX = 0;
		velY = 0;
	}
	
	

	public Image getSpriteImage() {
		return spriteImage;
	}



	public void setSpriteImage(Image spriteImage) {
		this.spriteImage = spriteImage;
	}



	public void setVelocity(double vX, double vY) {
		this.velX = vX;
		this.velY = vY;
	}

	public double getVelX() {
		return velX;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public double getVelY() {
		return velY;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
