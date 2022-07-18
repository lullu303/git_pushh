package day11;
import javax.swing.*;
import java.awt.*;
/* 이벤트 처리
 * 	[1] 이벤트 소스
 * 	[2] 이벤트
 * 	[3] 이벤트 핸들러
 * */

public class MyGui extends JFrame {
	JPanel p, pN;
	JTextArea ta;
	JButton bR, bG, bB, bExit;
	
	public MyGui() {
		super("::MyGui::");
		p=new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		add(p, "Center");
		
		p.setLayout(new BorderLayout());
		pN=new JPanel();//FlowLayout
		pN.setBackground(new Color(180,50,100));//r,g,b색상 지정.
		p.add(pN,"North");
		
		ta=new JTextArea("안녕");
		p.add(new JScrollPane(ta), "Center");
		
		bR=new JButton("Red");
		bG=new JButton("Green");
		bB=new JButton("Blue");
		bExit=new JButton("Exit");
		
		pN.add(bR);
		pN.add(bG);
		pN.add(bB);
		pN.add(bExit);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyGui my=new MyGui();
		my.setSize(500,500);
		my.setVisible(true);
		
		
		
	}

}
