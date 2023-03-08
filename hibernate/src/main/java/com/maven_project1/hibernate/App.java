package com.maven_project1.hibernate;

import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf=new Configuration().configure().bulidSessionFactory();
        Session s=sf.getCurrentSession();
        Transaction ts=null;
        ts=s.beginTransaction();
        Student st=new Student("ganesh","BE");
        s.save(st);
        ts.commit();
        s.close();
        sf.close();
    }
}
