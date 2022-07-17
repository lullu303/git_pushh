package DAY02;

public class ifExample3 {

	public static void main(String[] args) {
		int score =90;
		char grade=' ';
		
		if (score >=90) {
			grade = 'A';
			System.out.println(grade+"학점 입니다.");
						
		}else if(score <=89 && score >=80) {
			grade ='B';
			System.out.println(grade+"학점 입니다.");
			
		}else if(score <=79 && score >=70) {
			grade ='C';
			System.out.println(grade+"학점 입니다.");
		}else if(score <=69 && score >=60) {
			grade ='D';
			System.out.println(grade+"학점 입니다.");
		}else {
			grade ='F';
			System.out.println(grade+"학점 입니다.");
		}
		
		System.out.println("수고하셨습니다.");
		
		
		
		
		
	}

}
