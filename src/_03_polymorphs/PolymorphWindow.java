package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polys = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 polys.add(new BlueMorph(50, 50));
   	 polys.get(0).setWidthLength(10, 10);
   	 
   	 polys.add(new RedMorph(100, 100));
   	 polys.get(1).setWidthLength(10, 10);
   	 
   	 polys.add(new MovingMorph(60, 50));
   	 polys.get(2).setWidthLength(10, 10);
   	 
   	 polys.add(new CircleMorph(500, 500));
   	 polys.get(3).setWidthLength(10, 10);
   	 
   	 polys.add(new MouseMorph(400, 400));
   	 polys.get(4).setWidthLength(10,  10);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for(int i = 0; i < polys.size(); i++) {
   		 polys.get(i).draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for(int i = 0; i < polys.size(); i++) {
  		 polys.get(i).update();
  	 }
    }
}
