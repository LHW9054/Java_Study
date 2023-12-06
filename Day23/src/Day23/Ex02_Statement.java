package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02_Statement {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		
		Scanner sc = new Scanner(System.in);
		String search;
		System.out.print("상품이름을 정확히 입력 : ");
		search = sc.nextLine();
		
		String sql = "select * from product where name = '" + search + "'";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("sql : " + sql);
		while(rs.next()) {
			System.out.println("상품이름 : " + rs.getString("name"));
			System.out.println("상품가격 : " + rs.getString("price"));
		}
		rs.close();
		stmt.close();
		conn.close();
		sc.close();
		
		
		
	}

}
