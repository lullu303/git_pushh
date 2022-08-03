package com.my.jdbc;
import java.sql.*;
public class MemoSelect {

	public static void main(String[] args)
	throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/schooldb?characterEncoding=UTF-8";
		//프로토콜:dbms유형://host:port/database
		String user="root", pwd="multi123";

		Connection con=DriverManager.getConnection(url, user, pwd);
		String sql="SELECT idx, name, msg, wdate FROM memo ORDER BY 1 DESC";
		PreparedStatement pstmt=con.prepareStatement(sql);
		//SELECT문일 경우: ResultSet executeQuery() 메서드를 호출

	}

}
