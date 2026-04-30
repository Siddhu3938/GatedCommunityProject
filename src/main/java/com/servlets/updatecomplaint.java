package com.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Complaint;
import com.dao.userdao;

@WebServlet("/updatecomplaint")
public class updatecomplaint extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		int id=Integer.parseInt(req.getParameter("complaintId"));
		String complaint = req.getParameter("complaint");
		String flatNumber = req.getParameter("flatNumber");	
		String phone = req.getParameter("phoneNumber");		
		userdao dao=new userdao();
		Complaint c = new Complaint();
		c.setComplainId(id);
		c.setEmail(email);
		c.setComplaint(complaint);
		c.setFlatNumber(flatNumber);
		c.setPhoneNumber(phone);
		dao.Updatecomplaint(c);
		resp.sendRedirect("ResidentDashboard.jsp");
	}

}
