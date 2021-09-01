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
<h4>당신이 입력한 정보입니다.</h4>

   입력된 정수는 <%= season.getMonth() %> 이고 계절은 <%=season.Process(season.getMonth()) %> 이다.
</body>
</html>