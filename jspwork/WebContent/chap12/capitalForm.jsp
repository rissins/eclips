<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="str" class="question.Capital"></jsp:useBean>
<jsp:setProperty property="*" name="str"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("�Է��̵� ���ĺ� "+ str.getString()+"�� <br>"+ str.process(str.getString()));
	
	%>
</body>
</html>