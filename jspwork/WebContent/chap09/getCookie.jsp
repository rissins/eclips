<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>
<%
	Cookie[] cookies = request.getCookies();

	out.print("���� ������ ��Ű�� ����: "+cookies.length);
	out.println("<br><br>");
	
	for(int i=0; i<cookies.length; i++){
		out.print(i+"��° ��Ű�� �̸�:" +cookies[i].getName());
		out.println("<br><br>");
		out.print(i+"��° ��Ű�� �̸�:" +cookies[i].getValue());
		out.println("<br><br>");
	}

%>