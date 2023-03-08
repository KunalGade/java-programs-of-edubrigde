package com.many2mnayBidirection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainmany2manyBidriectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session s=sf.getCurrentSession();
      Transaction ts=null;
      ts=s.beginTransaction();
      
      Stud s1=new Stud();
      //s1.setId(199);
      s1.setName("sham");
      s.save(s1);
      
      Stud s2=new Stud();
      s2.setName("rohit");
      s.save(s2);
      
      Course c1=new Course();
      c1.setCourse_name("ram");
      s.save(c1);
      
      Course c2=new Course();
      c2.setCourse_name("sanket");
      s.save(c2);
      
      List<Stud> slist=new ArrayList<Stud>();
      slist.add(s1);
      slist.add(s2);
      
      List<Course> rlist=new ArrayList<Course>();
      rlist.add(c1);
      rlist.add(c2);
      
      s1.setCourses(rlist);
      s2.setCourses(rlist);
      c1.setStuds(slist);
      c2.setStuds(slist);
      
      ts.commit();
      sf.close();
      
	}
	

}
