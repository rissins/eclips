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
			out.println("���Ǿ��̵� ��ȿ�մϴ�");
		}else{
			out.println("���Ǿ��̵� ��ȿ�����ʽ��ϴ�.");
		}
		session.invalidate();
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("���Ǿ��̵� ��ȿ�մϴ�");
		}else{
			out.println("���Ǿ��̵� ��ȿ�����ʽ��ϴ�.");
		}
		*/
		if (id.equals("admin") && passwd.equals("admin1234")){
			session.setAttribute("userID", id);
			response.sendRedirect("welcome.jsp");
		}else{
			out.println("���̵�� ��й�ȣ�� Ȯ���� �ּ���.");
		}
	%>
</body>
</html>