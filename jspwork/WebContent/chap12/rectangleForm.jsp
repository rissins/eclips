<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="rectangle" class = "area.Rectangle2"></jsp:useBean>
	<jsp:setProperty property="*" name="rectangle"/>
	
	<h4>����� �Է��� �����Դϴ�.</h4>
	
	���α��̰� <%=rectangle.getLength() %>�̰�, ���� ���̰� <%=rectangle.getWidth() %>�� ������� ������ 
	<%=rectangle.Process(rectangle.getLength(), rectangle.getWidth()) %>
</body>
</html>