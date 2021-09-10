<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn=null;
		DataSource ds=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
	%>
	<%
		try{
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			conn = ds.getConnection();
			System.out.println("DBCP 연동 성공");
			
			StringBuffer selectQuery=new StringBuffer();
			selectQuery.append("SELECT name, class, tel FROM MEMBER2 where id=?");
			String id = request.getParameter("id");
			psmt = conn.prepareStatement(selectQuery.toString());
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()){
	%>
				<form method="post" action="updateProcess.jsp">
					아이디 : <input type="text" name="id" readonly value="<%= id %>"><br>
					이름 : <input type="text" name="name" value="<%= rs.getString("name") %>"><br>
					회원등급 : <input type="text" name="mclass" value="<%= rs.getString("class") %>"><br>
					전화번호 : <input type="text" name="tel" value="<%= rs.getString("tel") %>"><br>
					<input type="submit" value="수정"><br>
					<a href="viewMember.jsp">목록보기</a>
				</form>
	<%
			}else{
	%>
				<font color="red">아이디 없3~~~</font>
				<a href="viewMember.jsp">목록보기</a>
	<%
			}
		}catch(NamingException ne){
			ne.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>
</body>
</html>














