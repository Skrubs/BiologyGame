package util;

public class Camera {
	
	
	private double offsetX;
	private double offsetY;
	
	
	public Camera(double offsetX, double offsetY) {
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}
	
	public void movement(double offsetX, double offsetY) {
		this.offsetX += offsetX;
		this.offsetY += offsetY;
	}

	public double getOffsetX() {
		return offsetX;
	}

	public void setOffsetX(double offsetX) {
		this.offsetX = offsetX;
	}

	public double getOffsetY() {
		return offsetY;
	}

	public void setOffsetY(double offsetY) {
		this.offsetY = offsetY;
	}
	
	

}
