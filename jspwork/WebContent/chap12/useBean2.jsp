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
	<% out.println("<h4>���� ���� ����ϱ�</h4>"); %>
	<%! int width = 20;
		int length = 30;
	%>
	���� <%=width %>, ���� <%=length %>�� �簢���� ������ <%= area.Process(width, length) %>
</body>
</html>