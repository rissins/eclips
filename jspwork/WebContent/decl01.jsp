<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! int number = 337; 
		private int getInt(){
			return number;
	}
	%>
	<%
	    out.println(getInt());
	%>

</body>
</html>