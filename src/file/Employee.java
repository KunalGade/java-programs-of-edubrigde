package file;

import java.io.Serializable;

public class Employee implements Serializable 
{
    String name;
    String dg;
    String add;
    public void Employee()
    {
    	System.out.println("name"+name);
    	System.out.println("dg"+dg);
    	System.out.println("add"+add);
    }
}
