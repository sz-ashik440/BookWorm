package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserBean;
import model.loginProccess;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String whereToGo = null;
		whereToGo = "/WEB-INF/view/login.jsp";
		RequestDispatcher view = request.getRequestDispatcher(whereToGo);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName").trim();
		String passWord = request.getParameter("password").trim();
		
		UserBean userInfo = new UserBean();
		userInfo.setUserName(username);
		userInfo.setPassword(passWord);
		
		loginProccess dbp = new loginProccess();
		
		if(dbp.varifyFromDB(userInfo) == true){
			//dbp.resetUserType(userInfo);
			HttpSession session = request.getSession();
			session.setAttribute("userName", userInfo.getUserName());			
			session.setAttribute("loginSuccess", "true");
			if(userInfo.getUserName().equalsIgnoreCase("admin")){
				session.setAttribute("userType", "admin");
				response.sendRedirect("/BookWorm/admin");
								
			}
			else{
				session.setAttribute("userType", "user");
				response.sendRedirect("/BookWorm/welcome");
			}			
		}
		else{
			PrintWriter out = response.getWriter();
			out.println("<h1 align=\"center\">Wrong User Name Or Password.</h1>");
			String whereToGo = null;
			whereToGo = "/WEB-INF/view/login.jsp";
			RequestDispatcher view = request.getRequestDispatcher(whereToGo);
			view.include(request, response);
		}
		
				
		
	}

}
