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


@WebServlet("/XuLySua")
public class XuLySua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public XuLySua() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/productEdit.jsp");
	        dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html'charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		Product pr=new Product();
		int ID= Integer.parseInt(request.getParameter("prid"));
		String name=request.getParameter("prname");
		String quantityStr= request.getParameter("prquantity");
		String priceStr= request.getParameter("prprice");
		float price=0;
		int quantity=0;
		try {
			price=Float.parseFloat(priceStr);
			quantity=Integer.parseInt(quantityStr);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("");}
		//Product pr=new Product();
		pr.setId(ID);
		pr.setName(name);
		pr.setQuantity(quantity);
		pr.setPrice(price);
		if(ProductDAO.edit(pr)) {
			  RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/ListView.jsp");
		        dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/productEdit.jsp");
	        dispatcher.forward(request, response);
		}

	}

}
