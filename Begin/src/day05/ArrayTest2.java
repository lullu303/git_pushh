package day05;

public class ArrayTest2 {

	public static void main(String[] args) {
		// [1] float유형의 배열을 선언하여 크기는 3만큼 주세요
		//		저장할 데이터는 -16.456, 200.5, 30e3 입니다
		// 		데이터를 저장한 뒤 for루프 이용해서 저장된 값을 출력하고
		//		배열에 저장된 값의 총합과 평균값도 구해 출력해 보세요.
		
		float arr2[]=new float[3];
		arr2[0]=(float)-16.456;
		arr2[1]=(float)200.5;
		arr2[2]=(float)30e+3;
		float s=0;
		for(float c=0;c<3;c++); {
			System.out.println("arr2.="+arr2[0]);
			s=s+arr2[0];
			}
			 System.out.println("총합="+s);
			 System.out.println("평균="+s/3);
	}

}



//public class ArrayTest2 {
//	public static void main(String[] args) {
//		float [] f = new float[3];
//		f[0]=-16.456f; f[1]=200.5f; f[2]=30e3f;
//		float s = 0;
//		for(int i=0; i<3; i++) {
//			System.out.println("f["+i+"]="+f[i]);
//			s = s+f[i];
//		}
//		System.out.println("총합="+s);
//		System.out.println("평균="+s/3);
//	}
//}
