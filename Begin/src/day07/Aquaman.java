package day07;

public class Aquaman {
	String name;
	int height;
	double speed;
	/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다.
	 * 한 개라도 생성자를 구성하게되면, 제공되던 디폴트 생성자는 사라진다.
	 * =>가능하면 기본생성자를 구성한 뒤에, 다른 생성자를 구성.
	 * */
	//this이용해서 초기화하세요
	//매개변수 3개 받는 생성자 구성해보기
	public Aquaman() { //기본생성자 구성하기
		this("아쿠아맨", 160, 70);
		/* name="아쿠아맨";
		height=160;
		speed=70;*/
	}
	 public Aquaman(String n, int h, double s) { //인자 생성자 3개 만들기
		name=n;
		height=h;
		speed=s;
	}
	
	public Aquaman(int height, int power) {
		name="아쿠아맨이돌아왔다";
		this. height=230;
		this. speed=800;
	}
	public Aquaman(int power) {
		name="아쿠아맨이 돌아올까?";
		height=250;
		this. speed=2000;
	}
	
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed;
		return info;
		
		
	}

}////////////////////////////////////
