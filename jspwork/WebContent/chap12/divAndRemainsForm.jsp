<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="num" class = "question.DivAndRemains"></jsp:useBean>
<jsp:setProperty property="*" name="num"/>
	<h4>����� �Է��� �����Դϴ�.</h4>
	�Էµ� ���� <%=num.getNumber() %>�� 10�� �ڸ��� 1�� �ڸ��� <%=num.Process(num.getNumber()) %>
</body>
</html>