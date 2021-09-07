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
		out.println("입력된 금액이"+money.getMoney()+"는 <br>" + money.process(money.getMoney()));
	%>
</body>
</html>