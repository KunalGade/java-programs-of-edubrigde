package mypack;

 class employee {
	
		String name;
		String deg="Mca";
		employee() {
			
			System.out.println("Default employee");
		}
		employee(String nm)
		{
			name=nm;
			System.out.println("My name is:"+name);
		}
	}
	class Department extends Employee
	{
		String location;
		String deg="bsc";
		Department(String lc)
		{
			super();
//		super("Avni");
			System.out.println("Department location is:"+lc);
			
		}
		void show()
		{
			System.out.println("Degree is:"+super.name);
		}
		
	}
	public class Superexample  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Department d=new Department("Pune");
			d.show(); 
		}

	}



