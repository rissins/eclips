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
	<% out.println("<h4>���� ���� ����ϱ�</h4>"); %>
	
	�������� 10�� ���� ������ <%=radius.Process(10) %>
</body>
</html>