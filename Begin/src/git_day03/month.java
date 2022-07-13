package git_day03;
import java.util.*;
public class month {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력하세요:  ");
		int month=sc.nextInt();
		
		String season=" ";
		switch(month) {
			case 12,1,2 :
				season = "winter";
				break;
			case 3, 4, 5 :
				season = "spring";
				break;
			case 6, 7, 8 :
				season = "summer";
				break;
			default:
				System.out.println("없는 달 입니다");
				return;
		}
		System.out.println(month+"월은"+season+"입니다");
		
		
		
		
		
		
		
		
	}

}
