package a.testPackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerTestServlet
 */
@WebServlet("/ControllerTestServlet")
public class ControllerTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerTestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// TODO Auto-generated method stub
		doGet(request, response);

		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();

		String name = request.getParameter("uname");
		String password = request.getParameter("pass");

		TheBean bean = new TheBean();

		bean.setUname(name);
		bean.setPassword(password);

		request.setAttribute("bean", bean);

		boolean status = bean.validate();

		if (status) {
			try {
				Cookie ck = new Cookie("uname", name);
				ck.setMaxAge(60*60);
				response.addCookie(ck);
				RequestDispatcher rd = request.getRequestDispatcher(name + ".jsp");
				rd.forward(request, response);	
			} catch (Exception e) {
				RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
				rd.forward(request, response);
			}
			
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request, response);
		}

	}

}
