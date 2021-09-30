<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int bid = Integer.parseInt(request.getParameter("b_id"));
	BoardDBBean db = BoardDBBean.getInstace();
	BoardBean board = db.getBoard(bid, true);
	int b_id;
	int b_hit;
	String b_name , b_title, b_content, b_email;
	Timestamp b_date;
	b_id = board.getB_id();
	b_name = board.getB_name();
	b_email = board.getB_email();
	b_title = board.getB_title();
	b_content = board.getB_content();
	b_date = board.getB_date();
	b_hit = board.getB_hit();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>글 내용 보기</h1>
		<table border="1" width="800" cellspacing="0">
			<tr hegiht="30" align="center">
				<td width="100">
					글번호
				</td>
				<td width="200">
					<%= b_id %>
				</td>
				<td width="100">
					조회수
				</td>
				<td width="200">
					<%= b_hit %>
				</td>
			</tr>
			<tr hegiht="30" align="center">
				<td width="100">
					작성자
				</td>
				<td width="200">
					<%= b_name %>
				</td>
				<td>
					작성일
				</td>
				<td>
				<%=sdf.format(b_date) %>
				</td>
			</tr>
			<tr hegiht="30" align="center">
				<td width="100">
					글제목
				</td>
				<td colspan="3" width="200">
				
					<%= b_title %>
				</td>
			</tr>
			<tr hegiht="30" align="center">
				<td width="100">
					글내용
				</td>
				<td colspan="3" width="200">
					<%= b_content %>
				
				</td>
			</tr>
			<tr >
				<td colspan="4" align="right">
					<input type="button" value="글수정" onclick="location.href='edit.jsp?b_id=<%=b_id %>'">
					<input type="button" value="글삭제" onclick="location.href='delete.jsp?b_id=<%=b_id %>'">
					<input type="button" value="답변글" onclick="location.href='write.jsp?b_id=<%=b_id %>'">
					<input type="button" value="글목록" onclick="location.href='list.jsp'">
				
				</td>
				
			</tr>
		</table>
	</center>
</body>
</html>