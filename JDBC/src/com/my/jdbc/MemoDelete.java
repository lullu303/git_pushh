package com.my.jdbc;
import java.sql.*;
import java.util.*;
public class MemoDelete {

	public static void main(String[] args) 
	throws Exception
	{	//[1] 스캐너로 삭제할 글 번호를 입력받으세요
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 글 번호를 입력하세요: ");
		String idx=sc.nextLine();
		
		//[2] db에 연결해서 해당 글을 삭제하는 프로그램을 작성하세요
		Class.forName("com.mysql.cj.jdbc.Driver"); //db연결
		String url="jdbc:mysql://localhost:3306/schooldb?characterEncoding=UTF-8";
		String user="root", pwd="multi123";

		Connection con=DriverManager.getConnection(url, user, pwd);
		
		/* String sql="delete from memo where idx="+idx;*/
		String sql="delete from memo where idx=?";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,Integer.parseInt(idx));
		
		int n=pstmt.executeUpdate();
		System.out.println(n+"개의 레코드를 삭제했습니다");
						
		pstmt.close();
		con.close();

		
		
	}

}
