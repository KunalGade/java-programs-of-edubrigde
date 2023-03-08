import java.util.Scanner;

public class New {

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number to print :");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     
     for(int i=1;i<=a;i++)
     {
    	 for(int j=a; j> i; j--)
    	 {
    		 
    	 System.out.print(" ");
    	 }
    	 for(int k=1;k<=i;k++) {
    		 System.out.print(i+ " ");
    	 }
    	 System.out.println();
     }
     for(int i=1;i<=b;i++) {
    	 
     
     for (int j= b;j> i;j--)
     {
    	 System.out.print(" ");
     }
     for(int k=1;k<= i;k++)
     {
    	 System.out.print( i +" ");
    	 
     }
     System.out.println();
    }
	for(int i = 1;i<= c;i++)
	{
		for(int j=c; j> i;j--)

	{
			System.out.print(" ");
			}
		for(int k=1; k<= i; k++) {
			System.out.print(i +" ");
		}
		System.out.println();
	   }

   }
}