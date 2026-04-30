package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.userdao;

@WebServlet("/deletecomplaint")
public class deletecomplaint extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resps) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("complaintId"));
		userdao dao = new userdao();
		dao.delete(id);
		resps.sendRedirect("viewcomplaint");
	}

}
