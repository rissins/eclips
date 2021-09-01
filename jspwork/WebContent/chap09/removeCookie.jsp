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
		Cookie[] cookies = request.getCookies();
	
		for(int i = 0; i < cookies.length; i++){
			out.println(i + "번쨰 쿠키"+ cookies[i].getName()+"삭제<br>");
			cookies[i].setMaxAge(0);
			cookies[i].setPath("/");
			response.addCookie(cookies[i]); 
		}
	%>
</body>
</html>