package git_day03;
import java.util.*;
public class alphabet {

	public static void main(String[] args) {
		String alpa;
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("알바펫 소문자를 입력하세요");
		alpa = sc.next();
		
		char beta = alpa.charAt(0);
		
		switch(beta) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				System.out.println("모음입니다");
				break;
			
		default :
			System.out.println("자음입니다");
		
		}
		
				
		
		
		
		
		
		
	}

}
