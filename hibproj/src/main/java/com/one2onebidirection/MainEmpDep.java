package com.one2onebidirection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmpDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.getCurrentSession();
		Transaction ts=null;
		ts=s.beginTransaction();
		
		Employee e=new Employee();
		e.setE_id(12);
     	e.setEname("ajit");
		
     	Department d=new Department();
     	d.setD_id(10);
     	d.setDname("BCA");
     	d.setD_add("mumbai");
     	e.setDpt(d);
     	d.setEmp(e);

     	s.save(e);
     	s.save(d);
     	ts.commit();
     	sf.close();

	}

}
