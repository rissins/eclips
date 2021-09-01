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
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		/*
		if (request.isRequestedSessionIdValid() == true){
			out.println("세션아이디가 유효합니다");
		}else{
			out.println("세션아이디가 유효하지않습니다.");
		}
		session.invalidate();
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("세션아이디가 유효합니다");
		}else{
			out.println("세션아이디가 유효하지않습니다.");
		}
		*/
		if (id.equals("admin") && passwd.equals("admin1234")){
			session.setAttribute("userID", id);
			response.sendRedirect("welcome.jsp");
		}else{
			out.println("아이디와 비밀번호를 확인해 주세요.");
		}
	%>
</body>
</html>