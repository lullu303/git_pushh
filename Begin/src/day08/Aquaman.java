package day08;
//Aquaman is a Human
//double speed
public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("플랑크톤",140,444.444);
	}
	
	public Aquaman(String n, int h, double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	//getInfo()메소드를 오버라이드 해보기
	public String getInfo() {
		String info= "이름: "+name+"\n 키: "+height+"\n스피드: "+speed;
		return info;
	}
	
	//getInfo()를 오버로딩 해보기
	
	
	
	
}/////////////////////////////////////
