package day06_multicampus;
import java.util.*;
public class School {
	//School has a students[배열]
	//String[] arr=new String[3];
	static Student1[] arr=new Student1[3];//배열 =>DB역할
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	
	public static void showMenu() {
		System.out.println("**** SchoolApp v1.1*******");
		System.out.println("** 1. 등            록             **");
		System.out.println("** 2. 출            력             **");
		System.out.println("** 3. 검            색             **");
		System.out.println("** 4. 삭            제             **");
		System.out.println("** 9. 종            료             **");
		System.out.println("************************************");
		System.out.println("메뉴 번호를 입력하세요=> ");
		System.out.println("************************************");
		
	}

	public static void register() {
		Student1 s1=new Student1();
		s1.inputInfo();
		System.out.println("----등록한 정보-------");
		s1.showInfo();
		
		System.out.println("입력한 학생 정보를 저장할까요? [1. yes 2. no ] ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1) {
			//s1을 배열에 저장한다.==> arr에 저장하기
			try {
				arr[count]=s1;
				count++;
				//System.out.println(count+ "명 등록 했습니다!!");
				System.out.println("현재 등록된 인원: "+count+"명");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("등록 마감 됐습니다!! [현재 인원: "+count+"명]");
			}
		}
	}//---------------------------------------------------
	/** 등록된 모든 학생정보를 출력하는 메소드*/
	public void printAll() {
		//배열 arr에 저장된 학생 정보를 for루프 이용해서 꺼내서 출력해보기
		// [숙제] while(int num==2) {
		//		System.out.println(arr);
		//		break;
		//		}	
		for(int i=0;i<count;i++) {
			Student1 s=arr[i];
			//System.out.println(s);//s의 주소값 출력됨.
			System.out.println("--학생 정보------");
			s.showInfo();
		
		}
		
	}//-----------------------------------------------------
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School obj=new School();//객체 생성
		int num=0;
		do {
			//showMenu 호출하기
			School.showMenu();
			num=sc.nextInt();
			//메뉴에 없는 번호를 입력했을 경우, "메뉴에 없는 번호입니다. 다시 입력하세요"
			if((num<=0) || (num>4) && num !=9) {
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요");
				continue;
			}
			switch(num) {
			case 1: //학생 등록===>register()메소드 호출하기
				School.register(); //static메소드(클래스 메소드)
				break;
			case 2: //출력 printAll()==> arr에 저장된 학생들의 정보를 
					//반복문 돌면서 출력한다.
				obj.printAll();//메소드 호출 non-static메소드(인스턴스 메소드)
				//=>객체명.printAll();
				break;
			case 3: //검색
				break;
			case 4: //삭제
				break;
			}
			
		}while(num!=9);
		System.out.println("잘가세요~~");
		
		
		
		}

}
