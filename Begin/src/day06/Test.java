package day06;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		
		int[] coinUnit = {500, 100, 50, 10};
		
		System.out.println("가지고 있는 돈을 입력하세요=>" );
		int money = sc.nextInt();
		System.out.println("원= "+money);
		System.out.println("----------------------");		
		for(int i=0;i<coinUnit.length;i++) {
			int su=money/coinUnit[i];
			System.out.println(coinUnit[i]+"원: "+su);
			money=money%coinUnit[i];			
					
		}
					
				
//	}catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("500원을 먼저 거슬러 줘야 해요!");
//	}catch(NumberFormatException e) {
//		System.out.println("100원을 먼저 거슬러 줘야 해요!");
//	}catch(Exception e) {
//		System.out.println("기타 예외: "+e);
//	}
	

	}

}
