package com.carproject.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HandlerServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User u = null;
		
		if ("login_form".equalsIgnoreCase(request.getParameter("login"))) {
			List<Car> carList = new ArrayList<Car>();
			u = (User) session.getAttribute("user");
			String userName = u.getName();
			String userPassword = u.getPassword();
			if (DbService.validateUser(userName, userPassword)) {
				List<Car> clist = null;
				try {
					clist = DbService.query();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				request.setAttribute("list", clist);
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				response.sendError(401, "User name or password is incorrect");
			}
		}
		if("register_form".equalsIgnoreCase(request.getParameter("register"))){
			String userName = request.getParameter("name");
			String userPassword = request.getParameter("password");
			try {
				if(DbService.insertNewUser(userName, userPassword)){
					response.sendRedirect("index.html");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
