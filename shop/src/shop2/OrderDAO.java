package shop2;

import static shop2.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//jdbcUtil class : 드라이버로드,connection,close 반복작업을 하나의 클래스에 정의

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//C(insert)R(select)U(update)D(delete) method 작성
	
	
	
	//장바구니 ==> sorder 추가
	public boolean insert(int userId,int productId) {
		boolean status = false;
		
		try {
			con = getConnection();
			String sql = "INSERT INTO sorder(order_id,user_id,procuct_id,order_date) VALUES(order_seq.nextval, ?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);
			
			int result = pstmt.executeUpdate();
			if(result>0) status = true;
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt);
		}
		return status;
	}
	
	
	//장바구니 조회
}
