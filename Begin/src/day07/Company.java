package day07;

public class Company {
	String name;
	String sub;//기업구분
	int people;//사원 수
	double sales;//매출액
	
	public Company() { //기본 생성자 구성하기
		//초기화--
			this.name=name;
			this.sub=sub;
			this.people=7;
			this.sales=3000;
	}
	
	public Company(int people, double sales) {
		name="네이버";
		sub="대기업";
		people=4;
		sales=400;
	}
	public Company(double sales,int people) {
		name="코레일";
		sub="공기업";
		people=50;
		sales=500;
	}
	
	
	
	public String getInfo() {
		String info="기업 이름: "+name+"\n기업 구분: "+sub+"\n사원  수: "+people+"\n매 출 액: "+sales;
		return info;
	}
	
	//this("KERIS", "공기업", 3, 2.13);

}
