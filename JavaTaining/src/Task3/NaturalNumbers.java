//4.Program that takes one integer input n from the user, and displays all the so, print sum of n natural numbers.
package Task3;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;++i)
		{
			int sum=0;
		    sum=sum+i;
			System.out.println(sum);
		}
		 int s=n*(n+1)/2;
		System.out.println("The sum of natural numbers: "+s);
		scan.close();
	}

	
}





