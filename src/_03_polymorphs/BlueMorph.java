package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BlueMorph extends Polymorph{

	BlueMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(41, 82, 255));
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
