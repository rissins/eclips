package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myUtil.*;
/**
 * Servlet implementation class QueryString
 */
@WebServlet("/QueryString")
public class QueryString extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String id = "", name = "", vclass = "", phone1 = "", phone2 = "", phone3 = "";
		id = request.getParameter("id");
		name = request.getParameter("name");
		vclass = request.getParameter("class");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		
		out.println("<html><head></head><body>");
		out.println("����� �Է��� ����(get���) �Դϴ�. <br> ���̵� : <b>");
		out.println(id);
		out.println("</b><br> �̸� : <b>"); out.println(HanConv.toKore(name));
		out.println("</b><br> ���� : <b>"); out.println(HanConv.toKore(vclass));
		out.println("</b><br> ��ȭ��ȣ : <b>"); out.println(phone1);
		out.println("-"); out.println(phone2);
		out.println("-"); out.println(phone3);
		out.println("</b><br><a href = 'javascript:history.go(-1)'>�ٽ�</a>");
		
	
		out.println("</body><html>");
	}

}
