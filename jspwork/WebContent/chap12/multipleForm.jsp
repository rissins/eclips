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
�Էµ� ���� <%=multiple.getNumber() %>�� <%=multiple.process(multiple.getNumber()) %> 
</body>
</html>