<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="threesix" class = "question.ThreeSixNine"></jsp:useBean>
<jsp:setProperty property="*" name="threesix"/>
	<h4> ����� �Է��� �����Դϴ�.</h4>
	�Էµ� ���� <%=threesix.getNumber() %>�� <%=threesix.process(threesix.getNumber()) %>
</body>
</html>