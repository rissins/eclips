<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.File"%>
<%@page import="magic.board.BoardBean"%>
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
		int bid = Integer.parseInt(request.getParameter("fileN"));
		BoardDBBean db = BoardDBBean.getInstance();
		BoardBean board = db.getFileName(bid);
		
		String filename="";
		String realFilename="";
		
		if(board != null){
			filename = board.getB_fname();
			realFilename = board.getB_rfname();
		}
		
		String saveDirectory = application.getRealPath("/upload");
		String path = saveDirectory + File.separator + filename;
		
		File file = new File(path);
		long length = file.length();
		realFilename = new String(realFilename.getBytes("ms949"),"8859_1");
		
		response.setContentType("application/octet-stream");
		response.setContentLength((int)length);
		response.setHeader("Content-Disposition", "attachment;filename="+realFilename);
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		
		out.clear();
		out = pageContext.pushBody();

		BufferedOutputStream bos=new BufferedOutputStream(response.getOutputStream());
		
		int data;
		while((data=bis.read()) != -1){
			bos.write(data);
		}
		
		bis.close();
		bos.close();
	%>
</body>
</html>




















