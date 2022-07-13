package git_day03;
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학년을 입력하세요=> ");
		int grade=sc.nextInt();
		
		System.out.println("점수를 입력하세요=> ");
		float num =sc.nextFloat();
		
		
	
		
		if(grade==4 && num>=70) {
			System.out.println("합격, 점수: "+num);
			
		} else if(grade==4 && num<=69) {
			System.out.println("불합격, 점수: "+num);
			
		} else if(num >=60) {
			System.out.println("합격, 점수: "+num);
			
		} else {
			System.out.println("불합격, 점수: "+num);
		} 
		
	
		
					
		
		
	}

}
