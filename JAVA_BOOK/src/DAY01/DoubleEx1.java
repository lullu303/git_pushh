package DAY01;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum= 3.14;
		float fnum =3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum1=1;
		
		for(int i=0;i<10000;i++) {
			dnum1 =dnum1+0.1;
		}
		System.out.println(dnum1);
		
	}

}
