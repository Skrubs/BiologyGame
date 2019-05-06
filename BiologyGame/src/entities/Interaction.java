package entities;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

public interface Interaction {
	
	public Rectangle2D getBoundary();
	public boolean collision(Rectangle2D rect);
	public void move();
	public void update(double timer);
	public void render(GraphicsContext gc);

}
