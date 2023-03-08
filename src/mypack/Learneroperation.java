package mypack;

public class Learneroperation{
	int roll_no;
	String name,course;
   
	public Learneroperation() {
		System.out.println("copy constructor");
		
	}
      Learneroperation(int r_no){
      roll_no=r_no;
      System.out.println("Learner roll is"+r_no);
      }
      Learneroperation(String nm,String c){
    	  name=nm;
    	  course=c;
    	  System.out.println("learner name and course"+ nm +"and"+ c);
    	  
      }
      Learneroperation(Learneroperation l){
    	  System.out.println("copy constructor");
    	  name=l.name;
    	  course=l.course;
    	  System.out.println("copy learner name and course:"+name +"and"+ course);
      }
      
		void display() {
    		  System.out.println("method called");
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Learneroperation l=new Learneroperation();
        l.display();
        Learneroperation l1=new Learneroperation(12);
        Learneroperation l2=new Learneroperation("sameer","bmk");
        Learneroperation l3=new Learneroperation(12);
	}

}
