package git_day03;
import java.util.*;
public class whileint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0, n=0;
		double sum=0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력=> ");
		
		while((n = sc.nextInt()) != 0) { // 3 0
			sum = sum + n; //num=3
			count++;
		
		}
		
		System.out.println("수의 개수는: "+count+"개 이고,");
		System.out.println("평균은: "+sum/count+ "이다.");
		
		
		
		
		
		
	}

}
