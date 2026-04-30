package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Complaint;
import com.dao.userdao;

@WebServlet("/viewcomplaint")
public class viewcomplaint extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=(String) req.getSession().getAttribute("email");
		userdao dao = new userdao();
		List<Complaint> list = dao.getcomplaints(email);
     System.out.println(list);
     req.setAttribute("list",list);
     RequestDispatcher rd = req.getRequestDispatcher("viewcomplaint.jsp");
     rd.forward(req, resp);
	}

}
