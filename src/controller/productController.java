package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ProductProccess;


@WebServlet("/productController")
public class productController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public productController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String action =  request.getParameter("action");
		if(action.equalsIgnoreCase("delete")){
			int bookid = Integer.parseInt(request.getParameter("bookID"));
			ProductProccess ppc = new ProductProccess();
			ppc.deleteProduct(bookid);
			response.sendRedirect("/BookWorm/admin");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
