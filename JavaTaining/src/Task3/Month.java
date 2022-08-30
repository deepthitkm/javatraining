//3. Program to take user input from 1 to 12 for months, and displays the number of days of a particular month.
package Task3;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number between 1 to 12");
		int m = scan.nextInt();
		if(m==1)
		{
			System.out.println("January = 31 days");
			
		}
		else if(m==2)
		{
			System.out.println("February = 28 days");
			
		}
		else if(m==3)
		{
			System.out.println("March = 31 days");
			
		}
		else if(m==4)
		{
			System.out.println("April = 30 days");
			
		}
		else if(m==5)
		{
			System.out.println("May = 31 days");
			
		}
		else if(m==6)
		{
			System.out.println("June = 30 days");
			
		}
		else if(m==7)
		{
			System.out.println("July = 31 days");
			
		}
		else if(m==8)
		{
			System.out.println("August = 31 days");
			
		}
		else if(m==9)
		{
			System.out.println("September = 30 days");
			
		}
		else if(m==10)
		{
			System.out.println("October = 31 days");
			
		}
		else if(m==11)
		{
			System.out.println("November = 30 days");
			
		}
		else if(m==12)
		{
			System.out.println("December = 31 days");
			
		}
		else
		{
			System.out.println("Invalid Details");
		}
		scan.close();
	}

}
