package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.HibernateUtil.sessionfactory;
import com.Model.Resident;

@WebServlet("/signin")
public class signin extends HttpServlet {
    public signin() {
        super();
    }
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String role = req.getParameter("role");
		SessionFactory sf = sessionfactory.getsessionfactory();
		Session ss = sf.openSession();
		Transaction txt = ss.beginTransaction();
		Resident rs = new Resident(userName,password,email,phone,role);
		ss.persist(rs);
		txt.commit();
		ss.close();
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);
	}

}
