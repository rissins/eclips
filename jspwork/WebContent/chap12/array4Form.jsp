<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="number" class="question.Array4"></jsp:useBean>
<jsp:setProperty property="*" name="number"/>

<%=number.process(number.getNumber()) %>
</body>
</html>