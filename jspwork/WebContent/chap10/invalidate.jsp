<%@page import="java.util.Enumeration"%>
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
		<h3>[������ �����ϴ� ����]</h3>
	</center>
	invalidate() �޼ҵ带 ����Ͽ� ������ �����ϴ� �����Դϴ�.
	<%
		String sName;
		String sValue = "���ǿ� �����  ù ��° ��";
		session.setAttribute("sName1", sValue);
		
		sValue = "���ǿ� �����  �� ��° ��";
		session.setAttribute("sName2", sValue);
		
		sValue = "���ǿ� �����  �� ��° ��";
		session.setAttribute("sName3", sValue);
		
		out.println("<hr><h3>----------���ǰ��� �����ϱ� �� -----------</h3>");
		Enumeration enumApp = session.getAttributeNames();
		
		int i = 0;
		
		while(enumApp.hasMoreElements()){
			i++;
			sName = enumApp.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("<hr>���� ���� �̸�["+i+"] : "+ sName);
			out.println("<br>���� ���� ��["+i+"] : "+ sValue);
		}
		out.println("<hr>1.���� ���̵� ��ȿ�ұ�� ? <br>");
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("���Ǿ��̵� ��ȿ�մϴ�");
		}else{
			out.println("���Ǿ��̵� ��ȿ�����ʽ��ϴ�.");
		}
		session.invalidate();
		
		out.println("<hr><h3>----------���ǰ��� �����ϱ� �� -----------</h3>");
		enumApp = session.getAttributeNames();
		/*
		i = 0;
		
		while(enumApp.hasMoreElements()){
			i++;
			sName = enumApp.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("<hr>���� ���� �̸�["+i+"] : "+ sName);
			out.println("<br>���� ���� ��["+i+"] : "+ sValue);
		}
		*/	
		
		out.println("<hr>2.���� ���̵� ��ȿ�ұ�� ? <br>");
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("���Ǿ��̵� ��ȿ�մϴ�");
		}else{
			out.println("���Ǿ��̵� ��ȿ�����ʽ��ϴ�.");
		}
	%>
</html>