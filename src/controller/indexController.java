package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/indexController")
public class indexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public indexController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String whereToGo = null;

		whereToGo = "/WEB-INF/view/index.jsp";
		RequestDispatcher view = request.getRequestDispatcher(whereToGo);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		if (request.getAttribute("regSuccess").toString() == "true") {
			out.println("<h3 align=\"center\">SuccessFully registered.</h3>");
			getServletConfig().getServletContext()
					.getRequestDispatcher("/WEB-INF/view/index.jsp")
					.include(request, response);
		}
	}

}
