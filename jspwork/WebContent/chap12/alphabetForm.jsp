<%@page import="question.Alphabet"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="alphabet" class="question.Alphabet" ></jsp:useBean>
<jsp:setProperty property="*" name="alphabet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("입력된 알파벳이 "+ alphabet.getStr()+"은 "+alphabet.process(alphabet.getStr()));
	%>
</body>
</html>