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
		
		ResultSet rs=pstmt.executeQuery();
		//결과 테이블을 rs가 참조한다.
		//ResultSet의 주요 메서드
		/* [1] boolean next() : 
		 * [2]XXX getXXX("컬럼명") 
		 * 
		 * 
		 * */
		while(re.next()) {
			int idx=rs.getInt("idx");
			String name=rs.getString("name");
			String content=rs.getString("msg");
			java.sql.Date wdate=rs.getDate("wdate");
			System.out.println(idx+"\t"+name+"\t"+content+"\t"+wdate);
		}
		rs.close();
		pstmt.close();
		con.close();
	}

}
