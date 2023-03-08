package mypack;

public class parametrized {
	int roll_no;
	String name,course;
	private parametrized()
	{
		System.out.println("parametrized constructor");
	}
	parametrized (int r_no)
	{
		roll_no=r_no;
		System.out.println("Learner rollno is:"+r_no);
		}
	      parametrized(String nm,String c)
	      {
	    	  name=nm;
	    	  course=c;
	    	  System.out.println("Learner name and course is"+nm+ "and" +c);
	      }
	
		void display()
		{
			System.out.println("method called");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parametrized p1=new  parametrized();
		 p1.display();
		 parametrized p2=new  parametrized(10);
		 parametrized p3=new parametrized("ganesh", "kgf");
	}
			
	
}
		 


