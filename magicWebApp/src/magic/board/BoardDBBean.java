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
		
		int id = board.getB_id();
		int ref = board.getB_ref();
		int step= board.getB_step();
		int level = board.getB_level();
		
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
			
			if (id != 0) {
				sql="update boardt set b_step=b_step+1 where b_ref=? and b_step > ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,  ref);
				pstmt.setInt(2, step);
				pstmt.executeUpdate();
				step = step+1;
				level = level+1;
			} else {
				ref=number;
				step = 0;
				level = 0;
				
			}
			sql="insert into boardt(b_id, b_name, b_email, b_title, b_content, b_date, b_pwd, b_ip, b_ref, b_step, b_level) values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.setString(2, HanConv.toKor(board.getB_name()));
			pstmt.setString(3, board.getB_email());
			pstmt.setString(4, HanConv.toKor(board.getB_title()));
			pstmt.setString(5, HanConv.toKor(board.getB_content()));
			pstmt.setTimestamp(6, board.getB_date());
			pstmt.setString(7, board.getB_pwd());
			pstmt.setString(8, board.getB_ip());
			pstmt.setInt(9, ref);
			pstmt.setInt(10, step);
			pstmt.setInt(11, level);
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
		String sql = "SELECT * FROM BOARDT ORDER BY b_id desc, b_step asc";
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
				boardBean.setB_hit(rs.getInt(7));
//				hit++;
				boardBean.setB_pwd(rs.getString(8));
				boardBean.setB_ip(rs.getString(9));
				boardBean.setB_ref(rs.getInt(10));
				boardBean.setB_step(rs.getInt(11));
				boardBean.setB_level(rs.getInt(12));
				boardList.add(boardBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardList;
		
	}
	
//	public BoardBean getBoard(int bid) {
	public BoardBean getBoard(int bid, boolean hitadd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		BoardBean board = null;
		int hit = 0;
		
		try {
			
			conn = getConnection();
			if (hitadd == true) {
				
				sql = "UPDATE boardt SET b_hit = b_hit + 1 WHERE b_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bid);
				pstmt.executeUpdate();
				pstmt.close();
			}
			
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
//				hit++;
				board.setB_pwd(rs.getString(8));
				board.setB_ip(rs.getString(9));
				board.setB_ref(rs.getInt(10));
				board.setB_step(rs.getInt(11));
				board.setB_level(rs.getInt(12));
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
	
	public int deleteBoard(int b_id, String b_pwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		int re=-1;
		String pwd = "";
		
		try {
			conn = getConnection();
			sql = "select b_pwd from boardt where b_id=?";
			pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1, b_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pwd = rs.getString(1);
				
				if (!pwd.equals(b_pwd)) {
					re=0;
				}else {
					sql="delete boardt where b_id=?";
					pstmt  = conn.prepareStatement(sql);
					pstmt.setInt(1, b_id);
					pstmt.executeUpdate();
					re=1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
		
	}
	
	public int editBoard(BoardBean board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		int re=-1;
		String pwd = "";
		
		try {
			conn = getConnection();
			sql = "select b_pwd from boardt where b_id=?";
			pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getB_id());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pwd = rs.getString(1);
				
				if (!pwd.equals(board.getB_pwd())) {
					re=0;
				}else {
					sql="update boardt set b_name=?, b_email=?, b_title=?, b_content=? where b_id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, HanConv.toKor(board.getB_name()));
					pstmt.setString(2, board.getB_email());
					pstmt.setString(3, HanConv.toKor(board.getB_title()));
					pstmt.setString(4, HanConv.toKor(board.getB_content()));
					pstmt.setInt(5, board.getB_id());
					pstmt.executeUpdate();
					re=1;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return re;
	}
	
}








