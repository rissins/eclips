<%@page import="java.text.SimpleDateFormat"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="magic.board.BoardDBBean"%>
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
		<h1>게시판에 등록된 글 목록 보기</h1>
			<table border="1px" solid >
			<thread>
			<div><a href="write.jsp">글쓰기</a></div>
				<tr>
					<td width="70">번호</td>
					<td width="300" center>글제목</td>
					<td width="100" center>작성자</td>
					<td width="200" center>작성일</td>
					<td width="100" center>조회수</td>
				</tr>
			</thread>
			<tbody>
				<%
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					BoardDBBean boardDBBean = new BoardDBBean();
					ArrayList<BoardBean> list = boardDBBean.listBoard();
					for (int i = 0; i < list.size(); i++){
				%>
				<tr>
					<td><%=list.get(i).getB_id() %></td>
					<td onmouseover="this.style.backgroundColor='red'" onmouseout="this.style.backgroundColor='white'" >
					<a href="show.jsp?b_id=<%=list.get(i).getB_id()%>"><%=list.get(i).getB_title() %></a>
					</td>
					<td onmouseover="this.style.backgroundColor='blue'" onmouseout="this.style.backgroundColor='white'" onclick="location.href='email.jsp'"><%=list.get(i).getB_name() %></td>
					<td><%=sdf.format(list.get(i).getB_date())  %></td>
					<td><%=list.get(i).getB_hit() %></td>
				</tr>
				<%		
						
					}
				%>
			</tbody>
			</table>
	</center>
</body>
</html>