<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String pageNum = request.getParameter("pageNum");
	int intPageNum = 0;

	if(pageNum == "null"){
		pageNum="1";
		intPageNum = Integer.parseInt(pageNum);
	}
	
	BoardDBBean db = BoardDBBean.getInstance();
	ArrayList<BoardBean> boardList = db.listBoard(pageNum);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	int b_id=0, b_hit=0, b_level=0;
	String b_name, b_email, b_title, b_content;
	Timestamp b_date;
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>게시판에 등록된 글 목록 보기</h1>
		<table width="600">
			<tr>
				<td align="right">
					<a href="write.jsp?pageNum=<%= pageNum %>">글 쓰 기</a>
				</td>
			</tr>
		</table>
		<table width="800" border="1" cellspacing="0" >
			<tr height="25">
				<td width="40" align="center">번호</td>
				<td width="450" align="center">글제목</td>
				<td width="120" align="center">작성자</td>
				<td width="130" align="center">작성일</td>
				<td width="60" align="center">조회수</td>
			</tr>
			<%
				for(int i=0; i<boardList.size(); i++){
					BoardBean board = boardList.get(i);
					b_id = board.getB_id();
					b_name = board.getB_name();
					b_email = board.getB_email();
					b_title = board.getB_title();
					b_content = board.getB_content();
					b_date = board.getB_date();
					b_hit = board.getB_hit();
					b_level = board.getB_level();
			%>
					<tr height="25" bgcolor="#f7f7f7" 
									onmouseover="this.style.backgroundColor='#eeeeef'" 
									onmouseout="this.style.backgroundColor='#f7f7f7'">
						<td align="center">
							<%= b_id %>
						</td>
						<td>
							<%
								if(b_level > 0){
									for(int j=0; j<b_level; j++){
										%>
											&nbsp;
										<%
									}
									%>
										<img src="../images/AnswerLine.gif" width="16" height="16">
									<%
								}
							%>
							<a href="show.jsp?b_id=<%= b_id %>&pageNum=<%= pageNum %>"><%= b_title %></a>
						</td>
						<td align="center">
							<a href="mailto:<%= b_email %>"><%= b_name %></a>
						</td>
						<td align="center">
							<%= sdf.format(b_date)%>
						</td>
						<td align="right">
							<%= b_hit %>
						</td>
					</tr>
			<%
				}
			%>
		</table>
	</center>
	<center>
				<%
			if (intPageNum > 1){
		%>		
				<a href="list.jsp?pageNum=<%=intPageNum-1%>">이전</a>
		
		<%
			}
		%>
		<%= BoardBean.pageNumer(4) %>
		<%
			if ((db.countId()-1) / 10 >= intPageNum){
		%>		
				<a href="list.jsp?pageNum=<%=intPageNum+1%>" >다음</a>
				
	
		<%
			}
		%>
	</center>
</body>
</html>















