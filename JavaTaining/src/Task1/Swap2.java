//1. Swapping two numbers without using third variable


package Task1;
import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		{	
System.out.println("Enter the value of x:");
int x = Scan.nextInt();
System.out.println("Enter the value of y:");
int y = Scan.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping x="  +x +  " and Y=" +y);
	}
Scan.close();
}
}