package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PongApp extends JFrame{

	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta;
	
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd, btSave;
	
	public PongApp() {
		super("::PongApp()::");
		add(p, "Center");
		p.setLayout(new BorderLayout());
		p.add(pN, "North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta=new JTextArea()), "Center");
		
		lb=new JLabel("이     름: ");
		tfName=new JTextField(20);
		btAdd=new JButton("등     록");
		btSave=new JButton("저     장");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		//리스너 부착------
		MyEventHandler handler=new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}//---------------------------------------
	
	class MyEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd) {
				//setTitle("add");
				//1) tfName에 입력한 값을 얻어오기
				//public String getText()
				String name=tfName.getText();
				//System.out.println(name);
				name=name.trim();//앞뒤 공백 제거해서 재할당
				
				try {
					//2) 입력한 값의 '성'을 추출하여 '퐁'씨면 "환영합니다"를 타이틀에 출력하기
					char fname=name.charAt(0);
					if(fname=='퐁') {
						setTitle(name+"님 환영합니다");
						//ta.setText(name);
						ta.append(name+"\n");
					}else if(fname=='콩') {
						//사용자 정의 예외객체를 발생시킨다.==> throw new 예외객체();
						//예외가 발생이 되면 해당 예외를 try~catch해야 한다.
						throw new NotSupportedNameException("콩씨는 등록이 안됨");
					}else {
						throw new NotSupportedNameException("퐁씨가 아닌 사람들은 제한이있음");
					}
				
				}catch(NotSupportedNameException ex) {
					String msg=ex.getMessage();
					setTitle(msg);
				}finally {
					tfName.setText("");
					tfName.requestFocus();//입력 포커스 추가
				}
				
				
				//3) tfName에서 얻어온 값을 ta에 붙이기
				
			}else if(obj==btSave) {
				//setTitle("save");
				
				
			}
		
		
		}
		
	}

	public static void main(String[] args) {
		new PongApp();
		

	}

}
