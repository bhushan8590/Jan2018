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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		List<Car> carList = new ArrayList<Car>();
		//Car c = new Car();
		String userName = request.getParameter("name");
		String userPassword = request.getParameter("password");
		out.print(userName);
		out.print(userPassword);
		if(ExecuteQuery.validateUser(userName, userPassword)){
			 HttpSession session=request.getSession(); 
			 /*session.setAttribute("user", userName);*/
			try {
				ResultSet rs = ExecuteQuery.query();
				while (rs.next()) {
					Car c = new Car();
					c.setName(rs.getString(1));
					c.setMake(rs.getString(2));
					c.setMake_year(rs.getString(3));
					c.setType(rs.getString(4));
					c.setColor(rs.getString(5));
					c.setPrice(rs.getInt(6));
					carList.add(c);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			request.setAttribute("list", carList);
			session.setAttribute("clist", carList);
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
			//response.sendRedirect("welcome.jsp");
		}else{
			//PrintWriter out = null;
			out.println("User name or password is incorrect please <a href='index.jsp'>try again</a>");
		}
	}

}
