package day12;
/* 매개변수 2개를 받아서 두 수 중 큰수를 변환하는 함수를 람다식으로 구현해보자.
 * [1] 람다식을 구현하기 위해서는 먼저 인터페이스를 만들어야 한다.
 * [2] 인터페이스에 람다식으로 구현할 추상메소드를 선언해야 한다.
 * */
@FunctionalInterface
interface MyNum{
	int getMax(int a, int b);
	//추상메서드는 하나만 선언해야 함.
	//int getMin(int a, int b);[x]
}///////////////////람다식에서 구현할 메서드




public class LambdaTest1 {

	public static void main(String[] args) {
		MyNum m1= (int x, int y)->{
			if(x>=y) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println(m1.getMax(55, 77));
		System.out.println(m1.getMax(-2, 0));
		
		MyNum m2=(a,b) -> (a>=b)? a:b;
		System.out.println(m2.getMax(71, 90));	
		
		
		
	}

}
