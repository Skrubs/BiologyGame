package util;

import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

public class ImageLoader {

	private static Image spriteSheet = new Image("textures/biologyspritesheet.png");

	// bee up
	public static WritableImage beeUp_1 = new WritableImage(spriteSheet.getPixelReader(), 258, 281, 75, 82);
	public static WritableImage beeUp_2 = new WritableImage(spriteSheet.getPixelReader(), 348, 280, 75, 82);

	// bee down
	public static WritableImage beedown_1 = new WritableImage(spriteSheet.getPixelReader(), 414, 280, 75, 82);
	public static WritableImage beedown_2 = new WritableImage(spriteSheet.getPixelReader(), 495, 275, 75, 82);

	// bee left
	public static WritableImage beeleft_1 = new WritableImage(spriteSheet.getPixelReader(), 586, 280, 82, 75);
	public static WritableImage beeleft_2 = new WritableImage(spriteSheet.getPixelReader(), 671, 273, 82, 75);

	// bee right
	public static WritableImage beeright_1 = new WritableImage(spriteSheet.getPixelReader(), 277, 283, 82, 75);
	public static WritableImage beeright_2 = new WritableImage(spriteSheet.getPixelReader(), 871, 277, 82, 75);

	// beehive
	public static WritableImage beehive_1 = new WritableImage(spriteSheet.getPixelReader(), 2, 420, 223, 195);

	// Ratel up
	public static WritableImage ratelUp_1 = new WritableImage(spriteSheet.getPixelReader(), 75, 80, 100, 170);
	public static WritableImage ratelUp_2 = new WritableImage(spriteSheet.getPixelReader(), 170, 80, 100, 170);
	public static WritableImage ratelUp_3 = new WritableImage(spriteSheet.getPixelReader(), 270, 80, 100, 170);

	// Ratel down
	public static WritableImage ratelDown_1 = new WritableImage(spriteSheet.getPixelReader(), 1480, 76, 75, 175);
	public static WritableImage ratelDown_2 = new WritableImage(spriteSheet.getPixelReader(), 1555, 76, 75, 175);
	public static WritableImage ratelDown_3 = new WritableImage(spriteSheet.getPixelReader(), 1630, 76, 75, 175);

	// Ratel left
	public static WritableImage ratelLeft_1 = new WritableImage(spriteSheet.getPixelReader(), 933, 120, 175, 75);
	public static WritableImage ratelLeft_2 = new WritableImage(spriteSheet.getPixelReader(), 1123, 124, 175, 75);
	public static WritableImage ratelLeft_3 = new WritableImage(spriteSheet.getPixelReader(), 1305, 122, 175, 75);

	// Rate right
	public static WritableImage ratelRight_1 = new WritableImage(spriteSheet.getPixelReader(), 386, 122, 175, 75);
	public static WritableImage ratelRight_2 = new WritableImage(spriteSheet.getPixelReader(), 572, 122, 175, 75);
	public static WritableImage ratelRight_3 = new WritableImage(spriteSheet.getPixelReader(), 748, 122, 175, 75);

}
