package day07;

public class JobApp {
	/* #구인 구직 프로그램을 작성한다고 가정합시다

	[1] 잡코리아나 사람인 사이트를 살펴보고
	해당 프로그램에 필요한 객체를 2개 추출하세요
	 ex) 구직자, 구인회사, 헤드헌터,...

	[2] 추출한 객체를 class로 구성하세요.
	이때  속성은 3개 이상, 메소드(희망연봉 등)는 2개 이상 구성하세요

	[3] 속성은 3개면 3개 다 캡슐화하고, setter와 getter를 구성하세요

	[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩
	==>this()이용해서 초기화하기
	
	[5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
	JobApp==>main()메소드 구성해서
 */
//////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		System.out.println("--구직자 정보-------------");
		Employee cm=new Employee();
		
		//System.out.println("구직자 이름: "+cm.getName("박지혜"));
		System.out.println("구직자 접수번호: "+cm.getNum());
		System.out.println("구직자 연락처: "+cm.getPhone());
		System.out.println("희망연봉: "+cm.getMoney());
		
		
		
		//////////////////////////////////////////////////////////
		
		System.out.println("--기업 정보-------------");
		//Company c=new Company(); //기본생성자 호출
		//System.out.println(c.getInfo());
		
		System.out.println("기업1: ");
		Company c1=new Company();
		System.out.println("기업 이름: "+c1.name);
		System.out.println("기업 구분: "+c1.sub);
		System.out.println("사원  수: "+c1.people);
		System.out.println("매 출 액: "+c1.sales);
		
		System.out.println("기업2: ");
		Company c2=new Company();
		String str=c2.getInfo();
		System.out.println(str);
		
		System.out.println("--헤드헌터 정보-------------");
		//HeadHunter
		
		HeadHunter h=new HeadHunter();
		System.out.println(h.getInfo());
		
		
	}
	
	
	
}
