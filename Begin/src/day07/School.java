package day07;

public class School {

	public static void main(String[] args) {
		
		/*[1] 학생 객체를 생성하고, 학번, 이름, 전공값을 할당하세요 */
		/*[2] 교사 객체를 생성하고, 교번, 이름, 담당과목을 할당하세요*/
		/*[3] 직원 객체를 생성하고, 사번, 이름, 소속부서를 할당하세요 */
		
		Student s1=new Student(); 
			s1.setNo(2);
			s1.setName("고길동");
			s1.setMajor("보살");
			
			System.out.println("학생의 학번은 "+s1.getNo());
			System.out.println("학생의 이름은 "+s1.getName());
			String mj=s1.getmajor();
			System.out.println("학생의 전공은 "+mj);
			
			s1.showInfo();
		
		Teacher t1=new Teacher();
			t1.setNo(100);
			t1.setName("징징이");
			t1.setSubject("제발 좀 조용히해!");
			
			t1.showInfo();
			
		Staff st2=new Staff();
			st2.setNo(3);
			st2.setName("둘리");
			st2.setdept("아기공룡");
			
			st2.showInfo();
			
			//문제1]학생 객체를 2개 더 생성하고...
			//        각각 이름,학번,전공 값을 넣어준뒤...
			//			배열에 저장하자.
			//			for루프 돌리면서 저장된 학생 객체들의
			//         정보를 출력해보자.
			Student s2=new Student();
			s2.setNo(0);
			s2.setName("희동이");
			s2.setMajor("데이터과학");
			
			Student s3=new Student();
			s3.setNo(33);
			s3.setName("도우너");
			s3.setMajor("깐따삐야");
			
			Student[] arr1=new Student[3];
			arr1[0]=s1;
			arr1[1]=s2;
			arr1[2]=s3;
			
			for(int i=0;i<arr1.length;i++) {
				Student st=arr1[i];
				//System.out.println(st);
				st.showInfo();
			}
	
			//문제2] 교사 객체 1개 더 생성
			//    값 할당 후 배열에 저장후, 확장 for루프 이용해서 교사정보 출력하기
			
			Teacher t2=new Teacher();
			t2.setNo(4000);
			t2.setName("스폰지밥");
			t2.setSubject("월요일 좋아~~");
			
			Teacher arr2[]= {t1, t2};
			
			for(Teacher tc:arr2) {
				tc.showInfo();
			}
			
			
			
			
	}

}
