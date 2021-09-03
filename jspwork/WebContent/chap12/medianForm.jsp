<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="median" class="question.Median"></jsp:useBean>
<jsp:setProperty property="*" name="median"/>
<h4>당신이 입력한 정보 입니다.</h4>
입력된 정수가 <%=median.getNumber1()%>와 <%=median.getNumber2()%>와 <%=median.getNumber3()%>의
중간값은 <%=median.Process(median.getNumber1(), median.getNumber2(), median.getNumber3()) %> 
</body>
</html>