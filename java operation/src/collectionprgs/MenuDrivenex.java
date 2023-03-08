package collectionprgs;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<College> al=new ArrayList<College>();
        Scanner sc=new Scanner(System.in);
        int collegeno;
        String collegenm;
        String collegelc;
        int choice;
        while(true)
        {
        	System.out.println("1.insert");
        	System.out.println("2.Display");
        	System.out.println("Enter your choice");
        	choice=sc.nextInt();
        	switch(choice)
        	{
       case 1:
        		System.out.println("enter college no:");
        		collegeno=sc.nextInt();
        		System.out.println("enter collegenm:");
        		collegenm=sc.next();
        		System.out.println("enter collegelc:");
        		collegelc=sc.next();
        		College c=new College();
        		c.setCollegeno(collegeno);
        		c.setCollegenm(collegenm);
        		c.setCollegelc(collegelc);
        		al.add(c);
        		System.out.println("Record inserted sucessfully");
        		break;
       case 2:
        		System.out.println("************************");
        		for(int i=0;i<al.size();i++)
        		{
        			System.out.println("College record:"+i+1);
        			System.out.println("College");
        		}
        		
        	}
        }
	}

}