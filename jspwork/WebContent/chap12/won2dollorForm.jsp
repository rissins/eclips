<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="won" class = "question.Won2Dollor"></jsp:useBean>
<jsp:setProperty property="*" name="won"/>
<hr>
<h4>����� �Է��� �����Դϴ�</h4>
�Էµ� ��ȭ�� <%=won.getWon() %>���� $<%=won.Process(won.getWon()) %>
</body>
</html>