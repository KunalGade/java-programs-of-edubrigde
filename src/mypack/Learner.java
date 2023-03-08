package mypack;

public class Learner {
	public Learner()
	{
		System.out.println("default constuctor");
	}
       void display()
       {
    	   System.out.println("method called");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Learner l=new Learner();
       l.display();
	}

}
