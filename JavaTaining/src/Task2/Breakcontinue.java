//4. Program to break and continue
package Task2;
import java.util.Scanner;
public class Breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++)
			
		{
		Scanner Scan = new Scanner(System.in);
		//scan.close();
		System.out.println("Enter any number");
		int a= Scan.nextInt();
		//scan.close();
		if(a>=0)
		{
			
					
			System.out.println("Good Going");	
			continue;
		}
	
		if(a<0)
		{
				
			System.out.println("It's Over");
			break;
			
		}
		
	
		}
	}
}
			

	


