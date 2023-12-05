package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02_Insert {
	public static void main(String[] args) throws SQLException{
		
		String sql = "insert into product values (%s, '%s', %s, '%s', '%s')";
		sql = String.format(sql, 6, "맥스웰 하우스 마스터 라떼(PET)", 2600, "24/06/30", "1+1");
		
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		
		int row = stmt.executeUpdate(sql);
		
		System.out.println(row != 0 ? "추가성공" : "추가실패");
		System.out.printf("%d 줄이 추가되었습니다.\n", row);
		
		stmt.close();
		conn.close();
		
		
		
		
		
	}
}
