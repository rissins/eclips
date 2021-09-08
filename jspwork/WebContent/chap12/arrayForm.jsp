<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="array" class="question.Array"></jsp:useBean>
<jsp:setProperty property="*" name="array"/>
	입력된 정수가 <%=array.getNumber1() %>와 <%=array.getNumber2() %>와
			 <%=array.getNumber3() %>와 <%=array.getNumber4() %>와
			 <%=array.getNumber5() %>중에서 가장 큰 수는
			 <%=array.process(array.getNumber1(), array.getNumber2(), array.getNumber3(), array.getNumber4(), array.getNumber5()) %>
</body>
</html>																																												