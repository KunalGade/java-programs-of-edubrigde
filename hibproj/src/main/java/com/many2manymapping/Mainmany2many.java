package com.many2manymapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainmany2many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SessionFactory sf=new Configuration().configure().buildSessionFactory();
       Session s=sf.getCurrentSession();
       Transaction ts=null;
       ts=s.beginTransaction();
       
       Emp e=new Emp();
       e.setEid(101);
       e.setEname("pranav");
       s.save(e);
       
       Emp e1=new Emp();
       e1.setEid(102);
       e1.setEname("pranjal");
       s.save(e1);
       
       Project p1=new Project();
       p1.set
       
	}

}
