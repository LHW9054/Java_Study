package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03_Delete {
	public static void main(String[] args) {
		
		String sql = ("delete product where idx = %s");
		sql = String.format(sql, 6);
		
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";

//////////////////////////////////////////////////////////////////////////
//		// 내가한거
//		Connection conn = DriverManager.getConnection(url, user, password);
//		Statement stmt = conn.createStatement();
//		
//		int row = stmt.executeUpdate(sql);
//		
//		System.out.println(row != 0 ? "삭제성공" : "삭제실패");
//		System.out.printf("%d 줄이 삭제되었습니다.", row);
//		
//		stmt.close();
//		conn.close();
//////////////////////////////////////////////////////////////////////////
		
//////////////////////////////////////////////////////////////////////////
		// 강사님이 하신거
		
		Connection conn =null;
		Statement stmt =  null;
		int row = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 불러오는데 실패했습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("SQL 예외 발생 : " + e);
		}finally {
			try {if(stmt != null) stmt.close();} catch(Exception e) {}
			try {if(conn != null) stmt.close();} catch(Exception e) {}
		}
		System.out.printf("%d 행이 삭제되었습니다\n", row);
		
		
		System.out.print("\n\t전체목록\n");
//		Ex01.main(null);
		
//////////////////////////////////////////////////////////////////////////
		
		
		
	}
}
