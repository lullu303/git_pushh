package DAY03;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		
		int sum=add(num1,num2);
		System.out.println(num1+ "+"+num2+"="+sum+"입니다.");
		
		int sum2=substract(num1,num2);
		System.out.println(num1+"-"+num2+"="+sum2+"입니다");
		
		int sum3=times(num1,num2);
		System.out.println(num1+"*"+num2+"="+sum3+"입니다");
		
		double sum4=divide(num1,num2);
		System.out.println(num1+"/"+num2+"="+sum2+"입니다");
	}

	public static int add(int n1, int n2) {
		int result=n1+n2;
		return result;
	}
	
	public static int substract(int n1, int n2) {
		int result=n1-n2;
		return result;
	}
	
	public static int times(int n1, int n2) {
		int result=n1*n2;
		return result;
	}
	
	public static double divide(double n1, double n2) {
		double result=n1/n2;
		return result;
	}
	
	
}
