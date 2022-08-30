//9. Program to display right angle triangle pattern with numbers
package Task3;

import java.util.Scanner;

public class RightTraiangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
		
			System.out.print(j+"  ");
			System.out.print("\n");
		}
			System.out.print("\n");
			scan.close();
		}

}


