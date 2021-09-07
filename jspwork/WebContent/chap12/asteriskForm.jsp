<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ast" class = "question.Asterisk"></jsp:useBean>
<jsp:setProperty property="*" name="ast"/>
	입력된 정수 <%=ast.getNumber() %>는 <br>
	<%=ast.process(ast.getNumber()) %>
</body>
</html>