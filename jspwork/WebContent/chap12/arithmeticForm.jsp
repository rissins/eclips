<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="arithmetic" class = "question.Arithmetic"></jsp:useBean>
<jsp:setProperty property="*" name="arithmetic"/>
	<h4>
		당신이 입력한 정보입니다.
	</h4>
	<%=arithmetic.getNumber1() %><%=arithmetic.getAnswer() %><%=arithmetic.getNumber2() %>의 계산 결과는
	<%=arithmetic.Process(arithmetic.getNumber1(), arithmetic.getAnswer(), arithmetic.getNumber2()) %>
</body>
</html>