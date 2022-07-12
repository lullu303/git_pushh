package day07;

public class Person {
	
	String name;
	int age;
	//생성자(Constructor): 객체를 생성할 때 호출되는 메소드의 일종
	/*-규칙
	 * <1> 생성자 이름은 클래스 이름과 동일하게
	 * <2> 반환타입은 명시하지 않는다.
	 * 
	 * public 생성자명(){
	 * 
	 * }
	 * */
	public Person() { //기본생성자= default constructor :매개변수 받아들이지않음.
		name="아무개";
		age=1;
	}
	public Person(int age) {
		this.age=age;
		name="스폰지밥";
	}
	public Person(String name) {//인자생성자= constructor using fields :매개변수 사용 생성자
		this.name=name;
		age=25;
	}
	public Person(String name, int age) { //인자생성자
		this.name=name;
		this.age=20;
	}
	public Person(int age, String name) { //인자생성자
		this.name=name;
		this.age=26;
	}
	/* 오버로딩이란?-------^
	 * - 동일한 메소드 이름을 여러 개 구성하는 것(다중정의, 중복정의)
	 * - 매개변수의 자료형이 다르거나, 갯수가 다르거나, 순서를 다르게 구성해야 한다.
	 * - 반환타입은 달라도 되고, 같아도 된다.
	 * */
	
	
	

}///////////////////////////////////
