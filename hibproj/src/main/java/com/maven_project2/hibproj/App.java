package com.maven_project2.hibproj;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String [] args)
    {
    	
    	        SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	        Session session=sf.openSession();//hibernate named query
    	        Query query=session.getNamedQuery("find student by name");
    	        query.setParameter("sname", "gopal");
    	        
    	        List<Student>list=query.list();
    	         
    	        for(int i=0;i<list.size();i++)
    	        {
    	        	System.out.println("id:"+list.get(i).getSid()+"\nsname:"+list.get(i).getSname());
    	        }
    	        
    	       // Session s=sf.getCurrentSession();
    	        //Transaction ts=null;
    	        //ts=s.beginTransaction();
    	        //Student st=new Student("ganesh","BE");
    	        
    	       // s.save(st);
    	        //ts.commit();
    	        //s.close();
    	        sf.close();
    	    }
    	

    }

