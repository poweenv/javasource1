package shop2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static shop2.JdbcUtil.*;

/*
 	 JdbcUtil 메소드 호출하는
 	 
 	 1) static : 메소드이므로 클래스이름.메소드명(),
 	 2) Jdbc 클래스 안 메소드가 모두 static 라명
 	 	import static jdbcUtil.*; ==> 메소드명()마 써도됨
 	 	
 	 	jdbcUtil.getConnection();
 */
public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	
	public boolean insert(int userId, String name, int payNo) {
		boolean status = false;
		try {
			con = getConnection();
			
			// super insert
			String sql = "insert into suser(user_id,name,pay_no) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setInt(3,payNo);
			
			
			int result = pstmt.executeUpdate();
			if(result >0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
		}
		return status;
	}
	
	//전체 조회 - select
	public List<UserDTO> getList() {
		List<UserDTO> list = new ArrayList<>();
		
		try {
		
			con = getConnection();
			String sql = "select * from suser";
			
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
//				UserDTO dto = new UserDTO(rs.getInt(0),rs.getString(2),rs.getInt(3));
//				list.add(dto);
				
				list.add(new UserDTO(rs.getInt(1),rs.getString(2),rs.getInt(3)));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return list;
	}
	
}
