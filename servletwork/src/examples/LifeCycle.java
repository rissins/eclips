package examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int initCount = 1;
	int serviceCount = 1;
	int doGetCount = 1;
	int doPostCount = 1;
	int destroyCount = 1;
       
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init �޼ҵ尡 �䫊�������� ȣ��� : "+ initCount++);
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("serivce �޼ҵ尡 �䫊�������� ȣ��� : "+ serviceCount++);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet �޼ҵ尡 �䫊�������� ȣ��� : "+ doGetCount++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost �޼ҵ尡 �䫊�������� ȣ��� : "+ doPostCount++);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy �޼ҵ尡 �䫊�������� ȣ��� : "+ destroyCount++);
	}

}
