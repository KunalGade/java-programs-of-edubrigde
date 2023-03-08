package corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmaticExcepation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String name=br.readLine();
     System.out.println(name);
     try
     {
    	 int a=10;
    	 int b=0;
    	 int c=a/b;
    	 System.out.println("c"+c);
    	 
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }
	}

}
