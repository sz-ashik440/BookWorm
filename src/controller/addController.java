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

import model.ProductBean;
import model.ProductProccess;

@WebServlet("/addController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String whereToGo = null;

		whereToGo = "/WEB-INF/view/addBook.jsp";
		RequestDispatcher view = request.getRequestDispatcher(whereToGo);
		view.include(request, response);
		
//		PrintWriter out = response.getWriter();
//		HttpSession session = request.getSession(false);
//		
//        if(session == null){
//        	out.println("<h3 align=\"center\">Restricted for area.</h3>");
//            getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/index.jsp").include(request,response);
//        }
//        else {
//        	session = request.getSession();        	
//        }
//        String usr = (String) session.getAttribute("userName");        	
//		
//        if (usr.equalsIgnoreCase("admin")){
//	        String whereToGo = null;
//	
//			whereToGo = "/WEB-INF/view/addBook.jsp";
//			RequestDispatcher view = request.getRequestDispatcher(whereToGo);
//			view.include(request, response);
//        }
//        else{
//        	out.println("<h3 align=\"center\">Restricted for USER.</h3>");
//            getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/view/index.jsp").include(request,response);
//        }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBean product = new ProductBean();
		ProductProccess ppd = new ProductProccess();
		
		product.setBookName(request.getParameter("bookName"));
		product.setBookEdition(request.getParameter("bookEdition"));
		product.setGener(request.getParameter("bookGener"));
		product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		product.setPrice(Double.parseDouble(request.getParameter("price")));
		product.setImageURL("url");
		product.setDetails("details");
		
		ppd.addToBookList(product);
		response.sendRedirect("/BookWorm/admin");
		
		
		

	}

}
