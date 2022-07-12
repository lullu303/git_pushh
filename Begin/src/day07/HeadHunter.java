package day07;

public class HeadHunter {
	String name;
	int phone;
	String major;
	
	public HeadHunter() {
		this("집게사장", 0, "데이터분석");
		
	}public HeadHunter(String name, int phone) {
		this.name="스폰지밥";
		this.phone=01011111111;
		major="소프트웨어 아키텍처";
		
	}public HeadHunter(int phone, String major) {
		name="집게사장";
		this.phone=110000000;
		this.major="빅데이터 분석";
		
	}public HeadHunter(String major, String name) {
		this.name="핑핑이";
		phone=11;
		this.major="아침은 꼭 먹어야해요";
	}
	
	//초기화---
	public HeadHunter(String name, int phone, String major) {
		this.name=name;
		this.phone=phone;
		this.major=major;
	}
	public String getInfo() {
		String info="헤드헌터 이름: "+name+"\n헤드헌터 연락처: "+phone+"\n분야: "+major;
		return info;
	}
	
	
	
	

}

