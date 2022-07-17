package DAY02;

public class ImplictiCoversion {

	public static void main(String[] args) {
		byte bNum =10;
		int iNum=bNum; //byte형 값이 int형 변수로 대입됨
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2; //int형 값이 float형 변수로 대입됨
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
		
		char ch1='A';
		System.out.println((int)'A');
		
		int ch2=67;
		System.out.println((char)ch2);
		
		double dNum1=1.2;
		double fNum2=0.9f;
		
		int iNum3=(int)dNum1 +(int)fNum2;
		int iNum4=(int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
	}

}
