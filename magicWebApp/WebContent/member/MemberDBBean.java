package magic.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import myUtil.*;

public class MemberDBBean {
	private static MemberDBBean instance=new MemberDBBean();
	
	public static MemberDBBean getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	
	public int insertMember(MemberBean member) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="insert into memberT values(?,?,?,?,?,?)";
		int re=-1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMem_uid());
			pstmt.setString(2, member.getMem_pwd());
			pstmt.setString(3, HanConv.toKor(member.getMem_name()));
			pstmt.setString(4, member.getMem_email());
			pstmt.setTimestamp(5, member.getMem_regdate());
			pstmt.setString(6, member.getMem_address());
			pstmt.executeUpdate();
			
			re = 1;
			pstmt.close();
			conn.close();
			System.out.println("추가 성공");
		} catch (Exception e) {
			System.out.println("추가 실패");
			e.printStackTrace();
		}
		
		return re;
	}
	
	public int confirmID(String id) throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select mem_uid from MEMBERT where mem_uid=?";
		int re=-1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				re = 1;
			} else {
				re = -1;
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return re;
	}
}
















