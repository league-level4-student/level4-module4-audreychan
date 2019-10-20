package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph {

	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(255, 92, 41));
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
