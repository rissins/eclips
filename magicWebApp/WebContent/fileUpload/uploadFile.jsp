<%@page import="com.jspsmart.upload.File"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
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
		SmartUpload upload=new SmartUpload();
		upload.initialize(pageContext);
		upload.upload();
		int last = upload.getFiles().getCount();
		int cnt=0;
		
		for(int i=0; i<last; i++){
			File file = upload.getFiles().getFile(i);
			
			if(!file.isMissing()){
				file.saveAs("/upload/"+file.getFileName());
				
				out.println("�� �±� �ʵ� �̸� : "+file.getFieldName()+"<br>");
				out.println("���� �̸� : "+file.getFileName()+"<br>");
				out.println("���� ũ�� : "+file.getSize()+"<br>");
				out.println("���� Ȯ���� : "+file.getFileExt()+"<br>");
				out.println("���� ��� : "+file.getFilePathName()+"<br>");
				out.println("<br>---------------------------------------------------------<br>");
				cnt++;
			}
		}
		out.println("���� "+cnt+" ���� ���ε� �߽��ϴ�.");
	%>
</body>
</html>