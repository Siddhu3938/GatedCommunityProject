package com.servlets;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Model.Complaint;
import com.dao.admindao;

@WebServlet("/StatusUpdate")
public class StatusUpdate extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String status = req.getParameter("status");
		int id=Integer.parseInt( req.getParameter("complaintId"));
		Complaint c = new Complaint();
		c.setComplainId(id);
		c.setStatus(status);
		admindao a = new admindao();
		a.update(c);
		resp.sendRedirect("AdminDashboard.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
