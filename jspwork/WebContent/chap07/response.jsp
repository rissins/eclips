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
	<%
		response.setIntHeader("Refresh"	, 1);
		Calendar calendar = Calendar.getInstance();
		
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second= calendar.get(Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM) == 0){
			am_pm = "AM";
		}else{
			am_pm = "PM";
		}
		
		String CT = hour + ":" +minute +":" + second+ " "+am_pm;
		out.println("���� �ð���"+ CT+"\n");
	%>
	<p>
		<a href = "response_data.jsp"> Google Ȩ�������� �̵��ϱ�</a>
	</p>	
</body>
</html>