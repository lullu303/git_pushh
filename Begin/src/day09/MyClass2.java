package day09;
interface Inter1{
	void a();
}//////////////////////////

interface Inter2{
	String b();
}/////////////////////////

abstract class AbsClass{
	abstract void c();
}////////////////////////
//인터페이스가 인터페이스를 상속받을 때는 extends로 상속받고, 다중상속도 가능하다.
interface HisInter extends Inter1, Inter2 {
	String STR="Hello";
}///////////////////////
//[1] MyClass2가 AbsClass와 HisInter를 상속받도록 하세요
//	에러 없게 처리하세요


public class MyClass2 extends AbsClass implements HisInter {
										//추상클래스는 implements
	@Override
	void c() {
		System.out.println("c()@@@");
	}
	@Override
	public void a() {
		System.out.println("a()###");
		
	}
	@Override
	public String b() {
		return "b()$$$$";
	}
	
	
	public static void main(String[] args) {
		//[2] MyClass2타입의 객체 생성해서 메서드 각각 호출하고 STR값도 출력해보기
		MyClass2 c2=new MyClass2();
		c2.c();
		c2.a();
		System.out.println(c2.b());
		System.out.println("---------------------------------------------");
		//[3] HisInter타입의 변수 선언하고 MyClass2 객체 생성해서 메서드 각각 호출하고 STR값도 출력해보기
		HisInter hi=new MyClass2();
		hi.a();
		System.out.println(hi.b());
		// hi.c();[x]
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
		System.out.println("---------------------------------------------");
		//[4] AbsClass타입의 변수 선언하고 MyClass2 객체 생성해서 메서드 각각 호출하고 STR값도 출력해보기
		AbsClass ac=new MyClass2();
		ac.c();
		//ac.a();[x]
		((MyClass2)ac).a();
		//ac.b();[x]
		((MyClass2)ac).b();
		
		
		
		
	}

}
