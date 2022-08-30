//6. Performing the following conditional actions
package Task2;
import java.util.Scanner;
public class oddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = Scan.nextInt();
if(a%2==1)
{
	System.out.println("NEW");
	
}
if (a%2==0)
{
	if (a>=2 && a<=5)
	{
		System.out.println("OLD");	
	}
	else if(a>=6 && a<=30)
	{
		System.out.println("NEW");
	}
	else if(a>30)
	{
		System.out.println("OLD");
	}
}
Scan.close();

	}



}
