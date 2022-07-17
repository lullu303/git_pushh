package DAY02;

public class NestedLoop {
	public static void main(String[] args ) {
		int dan;
		int times;
		
		for(dan=2; dan <=9; dan++) {
			for(times =1; times <=9; times++) {
				System.out.println(dan +"X"+times +"="+dan*times);
			}
			System.out.println();
		}
		
		int dan2;
		int timess;
		
		for(dan2=3; dan2 <=7; dan2++) {
			for(timess =1; timess <=9; timess++) {
				System.out.println(dan2+"X"+timess + "="+dan2*timess);
			}
		}
		
		
		
		
	}
}
