package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Serializableex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileOutputStream fos=new FileOutputStream("Emp.txt");
     ObjectOutputStream oos=new ObjectOutputStream(fos);
     Employee e=new Employee();
     e.name="ganesh";
     e.dg="engg";
     e.add="pune";
     oos.writeObject(e);
     System.out.println("seralizable done");
	}

}
