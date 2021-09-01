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
	<h4>당신이 입력한 정보입니다.</h4>
	입력된 정수 <%=num.getNumber() %>는 10의 자리와 1의 자리가 <%=num.Process(num.getNumber()) %>
</body>
</html>