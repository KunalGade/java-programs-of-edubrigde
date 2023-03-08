import java.util.Scanner;

public class Source {

	public static void main(String args[])
	{
		
				Scanner scanner = new Scanner(System.in);

				// Get the number of rows from the user
				System.out.println("Enter the numbers to print the pattern :");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int rows = scanner.nextInt();
//				System.out.println(a + " " + b + " " + rows );

				for (int i = 1; i <= a; i++) {
					for (int j = a; j > i; j--) {
						System.out.print(" ");
					}

					for (int k = 1; k <= i; k++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

				for (int i = 1; i <= b ; i++) {
					for (int j = b; j > i; j--) {
						System.out.print(" ");
					}

					for (int k = 1; k <= i; k++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

				for (int i = 1; i <= rows ; i++) {
					for (int j = rows; j > i; j--) {
						System.out.print(" ");
					}

					for (int k = 1; k <= i; k++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}

			}
		}