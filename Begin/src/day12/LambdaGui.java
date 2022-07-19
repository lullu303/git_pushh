package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LambdaGui extends JFrame {

	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JLabel lb;
	JButton bt1, bt2;
	
	public LambdaGui() {
		super("::LambdaGui::");
		
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		lb=new JLabel(new ImageIcon("myicon.jpg"));
		lb.setText("Welcome to MyApp");
		
		p.add(pN,"North");
		p.add(lb,"Center");
		
		bt1=new JButton("Blue");
		bt2=new JButton("Pink");
		pN.add(bt1);
		pN.add(bt2);
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		
		new LambdaGui();
		
		
	}

}
