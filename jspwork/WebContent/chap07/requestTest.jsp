<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<big>������ Ŭ���̾�Ʈ�� iP: </big>
<%= request.getRemoteAddr() %><br>
������ �̸�:
<%= request.getServerName() %><br>
��û���:
<%= request.getMethod() %> <br>
��������:
<%= request.getProtocol() %><br>
��û�� url: 
<%= request.getRequestURL() %><br>
��û�� uri:
<%= request.getRequestURI() %><br>
