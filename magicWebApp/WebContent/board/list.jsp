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
		<h1>�Խ��ǿ� ��ϵ� �� ��� ����</h1>
			<table border="1px" solid >
			<thread>
			<div><a href="write.jsp">�۾���</a></div>
				<tr>
					<td width="70">��ȣ</td>
					<td width="300" center>������</td>
					<td width="100" center>�ۼ���</td>
					<td width="200" center>�ۼ���</td>
					<td width="100" center>��ȸ��</td>
				</tr>
			</thread>
			<tbody>
				<%
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					BoardDBBean boardDBBean = new BoardDBBean();
					BoardBean boardBean = new BoardBean();
					ArrayList<BoardBean> list = boardDBBean.listBoard();
					for (int i = 0; i < list.size(); i++){
				%>
				<tr height="25" bgcolor="#f7f7f7" onmouseover="this.style.backgroundColor='#eeeeef'" onmouseout="this.style.backgroundColor='#f7f7f7'">
					<td><%=list.get(i).getB_id() %></td>
					<td>
						<%
							int b_level = boardBean.getB_level();
							if ( b_level > 0){
								for (int j = 0; j < b_level; j++){
									%>
										&nbsp;
									<%
								}
								%>
									<img src="../images/AnswerLine.gif" width="16" height="16">
								<%
							}
						%>
						<a href="show.jsp?b_id=<%=list.get(i).getB_id()%>"><%=list.get(i).getB_title() %></a>
					</td>
					<td><%=list.get(i).getB_name() %></td>
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