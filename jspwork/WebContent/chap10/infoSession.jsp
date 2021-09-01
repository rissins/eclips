<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>[세션 정보를 얻어오는 메소드를 사용한 예제]</h3>
	</center>
	<hr>
	<%
		String idStr = session.getId();
		long lastTime = session.getLastAccessedTime();
		long creatTime = session.getCreationTime();
		long time = (lastTime - creatTime) / 60000;
		int inactive = session.getMaxInactiveInterval();
		boolean creatSession = session.isNew();
		
	%>
	[1]	세셩 ID는 <%= idStr %> <br><br>
	[2]	당신이 웹 사이트에 머문 시간은 <%= time %><br><br>
	[3] 세션의 유효 시간은 <%= inactive %><br><br>
	[4] 세션이 새로 만들어 졌나요<br><br>
	
	<%
		if(creatSession){
			out.print("예");
		}else{
			out.print("아니요");
		}
	%>
</body>
</html>