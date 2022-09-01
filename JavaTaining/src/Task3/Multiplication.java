//1. Program to print multiplication table
package Task3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number for multiplication table");
		int a = Scan.nextInt();
		
		 for(int i=1;i<=10;i++)
		{
			int b =a*i;
			System.out.println(a +" * "  +i +" = " +b);
		}
		 Scan.close();
	}
}
