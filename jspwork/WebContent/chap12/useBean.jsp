<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id = "radius" class = "area.Circle" scope = "page" > </jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% out.println("<h4>원의 면적 출력하기</h4>"); %>
	
	반지름이 10인 원의 면적은 <%=radius.Process(10) %>
</body>
</html>