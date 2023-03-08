package operters;
import java.util.*;
public class Hellopyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter Hollow Pyramid Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Hollow Pyramid Pattern of Stars");
		
		int i, j, k;		
		for (i = 1 ; i <= rows; i++ ) 	
		{
			for (j = 1 ; j <= rows - i; j++ ) 	
			{
				System.out.print(" ");
			}
			for (k = 1; k <= (i * 2) - 1; k++ ) 
			{
				if(k == 1 || k == i * 2 - 1 || i == rows) {
					System.out.print("*");
				}	
				else {
					System.out.print(" ");
				}
			}		
			System.out.println();
		}

	}

}
