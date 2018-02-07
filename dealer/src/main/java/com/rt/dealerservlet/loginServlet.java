package com.rt.dealerservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rt.dealerjava.ExecuteQuery;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	final static Logger logger = LogManager.getLogger(loginServlet.class.getName());
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		out.print("Welcome "+name+"..!!");*/ 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("psw");
		/*if (userName.equals("bhushan") && userPassword.equals("password")) {
			doGet(request, response);
		}*/
		if (ExecuteQuery.validateUser(userName, userPassword)) {
			//doGet(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("homeServlet");
			rd.forward(request, response);
		}else {
			out.print("User name or Password error...!!");
			logger.error("User name or Password error...!!");
			RequestDispatcher rd = request.getRequestDispatcher("/");
			rd.include(request, response);
		}
		out.close();
	}

}
