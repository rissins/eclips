<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="board2.js"></script>
</head>
<body>
	<center>
		<h1>�� �� �� �� �� </h1>
		<p> -- ��ȣ�� �Է��ϼ��� -- </p>
		<form name="form" action="delete_ok.jsp?b_id=<%= b_id %>" method="post">
			<table>
				�� ȣ  <input type="password" name="b_pwd" size="12" maxlength="12">
				<tr>
					<td><input type="button" value="�ۻ���" onclick="delete_ok()"></td>
					<td><input type="reset" value="�ٽ��ۼ�"></td>
					<td><input type="button" value="�۸��" onclick="location.href='list.jsp'"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>