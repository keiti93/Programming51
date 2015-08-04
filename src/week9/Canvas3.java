package week9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JPanel;

public class Canvas3 extends JPanel implements MouseListener {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 800;

  private LinkedList<Pair> points = new LinkedList<Pair>();
  
  public Canvas3() {
    // very important here - addMouseListener(this)
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
	  
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    drawLine(points.get(0), points.get(1), g2);
    drawLine(points.get(1), points.get(2), g2);
    drawLine(points.get(2), points.get(0), g2);

  }

  @Override
  public void mouseClicked(MouseEvent e) {
    points.add(new Pair(e.getX(), e.getY()));    
    repaint();
  }
  
  public void drawLine(Pair A, Pair B, Graphics2D g){
	  g.setPaint(Color.GREEN);
	  g.drawLine(A.x, A.y, B.x, B.y);
	  
	  
	  
  }

  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}