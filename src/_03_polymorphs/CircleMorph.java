package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(129, 39, 204));
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
