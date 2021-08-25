<%@page import="java.util.Calendar"%>
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
		Calendar c = Calendar.getInstance(); 
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
	%>
	<h3>JSP : 현재시간은 <%=hour %>시 <%=minute %>분<%=second %> 초 입니다</h3>
</body>
</html>