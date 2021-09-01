<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="rectangle" class = "area.Rectangle2"></jsp:useBean>
	<jsp:setProperty property="*" name="rectangle"/>
	
	<h4>당신이 입력한 정보입니다.</h4>
	
	세로길이가 <%=rectangle.getLength() %>이고, 가로 길이가 <%=rectangle.getWidth() %>인 사격형의 면적은 
	<%=rectangle.Process(rectangle.getLength(), rectangle.getWidth()) %>
</body>
</html>