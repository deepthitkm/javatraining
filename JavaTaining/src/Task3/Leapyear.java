//8. Program to find Leap year
package Task3;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year");
		int year = scan.nextInt();
		if((year%400==0)||(year%4==0) && (year%100!=0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		scan.close();
	}
	

}
