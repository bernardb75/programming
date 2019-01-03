package radio;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame {

	public Main() {

		initComponent();

	}

	private void initComponent() {
		this.setTitle("Prze³¹cznik radio");
		this.setBounds(300, 300, 300, 200);
		panel1.add(label);

		JRadioButton radio=new JRadioButton("Ma³y",false);
		JRadioButton radio1=new JRadioButton("Œredni",true);
		
		radio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("Monospaced",Font.BOLD,25));
			}
		});
		
		groupSize.add(radio);
		groupSize.add(radio1);
		
		panel.add(radio);
		panel.add(radio1);
		
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(panel1, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(3);
	}

	public void przelacznikRozmiarow(String nazwa, int rozmiar) {
		JRadioButton przelacznik=new JRadioButton(nazwa);
		przelacznik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("Monospaced",Font.PLAIN,rozmiar));
			}
		});
	}
	
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JLabel label = new JLabel("Czas na przygode!");
	ButtonGroup groupSize=new ButtonGroup();
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
