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

import model.ProductProccess;

@WebServlet("/welcomeController")
public class welcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public welcomeController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
        String usr =(String) session.getAttribute("userName");
        String loginSuccess = (String) session.getAttribute("loginSuccess");
        String userType = (String) session.getAttribute("userType");

        if (loginSuccess=="true" && usr!= null && userType=="user"){
        	response.setContentType("text/html");
        	ProductProccess productFromDB = new ProductProccess();
        	request.setAttribute("products", productFromDB.getAllBook());
            request.setAttribute("usr",usr);
            request.setAttribute("damn", "print from servlet");
            getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/welcome.jsp").include(request,response);
        }
        else{
        
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<h3 align=\"center\">Please login before.</h3>");
            getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/index.jsp").include(request,response);
        }
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
