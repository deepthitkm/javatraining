package Task3;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Input first number");
		int a = Scan1.nextInt();
		Scanner Scan2 = new Scanner(System.in);
		System.out.println("Input Second number");
		int b = Scan2.nextInt();
		Scanner Scan3 = new Scanner(System.in);
		System.out.println("Input third number");
		int c = Scan3.nextInt();
		if(a<b &&a<c)
		{
			if(b>a && b<c)
			{
				System.out.println("Increasing");
			}
		}
		 if(a>b && a>c)
		{
			if(b<a && b>c)
			{
				System.out.println("Decreasing");
			}
		}
	
		else
		{
			System.out.println("Neither increasing nor decreasing");
		}
		Scan1.close();
		Scan2.close();
		Scan3.close();
		
	}
}

