package file;
import java.io.*;

public class DeserializableEx {



	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("Emp.txt");
       ObjectInputStream obb=new ObjectInputStream(FileInputStream);
       Employee e1=null;
       e1=(Employee) ObjectInputStream.readObject();
       ObjectInputStream.close();
       FileInputStream.close();
       System.out.println("Deseralizable Data");
       System.out.println("Name:"+e1.name);
       System.out.println("Deg"+e1.dg);
       System.out.println("add"+e1.add);
       
	}

}
