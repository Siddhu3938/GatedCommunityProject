package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HibernateUtil.sessionfactory;
import com.Model.Resident;

public class ResidentDao {
  public boolean isValid(String email,String password,String role)
  {
	  try
	  {
	  SessionFactory sf = sessionfactory.getsessionfactory();
	  Session ss = sf.openSession();
	  Resident resident = ss.createQuery("from Resident where email=:email and password=:password and role=:role",Resident.class)
	                  .setParameter("email",email)
	                  .setParameter("password",password)
	                  .setParameter("role",role).uniqueResult();
	  if(resident!=null)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  e.printStackTrace();
		  return false; 
	}
  }
}
