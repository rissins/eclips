1<%@ page language="java" contentType="text/html; charset=EUC-KR"
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
		
		if(id.equals("admin") && passwd.equals("admin1234")){
			Cookie cookie_id = new Cookie("userID", id);
			cookie_id.setMaxAge(60*60);
			cookie_id.setPath("/");
			response.addCookie(cookie_id);
			response.sendRedirect("welcome.jsp");
		}else{
			out.println("아이디와 비밀번호를 확인해주세요.");
		}
	%>
</body>
</html>