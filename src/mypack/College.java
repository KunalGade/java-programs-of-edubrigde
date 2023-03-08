package mypack;

public class College {
	
	class Person{
		String gender;
		Person(String g){
			gender=g;
			
		}
		void display() {
			
			System.out.println("I am:"+gender);
		}
		
		
		
	}
	class Women extends Person{
		String name;
		Women(String nm){
		super("female");
		
		name=nm;
		
		}
		void display1() {
			super.display();
			System.out.println("my name is:"+name);
		}

	}

	public class Stud1{
		
		public static void main(String[] args) {
			Women w=new Women("Ankita");
		    w.display1();
			

		}

	}
}
	
