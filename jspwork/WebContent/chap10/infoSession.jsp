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
		<h3>[���� ������ ������ �޼ҵ带 ����� ����]</h3>
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
	[1]	���� ID�� <%= idStr %> <br><br>
	[2]	����� �� ����Ʈ�� �ӹ� �ð��� <%= time %><br><br>
	[3] ������ ��ȿ �ð��� <%= inactive %><br><br>
	[4] ������ ���� ����� ������<br><br>
	
	<%
		if(creatSession){
			out.print("��");
		}else{
			out.print("�ƴϿ�");
		}
	%>
</body>
</html>