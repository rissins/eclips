<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="board.js" charset="utf-8"></script>
</head>
<body>
	<center>
		<h1>�� �ø���</h1>
	
		<form name="boardWrite" method="post" action = "write_ok.jsp">
			<table>
				<tr height="30">
					<td width="80">
						�ۼ��� 
					</td>
					<td width="140">
						<input type="text" name="b_name">
					</td>
					<td width="80">
						�̸���
					</td>
					<td width="240">
						<input type="text" name="b_email">
					</td>
				</tr>
				<tr height="30">
					<td width="80">
						������
					</td>
					<td colspan="3">
						<input type="text" name="b_title">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea rows="10" cols="65" name="b_content"></textarea>
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
						<input type="button" value="�۾���" onclick="check_ok()">&nbsp;
						<input type="reset" value="�ٽ��ۼ�">
						<input type="button" value="�۸��" onclick="location.href='list.jsp'">&nbsp;
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>