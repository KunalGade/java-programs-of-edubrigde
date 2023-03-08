package mypack;
  class person{
	 String gender;
	 int roll_no;
	 person(String g,int r)
	 {
		 gender=g;
		roll_no=r;
	 }
	 void display()
	 {
		 System.out.println("i am:"+gender);
		 System.out.println("my rollno is:"+roll_no);
	 }
	 
 }
      class Women extends person{
    	  String name;
    	  int id;
    	  Women(String nm,int i) {
			super(nm,i);
			name=nm;
			id=i;
    	  }
    	  void display1()
    	  {
    		  System.out.println("my name is:"+name);
    		  System.out.println("my id is:"+id);
    	  }
		
      }
public class Stud1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Women w=new Women("ganesh",23);
       
       w.display();
       w.display1();
	}

}
