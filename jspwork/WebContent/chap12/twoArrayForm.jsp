<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="twoarray" class="question.TwoArray"></jsp:useBean>
<jsp:setProperty property="*" name="twoarray"/>
	<%=twoarray.process(twoarray.getNumber()) %>
</body>
</html>