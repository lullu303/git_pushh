package day09;
import javax.swing.*;
import java.awt.*;
//CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
//GUI : Graphic User Interface
//JFrame : Window 계열의 컨테이너
//			반드시 사이즈를 정해주고 setVisivle(true)를 주어야 화면에 보여짐

//JPanel : Panel계열의 컨테이너 
public class MyGui extends JFrame {
	JPanel p;
	JButton bt1, bt2, bt3; //Component(부품)
	Icon icon1, icon2, icon3, icon4, icon5;
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui() {
		super(":: MyGui Prongram");//타이틀에 문자열이 올라간다
		p=new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다.
		p.setBackground(Color.pink);
		icon1=new ImageIcon("icon1.png");
		icon2=new ImageIcon("icon2.png");
		icon3=new ImageIcon("icon3.png");
		icon4=new ImageIcon("icon4.png");
				
		bt1=new JButton(icon1);
		bt2=new JButton("Home", icon2);
		bt2.setHorizontalTextPosition(JButton.CENTER);//텍스트 위치를 수평의 중앙에 위치
		bt2.setVerticalTextPosition(JButton.TOP);//수직의 탑에 위치
		bt3=new JButton("Login", icon3);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.BOTTOM);
		bt3.setPressedIcon(icon4);
		bt3.setRolloverIcon(icon2);
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tf1=new JTextField(20);
		tf2=new JTextField("빛나라 지식의 별", 30);
		tf1.setBackground(Color.gray); //ㅂ경색
		tf2.setBackground(Color.blue);
		tf1.setForeground(Color.white); //글자색
		
		ta1=new JTextArea("하읭 방가방가~~", 5, 20);
		ta2=new JTextArea(10,30);//rows:10, columns:30
		
		p.add(tf1);
		p.add(tf2);
		//JTextArea는 JScrollPane에 붙여야 스크롤바가 붙는다.
		JScrollPane sp=new JScrollPane(ta1);
		p.add(sp);
		
		p.add(new JScrollPane(ta2));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창닫기 처리-프로세스 종료
	}//생성자-----------------------
	
	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame
		my.setSize(500, 500);//폭, 높이
		my.setVisible(true);
		
		
		
		
		
	}

}
