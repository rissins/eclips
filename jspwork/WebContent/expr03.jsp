<%@page import="java.util.Calendar"%>
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
	 	public String calDate(){
			Calendar calendar = Calendar.getInstance();
			String days="";
			String month ="";
			String year = " ";
			
			calendar.add(Calendar.DATE, -3);
			calendar.add(Calendar.MONTH, -2);
			calendar.add(Calendar.YEAR, -1);
			
			days = String.valueOf(calendar.get(Calendar.DATE));
			month = String.valueOf(calendar.get(Calendar.MONTH)+1);
			year = String.valueOf(calendar.get(Calendar.YEAR));
			
			return year+"-"+month+"-"+days;
	}
	%>
	
	<%= calDate() %>
</body>
</html>