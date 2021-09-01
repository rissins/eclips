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
		<h3>[세션을 제거하는 예제]</h3>
	</center>
	invalidate() 메소드를 사용하여 세션을 삭제하는 예제입니다.
	<%
		String sName;
		String sValue = "세션에 저장된  첫 번째 값";
		session.setAttribute("sName1", sValue);
		
		sValue = "세션에 저장된  두 번째 값";
		session.setAttribute("sName2", sValue);
		
		sValue = "세션에 저장된  세 번째 값";
		session.setAttribute("sName3", sValue);
		
		out.println("<hr><h3>----------세션값을 삭제하기 전 -----------</h3>");
		Enumeration enumApp = session.getAttributeNames();
		
		int i = 0;
		
		while(enumApp.hasMoreElements()){
			i++;
			sName = enumApp.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("<hr>얻어온 세션 이름["+i+"] : "+ sName);
			out.println("<br>얻어온 세션 값["+i+"] : "+ sValue);
		}
		out.println("<hr>1.세션 아이디가 유효할까요 ? <br>");
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("세션아이디가 유효합니다");
		}else{
			out.println("세션아이디가 유효하지않습니다.");
		}
		session.invalidate();
		
		out.println("<hr><h3>----------세션값을 삭제하기 후 -----------</h3>");
		enumApp = session.getAttributeNames();
		/*
		i = 0;
		
		while(enumApp.hasMoreElements()){
			i++;
			sName = enumApp.nextElement().toString();
			sValue = session.getAttribute(sName).toString();
			out.println("<hr>얻어온 세션 이름["+i+"] : "+ sName);
			out.println("<br>얻어온 세션 값["+i+"] : "+ sValue);
		}
		*/	
		
		out.println("<hr>2.세션 아이디가 유효할까요 ? <br>");
		
		if (request.isRequestedSessionIdValid() == true){
			out.println("세션아이디가 유효합니다");
		}else{
			out.println("세션아이디가 유효하지않습니다.");
		}
	%>
</html>