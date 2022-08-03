package com.my.jdbc;

import java.sql.DriverManager;
import java.sql.*;
public class MemoInsert {

	public static void main(String[] args) 
	throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schooldb?characterEncoding=UTF-8";
		//프로토콜:dbms유형://host:port/database
		String user="root", pwd="multi123";
		
		Connection con=DriverManager.getConnection(url, user, pwd);
		//db연결
		String sql="insert into memo(name, msg, wdate) values('맹구','오늘 하루도 무사히..',now())";
		Statement stmt=con.createStatement();
		//stmt.execute(sql); ==> 모든 sql문을 실행시키는 메서드
		//dml문장(insert/update/delete)==> int executeUpdate(String sql)
		int n=stmt.executeUpdate(sql);
		//n: sql문에 의해 영향받은 레코드 수를 반환한다.
		System.out.println(n+"개의 메모글을 등록했습니다!!");
		stmt.close();
		con.close();
	}

}
