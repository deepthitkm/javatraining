//5. Program that takes long type input from the user, display the number of digits and the sum of all the digits.
package Task3;

import java.util.Scanner;

public class Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		long digits;
		long sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = scan.nextLong();
		while(n>0)
		{
			
			digits = n%10;
			sum = sum+digits;
			n=n/10;
			count++;
			
		}
		System.out.println("The number of digits are: " +count);
		System.out.println("The sum of digits are: " +sum);
		scan.close();
	}

}
