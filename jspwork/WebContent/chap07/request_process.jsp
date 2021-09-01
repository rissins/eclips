<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String value = request.getQueryString();
		out.println("전송된 요청 파라미터 : "+ value);
	%>	
</body>
</html>