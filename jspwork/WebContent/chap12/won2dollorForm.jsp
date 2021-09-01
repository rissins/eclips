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
<h4>당신이 입력한 정보입니다</h4>
입력된 원화가 <%=won.getWon() %>원은 $<%=won.Process(won.getWon()) %>
</body>
</html>