<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="season" class = "question.Season"></jsp:useBean>
<jsp:setProperty property="*" name="season"/>

<hr>
<h4>����� �Է��� �����Դϴ�.</h4>

   �Էµ� ������ <%= season.getMonth() %> �̰� ������ <%=season.Process(season.getMonth()) %> �̴�.
</body>
</html>