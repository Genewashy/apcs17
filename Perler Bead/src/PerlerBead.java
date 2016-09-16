import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class PerlerBead extends PApplet{
	ArrayList<Color> colors;
	PImage img;
	
	public Color getClosestColor(ArrayList<Color> list,Color toMatch) {
		int indexOfBest = 0;
		for (int k = 1; k < list.size(); k++) {
			double d1 = Math.sqrt(Math.pow(toMatch.getRed() - list.get(indexOfBest).getRed(), 2)+
					Math.pow(toMatch.getGreen() - list.get(indexOfBest).getGreen(), 2)+
					Math.pow(toMatch.getBlue() - list.get(indexOfBest).getBlue(), 2));
			double d2 = Math.sqrt(Math.pow(toMatch.getRed() - list.get(k).getRed(), 2)+
					Math.pow(toMatch.getGreen() - list.get(k).getGreen(), 2)+
					Math.pow(toMatch.getBlue() - list.get(k).getBlue(), 2));
			
			if ( d2 < d1 ) {
				indexOfBest = k;
			
			}
		}
		return list.get(indexOfBest);	
			
		}
		
	
	
	
	public void setup() {	
		this.size(1000,1000);
		img = this.loadImage("sudo.png");
		colors = new ArrayList<Color>();
		colors.add(new Color(236,237,237)); //white
		colors.add(new Color(46,47,49)); //black
		colors.add(new Color(182,49,54)); //red
		colors.add(new Color(254,164,2)); //orange
		colors.add(new Color(240, 185, 1)); //yellow
		colors.add(new Color(37,104,71)); //green
		colors.add(new Color(48,92,176)); //blue
		colors.add(new Color(253,145,214)); //pink
		
	}
	
	public void draw() {
		for (int k = 0; k < height; k++) {
			for (int i = 0; i < width; i++) {
				int cordX = 0+5*i;
				int cordY = 0+5*k ;
				int currentColor = img.get(cordX, cordY);
				fill(currentColor);
				this.ellipse(0+5*i,0+5*k,5,5);
		}
		
	}
	}
}
		