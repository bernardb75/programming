package layout;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	public Main() {
		this.setBounds(300, 300, 300, 200);
		this.setDefaultCloseOperation(3);
		
		initComponents();
	}

	private void initComponents() {
		
		GroupLayout lay=new GroupLayout(getContentPane());
		this.getContentPane().setLayout(lay);
		
		lay.setAutoCreateContainerGaps(true);
		lay.setAutoCreateGaps(true);
		
		
		lay.setHorizontalGroup(
				lay.createSequentialGroup()
				.addComponent(but1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
				.addGroup(
						lay.createParallelGroup()
						.addComponent(but2)
						.addComponent(but4)
						)
				.addComponent(but3)
				.addContainerGap(10,Short.MAX_VALUE)
				.addComponent(but5)
				);
		lay.setVerticalGroup(
				lay.createSequentialGroup()
				.addGroup(
						lay.createParallelGroup()
						.addComponent(but1,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
						.addComponent(but2)
						.addComponent(but3)
						)
				.addComponent(but4)
				.addContainerGap(10,Short.MAX_VALUE)
				.addComponent(but5)
				);
		
	}
	JButton but1=new JButton("B1");
	JButton but2=new JButton("B2");
	JButton but3=new JButton("B3");
	JButton but4=new JButton("B4");
	JButton but5=new JButton("Anuluj");
}
