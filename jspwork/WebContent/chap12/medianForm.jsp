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
<h4>����� �Է��� ���� �Դϴ�.</h4>
�Էµ� ������ <%=median.getNumber1()%>�� <%=median.getNumber2()%>�� <%=median.getNumber3()%>��
�߰����� <%=median.Process(median.getNumber1(), median.getNumber2(), median.getNumber3()) %> 
</body>
</html>