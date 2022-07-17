package DAY02;

public class OperatinEx5 {

	public static void main(String[] args) {
		int num=0B00000101;
		
		System.out.println(num <<2); //왼쪽으로 2비트 이동(20)
		System.out.println(num >>2); //오른쪽으로 2비트 이동(1)
		System.out.println(num >>>2);//오른쪽으로 2비트 이동(1)
		
		System.out.println(num);//기존 값 그대로 출력
		
		num =num<<2; //왼쪽으로 2비트 이동한 값을 다시 num에 대입
		System.out.println(num);
		
		
		
	}

}
