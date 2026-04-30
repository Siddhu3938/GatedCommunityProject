package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HibernateUtil.sessionfactory;
import com.Model.Complaint;

public class userdao {
   public void save(Complaint c)
   {
	   SessionFactory sf = sessionfactory.getsessionfactory();
	   Session ss = sf.openSession();
	   Transaction txt = ss.beginTransaction();
	   ss.persist(c);
	   txt.commit();
	   ss.close();
   }
   public List<Complaint> getcomplaints(String email)
   {
	   SessionFactory sf = sessionfactory.getsessionfactory();
	   Session ss = sf.openSession();
	 List<Complaint> list= ss.createQuery("from Complaint where email=:email and status !='resolved'",Complaint.class).setParameter("email",email).list();
	 return list;
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
public void Updatecomplaint(Complaint updatedData) {

    SessionFactory sf = sessionfactory.getsessionfactory();
    Session ss = sf.openSession();
    Transaction tx = ss.beginTransaction();
    Complaint existing = ss.createQuery(
            "from Complaint where complaintId = :complaintId", Complaint.class)
            .setParameter("complaintId", updatedData.getComplaintId())
            .uniqueResult();

    if (existing != null) {
        existing.setComplaint(updatedData.getComplaint());
        existing.setFlatNumber(updatedData.getFlatNumber());
        existing.setPhoneNumber(updatedData.getPhoneNumber());
        ss.merge(existing);
    }

    tx.commit();
    ss.close();
}
public void delete(int complaintid)
{
	 SessionFactory sf = sessionfactory.getsessionfactory();
	    Session ss = sf.openSession();
	    Transaction txt = ss.beginTransaction();
	    Query q = ss.createQuery("delete from Complaint where complaintId=:complaintId");
	    q.setParameter("complaintId",complaintid);
	    q.executeUpdate();
	    txt.commit();
}
public List<Complaint> gethistory(String email)
{
	   SessionFactory sf = sessionfactory.getsessionfactory();
	   Session ss = sf.openSession();
	 List<Complaint> list= ss.createQuery("from Complaint where email=:email and status='resolved'",Complaint.class).setParameter("email",email).list();
	 return list;
}
}
