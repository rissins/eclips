<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "circle"  class = "area.Cricle2"></jsp:useBean>
<jsp:setProperty property="*" name="circle"/>
	<hr>
	<h2> 당신이 입력한 정보입니다.</h2>
	반지름이 <%=circle.getRadius() %>인 원의 면적은 <%=circle.Process(circle.getRadius()) %>
	
</body>
</html>


