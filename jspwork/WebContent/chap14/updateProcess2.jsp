<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.Context"%>
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
		Connection conn = null;
		PreparedStatement pstmt = null;
	%>
	<%
		try{
			conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
		} catch (NamingException ne){
			ne.printStackTrace();
		} catch (SQLException se){
			se.printStackTrace();
		}
	
		String id="", name="", vclass="", tel="";
		id = request.getParameter("id");
		name= request.getParameter("name");
		vclass = request.getParameter("mclass");
		tel = request.getParameter("tel");
		
		StringBuffer updateQuery = new StringBuffer();
		updateQuery.append("update member2 set name=?, class=?, tel=? where id=?");
		
		try{
			pstmt = conn.prepareStatement(updateQuery.toString());
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(vclass));
			pstmt.setString(3, tel);
			pstmt.setString(4, id);
			int re = pstmt.executeUpdate();
			
			if(re == 1){
	%>
				<%= id %>�� ������ �����Ǿ����ϴ�.<br>
				[<a href="viewMember.jsp">��Ϻ���</a>]
	<%
			} else {
	%>
				���� ����
	<%
			}
		} catch(SQLException se){
			se.printStackTrace();
	%>
			�����ҷ� ��� �� �ٽ� �õ�
	<%
			}
	%>

</body>
</html>