package day07;



public class Staff {
	private int no;//사번
	private String name;
	private String dept;//부서
	
	
	//setter
		public void setNo(int n) {
			no=n;
		}
		
		public void setName(String m) {
			name=m;
		}
		public void setdept(String d) {
			dept=d;
		}
		
		//getter
		public int getNo() {
			return no;
		}
		public String getName() {
			return name;
		}
		public String getDept() {
			return dept;
		}
		
		public void showInfo() {
			System.out.println("------직원정보--------");
			System.out.println("사번: "+no);
			System.out.println("이름: "+name);
			System.out.println("부서: "+dept);
		}
	
	
}
