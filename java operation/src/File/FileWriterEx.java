package File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
     FileWriter fw=new FileWriter("Demo.txt");
     
     fw.write(" hello word");
     System.out.println("sucessfully written");
     fw.close();
	}

}
