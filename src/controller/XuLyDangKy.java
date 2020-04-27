package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserAccountDAO;
import model.UserAccount;

@WebServlet("/XuLyDangKy")
public class XuLyDangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyDangKy() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/resgister.jsp");

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html'charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
		UserAccount us = new UserAccount(user, pass);
		if (UserAccountDAO.themTaiKhoan(us)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", us);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");

			dispatcher.forward(request, response);

		} else {
			RequestDispatcher dispatcher = this.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/resgister.jsp");

			dispatcher.forward(request, response);
		}
	}

}
