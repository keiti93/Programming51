package week9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	private final int WIDTH = 800;
	private final int HEIGHT = 800;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(Color.gray);
		g2.fillRect(0, 0, WIDTH, HEIGHT);
		
		g2.setPaint(Color.pink);
		g2.fillRect(10, 10, WIDTH - 20, HEIGHT - 20);
		
		double centerX = WIDTH/2.0;
		double centerY = HEIGHT/2.0;
		
		Rectangle2D.Double r = new Rectangle2D.Double(centerX - 25, centerY - 25, 50, 50);
		g2.setPaint(Color.green);
		g2.fill(r);
	}
	public Canvas(){
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

}
