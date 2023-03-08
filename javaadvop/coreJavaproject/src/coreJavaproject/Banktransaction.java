package coreJavaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Banktransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Bank> bl=new ArrayList<Bank>();
       Scanner sc=new Scanner(System.in);
       int Bid;
       String name;
       String Branch;
       String city;
       int ch;
       while(true)
       {
    	   System.out.println("******city bank of india******");
    	   System.out.println("1.Display all account detaills");
    	   System.out.println("2.check balance");
    	   System.out.println("3.Deposit the amount");
    	   System.out.println("4.withdraw amount");
    	   System.out.println("5.Exit");
    	   System.out.println("Enter your chioce");
    	   ch=sc.nextInt();
    	   switch(ch)
    	   {
    	   case 1:
    		   for(int i=0;i<bl.size();i++)
    		   {
    			   System.out.println("bank accounts"+i+1);
    			   System.out.println("bank accounts");
    		   }
    	   case 2:
    		   if(amount <=5000)
    		   {
    			   
    		   }
    		   
    	   }
    	   
       }
       
       
	}

}
