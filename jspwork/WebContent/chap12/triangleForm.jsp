<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="triangle" class = "question.Triangle"></jsp:useBean>
<jsp:setProperty property="*" name="triangle"/>
	<h4>����� �Է��� �����Դϴ�.</h4>
	�Էµ� 3���� ���� <%=triangle.getNumber1() %>�� <%=triangle.getNumber2() %>�� <%=triangle.getNumber3() %>��
	�ﰢ���� <%=triangle.process(triangle.getNumber1(), triangle.getNumber2(), triangle.getNumber3()) %>
</body>
</html>