package day09;
//정삼각형 :(가로*세로)/2
//Shape추상클래스를 상속받아서 오류 없게 메서드 재정의하기
public class Tryangle extends Shape{

	@Override
	public void area(int x, int y) {
		int t=(x*y)/2;
		System.out.println("삼각형의 면적: "+t);
	}
	
	
}
