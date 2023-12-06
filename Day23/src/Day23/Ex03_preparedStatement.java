package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex03_preparedStatement {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Scanner sc = new Scanner(System.in);
		String search;
		System.out.print("상품이름을 정확히 입력 : ");
		search = sc.nextLine();
		
//		String sql = "select * from product where name = '" + search + "'";
		String sql = "select * from product where name = ?";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
//		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, search);
		ResultSet rs = pstmt.executeQuery(sql);
		
		System.out.println("sql : " + sql);
		while(rs.next()) {
			System.out.println("상품이름 : " + rs.getString("name"));
			System.out.println("상품가격 : " + rs.getString("price"));
		}
		rs.close();
		pstmt.close();
		conn.close();
		sc.close();
		
		
		
	}
}
