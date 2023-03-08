package operters;

import java.util.Scanner;

public class ifelseoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter marks:");
       int marks=sc.nextInt();
       if(marks>=60)
       {
    	   System.out.println("you passed with first grade:");
       }
       else if(marks>=45 || marks<60)
       {
    	  System.out.println("you passed with Second grade:");
       }
       else if(marks>=33 || marks<45)
       {
    	   System.out.println("you passed with Third grade:");
       }
       else 
       {
    	   System.out.println("sorry you are fail:");
       }
	}

}
