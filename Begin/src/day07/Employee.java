package day07;

public class Employee {
	
	private String name;
	private int num;//접수번호
	private long phone;//연락처
	private double money;//희망연봉
	
	
	//setter
	public void setEmployee(String name) 
	{ name="박지혜";
	
	}public void setEmployee(int num) {
		num=2017;
		
	} public void setEmployee(long phone) 
	{ phone=0336;
		
	} public void setEmployee(double money) 
	{ money=3000;
	}
	
	
	//getter---
	public String getName1() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public long getPhone() {
		return phone;
	}
	public double getMoney() {
		return money;
	}
	public String getName(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//	public Employee(String n, int nu, long p, double m) {
//		name="박지혜";
//		num=20170336;
//		phone=12345678;
//		money=3000;
//	}
//	public Employee(int nu, long p) {
//		name="박지혜";
//		num=333;
//		phone=55555555;
//	}

}
