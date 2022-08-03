package com.my.jdbc;
import java.sql.*;
import java.util.*;
public class MemoDelete {

	public static void main(String[] args) 
	throws Exception
	{	//[1] 스캐너로 삭제할 글 번호를 입력받으세요
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 글 번호를 입력하세요: ");
		//[2] db에 연결해서 해당 글을 삭제하는 프로그램을 작성하세요
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schooldb?characterEncoding=UTF-8";
		//프로토콜:dbms유형://host:port/database
		String user="root", pwd="multi123";

		Connection con=DriverManager.getConnection(url, user, pwd);
		
		
	}

}
