package week9;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Application extends JFrame {
	
	public Application(){
		add(new Canvas3());
		
		setResizable(false);
		pack();
		
		setTitle("Hello Java 2D World!");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args){
		Application app = new Application();
		app.setVisible(true);
		
	}	

}
