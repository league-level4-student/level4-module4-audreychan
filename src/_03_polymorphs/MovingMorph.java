package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(12, 204, 45));
		g.fillRect(x, y, width, height);
	}
	
	public void update(){
	   	 x += 3;
	   	 if(x >= PolymorphWindow.WIDTH) x = 0;
    }

}
