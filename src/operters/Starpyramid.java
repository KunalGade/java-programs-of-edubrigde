package operters;

import java.util.*;

public class Starpyramid {

	public static void main(String[] args) {
		int n,i,j,space = 1;
		
     System.out.println("Enter no of rows:");
     Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		space=n-1;
		for( j=1;j<=n;j++)
		{
			for(i=1;i<= space;i++)
			{
				System.out.println(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++)
			{
				System.out.println("*");
			}
			System.out.println("");
		}
	}

}
