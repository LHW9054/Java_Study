package Phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {	// Data Access Object : DB의 데이터에 접근하기 위한 객체

	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 : " + e);
		}
	}
	
	// Connection을 반환하는 함수
	private Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	// Connection, Statement, ResultSet을 역순으로 닫는 함수
	private void close() {
		try { if(rs != null) 	rs.close(); } 	catch(Exception e) {}
		try { if(stmt != null) 	stmt.close(); } catch(Exception e) {}
		try { if(conn != null) 	conn.close(); } catch(Exception e) {}
	}
	
	// phone형태의 데이터를 mapping 하는 함수
	private DTO mapper(ResultSet rs) throws SQLException {
		DTO dto = new DTO();
		dto.setName(rs.getString("name"));
		dto.setAge(rs.getInt("age"));
		dto.setPnum(rs.getString("pnum"));
		return dto;
	}
	
	// 전체 목록 ()
	public ArrayList<DTO> selectAll() {
		ArrayList<DTO> list = new ArrayList<DTO>();
		String sql = "select * from phonebook order by name";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
//				DTO dto = new DTO();
//				dto.setName(rs.getString("name"));
//				dto.setAge(rs.getInt("age"));
//				dto.setPnum(rs.getString("pnum"));
//				list.add(dto);
				list.add(mapper(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		
		return list;
	}
	
	// 추가 (DTO dto)
	public int insert(DTO dto) {
		int row = 0;
		String sql = "insert into phonebook values ('%s', %d, '%s')";
		sql = String.format(sql, dto.getName(), dto.getAge(), dto.getPnum());
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return row;
	}

	// 이름으로 검색 (String name) 	포함하는 이름
	public List<DTO> search(String name) {
		ArrayList<DTO> list = new ArrayList<DTO>();

//		String sql = "select * from phonebook where name like '%%%s%%'";
//		sql = String.format(sql, name);

		String sql = "select * from phonebook where name like '%" + name + "%'";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(mapper(rs));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
				
		return list;
	}
	
	// 단일 조회 (String name) 	일치하는 이름
	public DTO selectOne(String name) {
		DTO dto = null;
		String sql = "select * from phonebook where name = '%s'";
		sql = String.format(sql, name);
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				dto = mapper(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	close();	}
		return dto;
	}

	// 삭제 (String name)
	public int delete(String name) {
		int row = 0;
		String sql = "delete phonebook where name = '%s'";
		sql = String.format(sql, name);
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
				
		return row;
	}
	// 수정 (DTO dto)
	public int update(DTO tmp, String name) {
		String sql = "update phonebook set "
				+ "name = '%s',"
				+ "age = %s,"
				+ "pnum = '%s'"
				+ "	where"
				+ "		name='%s'";
		sql = String.format(sql, tmp.getName(), tmp.getAge(), tmp.getPnum(), name);
		
		return 0;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
