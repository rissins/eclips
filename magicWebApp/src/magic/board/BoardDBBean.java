package magic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import myUtil.HanConv;

public class BoardDBBean {
	private static BoardDBBean instance = new BoardDBBean();
	public static BoardDBBean getInstace() {
		return instance;
	}
	public Connection getConnection() throws Exception{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	public int insertBoard(BoardBean board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		int number;
		
		try {
			conn = getConnection();
			
			sql="select max(b_id) from boardt";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				number = rs.getInt("max(b_id)")+1;
			} else {
				number = 1;
			}
			
			sql="insert into boardt(b_id, b_name, b_email, b_title, b_content, b_date) values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.setString(2, HanConv.toKor(board.getB_name()));
			pstmt.setString(3, board.getB_email());
			pstmt.setString(4, HanConv.toKor(board.getB_title()));
			pstmt.setString(5, HanConv.toKor(board.getB_content()));
			pstmt.setTimestamp(6, board.getB_date());
			int result =pstmt.executeUpdate();
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {	
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return -1;
	}
	
	
	public ArrayList<BoardBean> listBoard(){
		Connection conn = null; 
		ResultSet rs = null;
		String sql = "SELECT * FROM BOARDT ORDER BY b_id";
		int hit = 0;
		ArrayList<BoardBean> boardList = new ArrayList<BoardBean>();
		try {
			conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardBean boardBean = new BoardBean();
				boardBean.setB_id(rs.getInt(1));
				boardBean.setB_name(rs.getNString(2));
				boardBean.setB_email(rs.getNString(3));
				boardBean.setB_title(rs.getNString(4));
				boardBean.setB_content(rs.getNString(5));
				boardBean.setB_date(rs.getTimestamp(6));
//				boardBean.setB_hit(rs.getInt(6));
				boardBean.setB_hit(hit);
				hit++;
				boardList.add(boardBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
		
	}
	
	public BoardBean getBoard(int bid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		BoardBean board = null;
		int hit = 0;
		
		try {
			
			conn = getConnection();
			sql = "UPDATE board SET b_hit = b_hit + 1 WHERE b_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			pstmt.close();
			
			sql = "select * from boardt where b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardBean();
				board.setB_id(rs.getInt(1));
				board.setB_name(rs.getString(2));
				board.setB_email(rs.getString(3));
				board.setB_title(rs.getString(4));
				board.setB_content(rs.getString(5));
				board.setB_date(rs.getTimestamp(6));
				board.setB_hit(rs.getInt(7));
				hit++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return board;
		
	}
	
}








