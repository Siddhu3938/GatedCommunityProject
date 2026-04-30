package com.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Model.Complaint;
import com.Model.Resident;
import com.servlets.signin;

public class sessionfactory {
  private static SessionFactory ss = null;
  public static SessionFactory getsessionfactory()
  {
	  if(ss==null)
	  {
		  Configuration con = new Configuration().configure();
		  con.addAnnotatedClass(Resident.class);
		  con.addAnnotatedClass(Complaint.class);
		  ss = con.buildSessionFactory();
		  return ss;
	  }
	  return ss;
  }
}
