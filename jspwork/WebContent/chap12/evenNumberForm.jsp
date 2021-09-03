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
	입력된 정수인 <%=evenNumber.getNumber() %>의 짝수들 합계는 <%=evenNumber.process(evenNumber.getNumber())%>
</body>
</html>