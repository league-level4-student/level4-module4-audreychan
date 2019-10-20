package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    int getX() {
    	return x;
    }
    void setX(int i) {
    	x = i;
    }
    
    int getY() {
    	return y;
    }
    void setY(int i) {
    	y = i;
    }
    
    int getWidth() {
    	return width;
    }
    int getLength() {
    	return height;
    }
    void setWidthLength(int w, int l) {
    	width = w;
    	height = l;
    }
    
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
