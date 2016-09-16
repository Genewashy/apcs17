import java.awt.image.ColorModel;

import processing.core.PApplet;
import processing.core.PImage;

public class Circles extends PApplet {
	PImage img;
	float scalar;
	public void setup() {
		this.size(700,700);
//		this.noLoop();
		img = this.loadImage("frank.PNG");
		img.loadPixels();
		this.frameRate(600000);
		scalar = 1.0f;
	}
	public void draw() {
//		this.fill(img.pixels[(int) this.random(0,img.pixels.length)]);
//		this.ellipse(this.random(0, this.width),
//				this.random(0,this.height),
//				this.random(0,100),
//				this.random(0,100));
//			float w = img.width * scalar;
//			float h = img.height * scalar;
//			this.image(img, 0, 0, w, h);
//			scalar += .01;
//		for (int k = 0; k < 100000; k++);
//			float randX = random(0,this.width);
//			float randY = random(0,this.height);
//			int currentColor = img.get((int)randX, (int)randY);
//			this.fill(this.red(currentColor), this.green(currentColor), this.blue(currentColor));
//			float d = this.random(0, 20);
//			this.ellipse(randX, randY, d, d);
//			this.stroke(randX, randY, randX * randY);
			float randX = random (0,this.width);
			float randY = random (0, this.height);
			this.line(randX, randY, randX+20, randY+20);
			int currentColor = img(this.getColorModel(), this.getColorModel());
			this.stroke(this.red(currentColor),this.green(currentColor),this.blue(currentColor));
			
		
	}
	private int img(ColorModel colorModel, ColorModel colorModel2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}