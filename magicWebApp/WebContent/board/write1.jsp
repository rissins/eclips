<%@page import="magic.board.BoardBean1"%>
<%@page import="magic.board.BoardDBBean1"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int b_ref = 1, b_step=0, b_level=0, b_id = 0;
	String b_title = "";
	
	if (request.getParameter("b_id") != null){
		b_id = Integer.parseInt(request.getParameter("b_id"));
		
	}
	BoardDBBean1 db = BoardDBBean1.getInstace();
	BoardBean1 board =  db.getBoard(b_id, false);
	b_title = board.getB_title();
	b_ref = board.getB_ref();
	b_step = board.getB_step();
	b_level = board.getB_level();
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="board2.js" charset="utf-8"></script>
</head>
<body>
	<center>
		<h1>글 올리기</h1>
	
		<form name="boardWrite" method="post" action = "write_ok.jsp">
			
			<input type="hidden" name="b_ref" value="<%= b_ref %>">
			<input type="hidden" name="b_step" value="<%= b_step %>">
			<input type="hidden" name="b_level" value="<%= b_level %>">
			<table>
				<tr height="30">
					<td width="80">
						작성자 
					</td>
					<td width="140">
						<input type="text" name="b_name">
					</td>
					<td width="80">
						이메일
					</td>
					<td width="240">
						<input type="text" name="b_email">
					</td>
				</tr>
				<tr height="30">
					<td width="80">
						글제목
					</td>
					<td colspan="3">
					<%
						if (b_id == 0){
							%>
								<input name="b_title" type="text" size="55">
							<%
						} else {
							%>
								<input name="b_title" type="text" size="55" value="[답변]: <%=b_title%>">
							<%
						}
					%>
						<input type="text" name="b_title">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea rows="10" cols="65" name="b_content"></textarea>
					</td>
				</tr>
				<tr>
					<td width="80">
						암호
					</td>
					<td colspan="3">
						<input type="password" name="b_pwd" size="12" maxlength="12">
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
						<input type="button" value="글쓰기" onclick="check_ok()">&nbsp;
						<input type="reset" value="다시작성">
						<input type="button" value="글목록" onclick="location.href='list.jsp'">&nbsp;
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>