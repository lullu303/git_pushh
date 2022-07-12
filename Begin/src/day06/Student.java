package day06;
/** 	 학생=> Student
 * 		속성: 학번, 이름, 학년, 연락처
 * 		기능: 정보를 보여주다, 공부하다....
 * 
 */
public class Student {
	int numb;
	String name;
	int grade;
	String major;
	int smartph;
	
	
	public void sInfo() {
		System.out.println("--------학생 정보---------");
		System.out.println("학생 이름: "+name);
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		System.out.println("연락처: "+smartph);
	}
	

}
