package com.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Complaint;
import com.Model.Resident;
import com.dao.userdao;

@WebServlet("/complaint")
public class complaint extends HttpServlet {
    public complaint() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String complaint = req.getParameter("complaint");
		String flatNumber = req.getParameter("flatNumber");
		Date date =Date.valueOf( req.getParameter("date"));
		String phone = req.getParameter("phoneNumber");
		String email=(String) req.getSession().getAttribute("email");
		System.out.println(email);
		String status="IN_PROGRESS";
		Complaint c = new Complaint();
		int randomId = (int)(System.currentTimeMillis() % 1000000);
		c.setComplainId(randomId);
		c.setEmail(email);
		c.setComplaint(complaint);
		c.setFlatNumber(flatNumber);
		c.setDate(date);
		c.setPhoneNumber(phone);
		c.setStatus(status);
		userdao dao = new userdao();
		dao.save(c);
		RequestDispatcher rd = req.getRequestDispatcher("ResidentDashboard.jsp");
		rd.forward(req, resp);
	}
}
