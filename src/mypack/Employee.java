package mypack;

public class Employee {
	String name;
	int id;
  public Employee(){
		
			System.out.println("default constructor:");
			
		}
	Employee(String nm,int i)
	{
		name=nm;
		id=i;
		System.out.println("the name of employe and id"+name+id);
		
	}
	void display()
	{
		System.out.println("constructor called");
	}
	
	public class Deparment
	{
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.display();
		Employee e1=new Employee("ganesh",22);
		
	}		
	}
	
}		
				
	

