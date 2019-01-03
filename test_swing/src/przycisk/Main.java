package przycisk;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

	private static final long serialVersionUID = -1800219531699218299L;


	public Main() {
		super("Uk³ad graficzny LAYOUT");
		this.setBounds(1000, 320, 700, 200);
		
		initComponents();
		this.pack();
		this.setDefaultCloseOperation(3);
	}
	public void initComponents() {
		centrum=new JButton("Anuluj");
		upper=new JButton("Góra");
		bottom=new JButton("Dó³");
		left=new JButton("Lewo");
		right=new JButton("Prawo");
		
		Container kontener=this.getContentPane();
		
//		kontener.add(centrum,BorderLayout.CENTER);
//		kontener.add(upper,BorderLayout.PAGE_START);
//		kontener.add(bottom,BorderLayout.PAGE_END);
//		kontener.add(right,BorderLayout.LINE_END);
//		kontener.add(left,BorderLayout.LINE_START);
		
		
		centrum.setLocation(100, 50);
		centrum.setSize(centrum.getPreferredSize());
		//centrum.setSize(100,50);
		kontener.setLayout(null);
		kontener.add(centrum);
	}
	JButton centrum;
	JButton upper;
	JButton bottom;
	JButton left;
	JButton right;
	
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}
