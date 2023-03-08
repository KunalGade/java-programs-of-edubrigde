package collectionprgs;

public class Employee {
  private String name;
  private int id;
  private int age;
  private long salary;
  
  public int getid()
  {
	  return id;
  }
  public String getname()
  {
	  return name;
  }
  public int getage()
  {
	  return age;
  }
  public long getsalary()
  {
	  return salary;
  }
 public Employee(int id,String name,int age,long salary)
 {
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
 }
 public String tostring()
 {
	 return "[id="+this.id+",name="+this.name+",age="+this.age+",salary="+this.salary+"]";
 }
}

