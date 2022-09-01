//7.Java program to find the number of days in a month.
package Task3;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a month number");
		int m = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Input a Year");
		int y = scan1.nextInt();
		
		if(m==1)
		{
			System.out.println("January " +y+ " has 31 days");
			
		}
		else if(m==2)
		{
			if(y%400==0||y%4==0 && y%100!=0)
			{
			System.out.println("February " +y+ " has 29 days");
			}
			else
			{
				System.out.println("February " +y+ " has 28 days");
			}
		}
		else if(m==3)
		{
			System.out.println("March " +y+ " has 31 days");
			
		}
		else if(m==4)
		{
			System.out.println("April " +y+ " has 30 days");
			
		}
		else if(m==5)
		{
			System.out.println("May " +y+ " has 31 days");
			
		}
		else if(m==6)
		{
			System.out.println("June "  +y+ " has 30 days");
			
		}
		else if(m==7)
		{
			System.out.println("July " +y+ " has  31 days");
			
		}
		else if(m==8)
		{
			System.out.println("August " +y+ " has 31 days");
			
		}
		else if(m==9)
		{
			System.out.println("September" +y+ " has 30 days");
			
		}
		else if(m==10)
		{
			System.out.println("October" +y+ " has 31 days");
			
		}
		else if(m==11)
		{
			System.out.println("November" +y+ " has 30 days");
			
		}
		else if(m==12)
		{
			System.out.println("December" +y+ " has 31 days");
			
		}
		else
		{
			System.out.println("Invalid Details");
		}
		scan.close();
		scan1.close();
	}

}



	


