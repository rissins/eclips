<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="money" class="question.Money"></jsp:useBean>
<jsp:setProperty property="*" name="money"/>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("�Էµ� �ݾ���"+money.getMoney()+"�� <br>" + money.process(money.getMoney()));
	%>
</body>
</html>