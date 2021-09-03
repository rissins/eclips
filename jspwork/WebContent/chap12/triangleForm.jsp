<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="triangle" class = "question.Triangle"></jsp:useBean>
<jsp:setProperty property="*" name="triangle"/>
	<h4>당신이 입력한 정보입니다.</h4>
	입력된 3번의 값인 <%=triangle.getNumber1() %>와 <%=triangle.getNumber2() %>와 <%=triangle.getNumber3() %>은
	삼각형이 <%=triangle.process(triangle.getNumber1(), triangle.getNumber2(), triangle.getNumber3()) %>
</body>
</html>