<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="evenNumber" class="question.EvenNumber"></jsp:useBean>
<jsp:setProperty property="*" name="evenNumber"/>
	�Էµ� ������ <%=evenNumber.getNumber() %>�� ¦���� �հ�� <%=evenNumber.process(evenNumber.getNumber())%>
</body>
</html>