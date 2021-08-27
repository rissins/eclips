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
	<%@include file = "h01.jsp" %>
	<% Calendar calendar = Calendar.getInstance();
		out.println(calendar.get(Calendar.YEAR)+"-"
					+(calendar.get(Calendar.MONTH)+1)+"-"
					+(calendar.get(Calendar.DATE)));
	%>
	
</body>
</html>