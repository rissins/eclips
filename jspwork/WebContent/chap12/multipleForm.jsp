<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="multiple" class = "question.Multiple"></jsp:useBean>
<jsp:setProperty property="*" name="multiple"/>
입력된 정수 <%=multiple.getNumber() %>는 <%=multiple.process(multiple.getNumber()) %> 
</body>
</html>