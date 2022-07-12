package day07;

public class Superman {
	String name;
	int height;
	int power;//초능력
	
	public Superman() { //기본생성자 구성하기
		this(166,100,"슈파걸");
		//this() : 자기자신의 생성자를 호출할 때 사용한다.
		//			생성자 안에서만 호출할 수 있으며,
		//			제일 첫번째 문장이어야 한다.
		/*name="슈퍼맨";
		height=160;
		power=9000;*/
		//System.out.println("생성자 어쩌고...");
	}
	
	//인자 생성자 3개 만들기
	public Superman(String name) { 
		this(3000, 150, name);
		/* this.name=name;
		height=140;
		power=1000;*/
	}
	public Superman(int height, int power) {
		//this(130, 8000, name);
		name="슈퍼맨이돌아왔다";
		this. height=130;
		this. power=8000;
	}
	public Superman(int power) {
		/* name="슈퍼맨이 돌아올까? 돌아오다 말았을까?";
		height=150;
		this. power=3000;*/
	}
	//target : 여기서 초기화를 하자...
	public Superman(int power, int height, String name) {
		this. name=name;
		this. height=150;
		this. power=3000;
		
		
		
	}
	//---------------------------------------------
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}
	
}///////////////////////////////////
