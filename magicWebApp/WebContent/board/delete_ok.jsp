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
	<%
		int b_id = Integer.parseInt(request.getParameter("b_id"));
		String b_pwd  = request.getParameter("b_pwd");
		BoardDBBean db =  BoardDBBean.getInstace();
		int re = db.deleteBoard(b_id, b_pwd);
		
		if (re == 1){
			response.sendRedirect("list.jsp");
		} else if (re == 0){
			%>
				<script type="text/javascript">
					alert("비밀번호가 맞지 않습니다.");
					history.go(-1);
				</script>			
			<%
		} else if (re == -1){
			
			%>
				<script type="text/javascript">
					alert("삭제에 실패했습니다.");
					history.go(-1);
				</script>			
			<%
			
		}
	
	%>
</body>
</html>