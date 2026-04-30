package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HibernateUtil.sessionfactory;
import com.Model.Complaint;
import com.servlets.complaint;
public class admindao {
	public List<Complaint> getAllComplaints()
	{
		SessionFactory sf = sessionfactory.getsessionfactory();
		Session ss = sf.openSession();
		List<Complaint> query = ss.createQuery("from Complaint where status !='resolved'",Complaint.class).list();
		return query;
	}
	public Complaint getbyid(int id)
	   {
		   SessionFactory sf = sessionfactory.getsessionfactory();
		   Session ss = sf.openSession();
		   Transaction txt = ss.beginTransaction();
		  Complaint c= ss.createQuery("from Complaint where complaintId=:complaintId",Complaint.class).setParameter("complaintId",id).uniqueResult();
		   txt.commit();
		   ss.close();
		   return c;
	   }
	public void update(Complaint updated)
	{
		SessionFactory sf = sessionfactory.getsessionfactory();
		   Session ss = sf.openSession();
		   Transaction txt = ss.beginTransaction();
		  Complaint c= ss.createQuery("from Complaint where complaintId=:complaintId",Complaint.class).setParameter("complaintId",updated.getComplaintId()).uniqueResult();
		  if(c!=null)
		  {
			  c.setStatus(updated.getStatus());
			  ss.merge(c);
		  }
		   txt.commit();
		   ss.close();
	}
}
