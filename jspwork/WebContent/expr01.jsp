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
			Calendar cal = Calendar.getInstance();
			String days="";
			String month="";
			String year="";
		
			cal.add(Calendar.DATE, 1);
			days = String .valueOf(cal.get(Calendar.DATE));
			month = String .valueOf(cal.get(Calendar.MONTH)+1);
			year = String .valueOf(cal.get(Calendar.YEAR));
			
			return year + "-" + month + "-" + days;
		}
	%>
	
	내일 = <%= calDate() %>
</body>
</html>