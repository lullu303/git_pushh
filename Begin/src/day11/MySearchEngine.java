package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame {
	
	JPanel p=new JPanel();
	JButton na, da, go, ya;
	
	
	public MySearchEngine() {
		super("::MySearchEngine::");
		add(p, "Center");
		
		//p.setLayout(new BorderLayout());
		p.setLayout(new GridLayout(2,2));
		
		na=new JButton("NAVER");
		da=new JButton("DAUM");
		go=new JButton("Google");
		ya=new JButton("Yahoo");
		
		p.add(na, "NORTH");
		p.add(da, "SOUTH");
		p.add(go, "EAST");
		p.add(ya, "WEST");
		
		
		
		//이벤트소스, 이벤트 핸들러 연결하기
		MyEventHandler handler=new MyEventHandler();
		
		na.addActionListener(handler);
		da.addActionListener(handler);
		go.addActionListener(handler);
		ya.addActionListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자
	class MyEventHandler implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==na) {
				na.setBackground(Color.green);
			}else if(obj==da) {
				da.setBackground(Color.cyan);
			}else if(obj==go) {
				go.setBackground(Color.yellow);
			}else if(obj==ya) {
				ya.setBackground(Color.magenta);
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		MySearchEngine my= new MySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
		
	}

}
