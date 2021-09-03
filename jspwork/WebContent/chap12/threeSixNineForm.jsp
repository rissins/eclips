<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="threesix" class = "question.ThreeSixNine"></jsp:useBean>
<jsp:setProperty property="*" name="threesix"/>
	<h4> 당신이 입력한 정보입니다.</h4>
	입력된 정수 <%=threesix.getNumber() %>은 <%=threesix.process(threesix.getNumber()) %>
</body>
</html>