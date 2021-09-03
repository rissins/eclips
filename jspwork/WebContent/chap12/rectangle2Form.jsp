<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rectangle" class = "question.Rectangle"></jsp:useBean>
<jsp:setProperty property="*" name="rectangle"/>
<h4>당신이 입력한 정보입니다.</h4>
(<%=rectangle.getX() %>,<%=rectangle.getY() %>)는 사각형 안에 <%=rectangle.Process(rectangle.getX(), rectangle.getY()) %>
</body>
</html>