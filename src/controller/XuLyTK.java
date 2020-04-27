package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import model.Product;


@WebServlet("/XuLyTK")
public class XuLyTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public XuLyTK() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		
		
		if(name!=null) {
			try {
				ProductDAO dao=new ProductDAO();
				ArrayList<Product> pro=dao.getProductName(name);
				request.setAttribute("products",pro);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/Search.jsp");
        
	       dispatcher.forward(request, response);
				} 
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
