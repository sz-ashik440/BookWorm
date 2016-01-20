package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;
import model.loginProccess;

@WebServlet("/regController")
public class regController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public regController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String whereToGo = null;

		whereToGo = "/WEB-INF/view/register.jsp";
		RequestDispatcher view = request.getRequestDispatcher(whereToGo);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		loginProccess processDB = new loginProccess();

		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String rePass = request.getParameter("rePassword");

		UserBean userInfo = new UserBean();
		userInfo.setUserName(userName);
		userInfo.setPassword(passWord);
		userInfo.setRePassword(rePass);
		
		if(!processDB.checkAvailableFromDB(userInfo)){
			out.println("<h3 align=\"center\">There is a user with same user Name. Please choose another.</h3>");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").include(request, response);			
		}
		else if (processDB.isRegPassMissMatch(userInfo)){
			out.println("<h3 align=\"center\">Password is miss-match.</h3>");
			request.getRequestDispatcher("/WEB-INF/view/register.jsp").include(request, response);
		}
		else{
			processDB.storeToDB(userInfo);
			request.setAttribute("regSuccess","true");
			request.getRequestDispatcher("/index").forward(request, response);
			
		}

	}

}
