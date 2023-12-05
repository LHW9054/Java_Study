package jdbc;

// JDBC : Java DataBase Connectivity
// 자바를 이용하여 DB에 연결하는데 필요한 라이브러리

// ojdbc : Oracle db에 접속하기 위한 jdbc 라이브러리

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		
		// DB에 접속한 이후 실행할 SQL
		String sql = "select * from product order by idx";
//		String sql = "select * from product where price >=3000";
//		String sql = "select * from product where name like '%콜라%'";
//		String sql = "select * from product where name like '%캔%'";
		
		// 특정 벤더사 DB에 접속하기 위한 드라이버 클래스 이름(여기서는 오라클)
		String className = OracleDriver.class.getName();
		
		// DB서버에 접속하기 위한 주소
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		
		// 접속에 사용되는 계정/ 비밀번호
		String user = "c##itbank";
		String password = "it";
		
		
		System.out.println(className);
		
		// 드라이버 클래스를 메모리에 불러온다
		Class.forName(className);
		
		// 주소와 계정, 비밀번호를 전달하여 DB접속을 시도한다. 결과는 연결(Connection)
		Connection conn =  DriverManager.getConnection(url, user, password);
		
		// 연결 상태에 따라 이후 코드를 실행 할 수 있다. 상태가 정상이면 SQL을 전달 할수 있다
		Statement stmt = conn.createStatement();
		
		// SQL문을 실행하여 출력되는 내용을 겨로가 집합으로 가져온다.
		ResultSet rs = stmt.executeQuery(sql);
		
		// 결과 집합은 여러줄(row)로 구성되어 있다. Scanner와 마찬가지로 다음줄이 있으면 반복한다.
		while(rs.next()) {
			int idx = rs.getInt("idx");			// idx컬럼의 값을 정수형태로 가져온다
			String name = rs.getString("name");	// name컬럼의 값을 문자열 형태로 가져온다.
			int price = rs.getInt("price");		// price컬럼의 값을 정수형태로 가져온다.
			Date expiryDate = rs.getDate("expiryDate");	// 날짜형태로 가져온다.
			String memo = rs.getString("memo");	// memo컬럼의 값을 문자열 형태로 가져온다.
			
			// 현재 불러온 줄의 각 컬럼내용을 서식에 맞춰 출력한다.
			System.out.printf("%2s\t%20s\t%,4d\t %s\t %s\n", 
					idx, name, price,expiryDate, memo);
		}
		
		// 작업이 끝났으면, 연결할때의 역순으로 객체를 닫아준다.
		rs.close();			// close()를 제대로 수행하지 않으면
		stmt.close();		// DB의 최대 접속인원수를 초과하여
		conn.close();		// 다음 실행때 접속이 되지 않아서, DB서비를 재시작 해야 한다.
		
		System.out.println("끝");
		
		
		
		
		
	}
}
