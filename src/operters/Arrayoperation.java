package operters;

import java.util.Scanner;

public class Arrayoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,rows,column;
       Scanner sc=new Scanner(System.in);
       System.out.println("please enter number of elements in array:");
       rows=sc.nextInt();
       System.out.println("please enter number of elements in column:");
       column=sc.nextInt();
       int[][]Array=new int[rows][column];
       System.out.println("please enter"+rows+column+"elements of an array:");
       for( i=0;i<rows;i++)
       {
    	   for(j=0;j<column;j++)
    	   {
    	   Array[i][j]=sc.nextInt();
       }
       System.out.println("\n elements in array");
       for(i=0;i<rows;i++)
    	   for(j=0;j<column;j++)
       {
    	   System.out.println(Array[i][j]+"\t");
       }

	}
	}
}

