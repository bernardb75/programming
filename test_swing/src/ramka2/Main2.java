package ramka2;

import java.awt.*;

import javax.swing.JFrame;

public class Main2 extends JFrame{
	
	public Main2() {
	int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	
	
	this.setSize(width/2,height/2);
	this.setLocation(width/4, 0);
	
	int szerR=this.getSize().width;
	int wysR=this.getSize().height;
	
	this.setLocation((width-szerR)/2, (height-wysR)/2);
	
	
	this.setDefaultCloseOperation(3);
	}

	public static void main(String[] args) {
		new Main2().setVisible(true);
	}

}
