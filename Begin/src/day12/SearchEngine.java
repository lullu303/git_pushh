package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel {
	
	//컨테이너의 바깥 여백을 주는 메서드를 오버라이딩하자.
	@Override
	public Insets getInsets() {
		Insets in=new Insets(10, 10, 10, 10);//top left bottom right순서
		return in;
	}
	
}//-----------------------------


public class SearchEngine extends JFrame{
	JPanel p=new MyJPanel();//FlowLayout =>GridLayout변경
	
	JButton[] bt=new JButton[4];
	String [] str= {"Naver", "Google", "Daum", "Yahoo"};

	public SearchEngine() {
		super("::SearchEngine::");
		add(p, "Center");
		// GridLayout(int row, int col, int hgap, int vgap)
		p.setLayout(new GridLayout(2,2,10,10));//2행2열
		
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
		}
		//버튼에 대한 이벤트 처리를 anonymous class로 해보자.
		bt[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.green);
				setTitle(str[0]+"버튼입니다");
			}
			
		} );
		
		bt[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.white);
				setTitle(str[1]+"버튼입니다");
			}
			
		} );
		
		bt[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//이벤트가 발생된 객체=>bt[2]
				String cmd=e.getActionCommand();//이벤트 소스의 라벨문자열을 반환한다
				setTitle(cmd);
				((JButton)obj).setBackground(Color.blue);
			}
			
		} );
		
		bt[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//이벤트가 발생된 객체=>bt[3]
				String cmd=e.getActionCommand();//이벤트 소스의 라벨문자열을 반환한다
				setTitle(cmd);
				((JButton)obj).setBackground(Color.yellow);
			}
			
		} );
		
			
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-----------------------------
	

	public static void main(String[] args) {
		SearchEngine my=new SearchEngine();
		my.setSize(500,500);
		my.setVisible(true);
		
		
	}

}
