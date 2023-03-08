package javaadvop;
import java.*;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

class Threadmul implements Runnable
{
	int a;
	public Threadmul(int a)
	{
		super();
		this.a=a;
		}
	public void run()
	{
		try
		{
			Multiplesthread.mul(a);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}

class Threadevenodd implements Runnable
{
	int a;
	public Threadevenodd(int a)
	{
		super();
		this.a=a;
	}
	public void run()
	{
		try
		{
			Multiplesthread.evenodd(a);
			}
      catch(Interrup Exception e)
		{
    	  e.printStackTrace();
		}
      }
}
public class Multiplesthread {
	
	static synchronized void mul(int t)throws IntterupException 
	{
		int a=t;
		System.out.println("table of"+t+":");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
			Thread.sleep(1000);
		}
		
	}
	public static void evenodd(int a) {
		// TODO Auto-generated method stub
		
	}
	static synchronized void even(int a)throws IntterupException
	{
		System.out.println("THREAD even odd...");
		for(int i=1;i<=a;i++)
		{
			if(i % 2==0)
				System.out.println("even no:"+i);
			else
				System.out.println("odd no:"+i);
		}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int s=sc.nextInt();
      int r=sc.nextInt();
      Threadevenodd e=new Threadevenodd(r);
      Thread w1=new Thread(e);
      w1.start();
       
     Threadmul e=new Threadmul(s);
     Thread T1=new Thread(t);
     T1.start();
      
	}

}
