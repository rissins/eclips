<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		double value = 3.14159;
		public double getDouble(){
			return value;
		}
	%>
	<%
		out.println(getDouble());
	%>
</body>
</html>