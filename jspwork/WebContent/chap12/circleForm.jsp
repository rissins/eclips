<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "circle"  class = "area.Cricle2"></jsp:useBean>
<jsp:setProperty property="*" name="circle"/>
	<hr>
	<h2> ����� �Է��� �����Դϴ�.</h2>
	�������� <%=circle.getRadius() %>�� ���� ������ <%=circle.Process(circle.getRadius()) %>
	
</body>
</html>


