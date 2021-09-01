<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id = "area" class = "area.Rectangle"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% out.println("<h4>원의 면적 출력하기</h4>"); %>
	<%! int width = 20;
		int length = 30;
	%>
	가로 <%=width %>, 세로 <%=length %>인 사각형의 면적은 <%= area.Process(width, length) %>
</body>
</html>