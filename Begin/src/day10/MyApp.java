package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
	
	public MyApp() {
		super("::MyApp::");
		JPanel p =new JPanel();
	//	p.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		
		 
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500,500);
		my.setVisible(true);
		
	}

}
