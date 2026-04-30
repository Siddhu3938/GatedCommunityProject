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
import com.dao.admindao;

@WebServlet("/viewAllcomplaint")
public class viewAllcomplaint extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		admindao a = new admindao();
		List<Complaint> list = a.getAllComplaints();
		
		req.setAttribute("list",list);
		//resp.sendRedirect("viewAllComplaints.jsp");
		RequestDispatcher rs = req.getRequestDispatcher("viewAllComplaints.jsp");
		rs.forward(req, resp);
	}
}
