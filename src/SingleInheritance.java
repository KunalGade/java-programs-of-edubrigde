
public class Student{
	void display()
	{
		System.out.println("parent class");
	}
	
}
class WorkingStudent extends  Student{
	void showdata()
	{
		System.out.println("child class");
		showdata();
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkingStudent w=new WorkingStudent();
				w.display();
		w.showdata();
	}

}
