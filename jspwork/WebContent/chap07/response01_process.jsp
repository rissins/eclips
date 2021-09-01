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
		request.setCharacterEncoding("euc-kr");
		String userid = request.getParameter("id");
		String password = request.getParameter("passwd");
		out.println(userid);
		out.println(password);
		
		if(userid.equals("관리자") && password.equals("1234")){
			out.println("success");
		}else
			out.println("fail");
	%>
</body>
</html>