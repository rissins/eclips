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
		<h1>글 삭 제 하 기 </h1>
		<p> -- 암호를 입력하세요 -- </p>
		<form name="form" action="delete_ok.jsp?b_id=<%= b_id %>" method="post">
			<table>
				암 호  <input type="password" name="b_pwd" size="12" maxlength="12">
				<tr>
					<td><input type="button" value="글삭제" onclick="delete_ok()"></td>
					<td><input type="reset" value="다시작성"></td>
					<td><input type="button" value="글목록" onclick="location.href='list.jsp'"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>