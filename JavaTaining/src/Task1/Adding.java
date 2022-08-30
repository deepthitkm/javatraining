//3.Program to add
package Task1;
import java.util.Scanner;
public class Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan = new Scanner(System.in);
{
	System.out.println("Enter any two numbers between 1-10");
	int x = Scan.nextInt();
	int y = Scan.nextInt();
	if(x>10||y>10)
	{
		System.out.println("Enter the value between 1-10");
	}
	else {
	int z= x+y;
	
	System.out.println("The value of Z = " +z);
	z=z+30;
	System.out.println("After adding 30, the value of z is " +z);
}
Scan.close();

	}

}
}
