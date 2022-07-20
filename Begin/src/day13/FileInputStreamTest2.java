package day13;
import java.io.*;
/*FileInputStream
 * -1byte 기반 스트림
 * -Node 스트림 => 파일과 노드 연결한다
 * -이미지, 멀티미디어, 바이너리 파일 등을 읽을 때 사용한다.
 * 
 * byte배열에 담아서 읽고 쓰세요
 * */
public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException
	{
		
		String fileName="src/day13/InputStreamTest.java";
		String fileName2="c:/myjava/InputStreamTest_Copy.txt";
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream(fileName);
		FileOutputStream fos=new FileOutputStream(fileName2);
		
		
		int n=0;
		int cnt=0, total=0;
		
		byte[] arr=new byte[1024];
		
		while((n=fis.read(arr)) !=-1) {
			//파일의 끝에 도달하면 -1을 반환한다.
			//System.out.write(arr, 0, n);
			//System.out.flush();
			fos.write(arr, 0, n);
			fos.flush();
			
			cnt++;
			total+=n;
		}
		System.out.println("총 파일의 크기: "+total+"bytes");
		System.out.println(fileName2+"에 카피 완료!");
		fis.close();
		fos.close();
		System.out.close();
	}

}
