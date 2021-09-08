<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String pwd="tiger";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id="", pw="", name="", p1="", p2="", p3="", sclass="";
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		sclass = request.getParameter("mclass");
		p1 = request.getParameter("phone1");
		p2 = request.getParameter("phone2");
		p3 = request.getParameter("phone3");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pwd);
			stmt = conn.createStatement();
			StringBuffer insertQuery = new StringBuffer();
			
			insertQuery.append("insert into member2 values('");
			insertQuery.append(id+"', '");
			insertQuery.append(pw+"', '");
			insertQuery.append(name+"', ");
			insertQuery.append(sclass+", '");
			insertQuery.append(p1+"-"+p2+"-"+p3+"')");
			
			
			System.out.println(insertQuery);
			
			int re = stmt.executeUpdate(insertQuery.toString());
			
			if (re == 1){
	%>
				추가성공
				<br>
				<a href="addForm.html">추가작업</a>
				<a href="viewMember.jsp">검색작업</a>
	<%
			} else {
	%>
				<font color="red">추가실패</font>
	<%
				
			}
		} catch (SQLException se) {
			se.printStackTrace();
	%>
			서버불량 잠시 후 다시시도
	<%
		}
	%>
</body>
</html>