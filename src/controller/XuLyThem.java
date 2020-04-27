package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProductDAO;
import model.Product;

@WebServlet("/XuLyThem")
public class XuLyThem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public XuLyThem() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/productAdd.jsp");
	        dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html'charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String name= request.getParameter("prname");
		String quantityStr= request.getParameter("quantity");
		String priceStr= request.getParameter("price");
		float price=0;
		int quantity=0;
		try {
			price=Float.parseFloat(priceStr);
			quantity=Integer.parseInt(quantityStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("");}
		Product pr=new Product();
		pr.setName(name);
		pr.setQuantity(quantity);
		pr.setPrice(price);
	
		if(ProductDAO.add(pr)) {
			  RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/ListView.jsp");
		        dispatcher.forward(request, response);
		}else {
			
		}
		
	}

}