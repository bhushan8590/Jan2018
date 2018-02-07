package com.app.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ControllerServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
    	PrintWriter out = response.getWriter();
    	if("LOGIN_FORM".equalsIgnoreCase(request.getParameter("LOGIN"))){
    		String userName = request.getParameter("uname");
    		String userPassword = request.getParameter("upass");

    		if(ExecuteQuery.validateUser(userName, userPassword)){
    			//ServletRequest session = null;
    			 HttpSession session=request.getSession(); 
    			 session.setAttribute("user", userName); 
    			response.sendRedirect("welcome.jsp");
    		}else{
    			//PrintWriter out = null;
				out.println("User name or password is incorrect please <a href='index.jsp'>try again</a>");
    		}
    	}
    	
    	if("REGISTER_FORM".equalsIgnoreCase(request.getParameter("REGISTER"))){
    		
    		String userName = request.getParameter("newUserName");
    		String userPassword = request.getParameter("newUserPass");

    		try {
				if(ExecuteQuery.insertNewUser(userName, userPassword)){
					out.println("Register sucessfully");
					response.sendRedirect("index.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	
    	if("DELETE_RECORD".equalsIgnoreCase(request.getParameter("DELETE"))){
    		int id = Integer.parseInt(request.getParameter("id"));
    		try {
				ExecuteQuery.deleteCar(id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		response.sendRedirect("welcome.jsp");
    	}
	}

}
