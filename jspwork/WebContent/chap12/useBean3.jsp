<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id = "gugudan" class ="question.GuGuDan"></jsp:useBean>
<h4>������ ����ϱ�</h4>

<% 
	int number = 5;

	for (int i = 1; i < 10; i++){
		out.println(number+"*"+i+"="+gugudan.Process(number, i)+"<br>");
	}
%>
