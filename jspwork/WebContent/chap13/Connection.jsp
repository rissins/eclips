<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
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
	<%
	      Connection conn = null;
	      try{
	         String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String user = "scott";
	         String password = "tiger";
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         DriverManager.getConnection(url, user, password);
	         out.print("데이터베이스 연결에 성공했습니다.");
	      } catch(SQLException ex){
	         out.print("데이터베이스 연결을 실패했습니다.");
	         out.print("SQLException"+ex.getMessage());
	      } finally {
	         if (conn != null){
	            conn.close();
	         }
	      }
	      
%>
</body>
</html>