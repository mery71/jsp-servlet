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

//import WebApp.bean.UserAccount;
//import dao.UserAccountDAO;

@WebServlet("/XuLyDangNhap")
public class XuLyDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyDangNhap() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (session.getAttribute("username") != null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/Home.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html'charset=UTF-8");
		request.setCharacterEncoding("utf-8");

		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
		UserAccount us = new UserAccountDAO().layThongTin(user);
		if (UserAccountDAO.kiemTraDangNhap(user, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", us);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/Home.jsp");
			dispatcher.forward(request, response);

		} else {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");
			dispatcher.forward(request, response);
		}

	}
}
