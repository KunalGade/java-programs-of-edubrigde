package java8;

public class Employee {
	
		String name;
		int id;
		String dg;
		String lc;
		int salary;
		public Employee(String name, int id,String dg,String lc,int salary) {
			this.name=name;
			this.id=id;
			this.dg=dg;
			this.lc=lc;
			this.salary=salary;	
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", dg=" + dg + ", lc=" + lc + ", salary=" + salary
					+ "]";
		}
		public Object getName() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		

		

}


