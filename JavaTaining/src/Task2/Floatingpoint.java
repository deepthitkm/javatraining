//7. Program to read a floating point number and printing
package Task2;

import java.util.Scanner;

public class Floatingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner Scan = new Scanner(System.in);
System.out.println("Enter a value");
{
	float a = Scan.nextFloat();
	
	if(a==0)
	{
		System.out.println("Zero");
	
	}
	else if(a>0)
	{
		System.out.println("Positive");
	}
	else
	{
		System.out.println("Negative");
	}
	System.out.println("Absolute Value of the entered number is: \n"+ Math.abs(a));
	if(Math.abs(a)<1)
	{
		System.out.println("Small");
	}
	else if(Math.abs(a)>1000000)
	{
		System.out.println("Large");
	}
}

Scan.close();
	}

}
