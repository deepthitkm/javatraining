//2. Sum and Average of 10 numbers

package Task3;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				int Sum =0;
				System.out.println("Enter 10 numbers");
		for(int i=1;i<=10;i++)
				
		{
			int a = scan.nextInt();
				
		 Sum = Sum+a;
		}
		 int Average = Sum/10;
		 System.out.println("Sum of the numbers: "+Sum);
		 System.out.println("Average of the numbers: "+Average);
		

		

	}
	
	}


