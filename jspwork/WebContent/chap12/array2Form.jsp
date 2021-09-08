<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="array" class = "question.Array2"></jsp:useBean>
<jsp:setProperty property="*" name="array"/>

<%
	int intArray[] = new int[5];
	intArray[0] = array.getNumber1();
	intArray[0] = array.getNumber2();
	intArray[0] = array.getNumber3();
	intArray[0] = array.getNumber4();
	intArray[0] = array.getNumber5();
	
	out.println("입력된 정수가"+array.getNumber1()+" "+array.getNumber2()+" "+array.getNumber3()+" "
			+array.getNumber4()+" "+array.getNumber5()+" "+ "3의 배수는 " +array.process(intArray));
%>
</body>
</html>