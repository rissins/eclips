<%@page import="java.net.InetAddress"%>
<%@page import="java.net.Inet4Address"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Date"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="board" class="magic.board.BoardBean"/>
<jsp:setProperty property="*" name="board"/>


<%
	BoardDBBean db = BoardDBBean.getInstace();
	Timestamp ts = new Timestamp(System.currentTimeMillis()); 
	
	board.setB_date(ts);
	//board.setB_ip(request.getRemoteAddr());
	InetAddress address = InetAddress.getLocalHost();
	String ip = address.getHostAddress();
	board.setB_ip(ip);
	int result = db.insertBoard(board);

	
	
	if (result == 1){
		response.sendRedirect("list.jsp");
	}else{
		response.sendRedirect("write.jsp");
	}
%>
