package com.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ResidentDao;
@WebServlet("/Login")
public class login extends HttpServlet {
    public login() {
        super();
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String role = req.getParameter("role");		
		ResidentDao dao= new ResidentDao();
		req.getSession().setAttribute("email", email);
		boolean valid = dao.isValid(email, password,role);
		if(valid==true)
		{
			if(role.equals("admin"))
			{
				resp.sendRedirect("AdminDashboard.jsp");
			}
			else
			{
				resp.sendRedirect("ResidentDashboard.jsp");
			}
		}
		else
		{
			RequestDispatcher rs = req.getRequestDispatcher("login.jsp");
			rs.forward(req, resp);
		}
	}

}
