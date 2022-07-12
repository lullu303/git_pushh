package day08;
//Superman is a Human
//Superman is a Object => 객체이다.
public class Superman extends Human{
	int power;

	public Superman() {
		
	}
	public Superman(String n, int h, int p) {
		name=n;
		height=h;
		power=p;
	}
	
	//메소드 오버라이딩(Override)-메소드 재정의
	/*부모로부터 상속받은 메소드를 다시 정의해서 구현하는 것.
	 * -오버라이딩 조건
	 *  [1] 부모의 메소드 이름과 동일하게 구성
	 *  [2] 부모의 것과 매개변수도 동일하게 구성
	 *  [3] 반환타입도 같아야함
	 *  [4] 접근지정자는 부모와 동일하거나 더 넓은 범위의 접근지정자를 사용할 수 있음
	 *  [5] 예외는 부모가 선언한 예외와 동일하거나, 더 구체적인 예외를 발생시킬 수 있다.
	 * */
	public String getInfo() { //내용을 부모와 다르게 재정의 :접근지정자+메소드이름+매개변수
		//String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		String info=super.getInfo()+"\n초능력: "+power;
					//super는 부모로부터 물려받은 변수나 메소드를 참조할때 사용하는 키워드
		return info; //반환타입
		
	}
	//오버라이딩한 메소드를 오버로드해보자. =>자기 클래스에 있는 것을 매개변수를 다르게해서 정의
	public String getInfo(String title) {
		//제목, 이름, 키, 초능력
		String info=title+"\n "+super.getInfo()+"\n초능력: "+power;
		return info;
	}
	//오버로드
	public void getInfo(String title, int up) {
		this.power +=up;
		//제목, 이름, 키, 초능력을 출력하는 명령문 작성
		String info=this.getInfo(title);
		System.out.println(info);
	}
	
	
}////////////////////////////////////////
