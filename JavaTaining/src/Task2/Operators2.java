//2. Program to perform the following operations
package Task2;
import java.util.Scanner;
public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int First;
		int Second;
		int First1;
		int Second2;
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Select one of the following options");
		System.out.println("Enter 1 for Addition \n"+  "Enter 2 for Subtraction \n"+ "Enter 3 for Division \n"+ "Enter 4 for Multiplication\n"+ "Enter 5 for Average\n");
		
		int a = Scan.nextInt();
		System.out.println("Selected Option:"+a);
		//a=1;
		if(a<=4)
		{
		System.out.println("Enter First number");
		First = Scan.nextInt();
		System.out.println("Enter Second number");
	    Second= Scan.nextInt();	
	    switch(a)
	    {
	    case 1:
	    	int Addition=First+Second;
	    System.out.println("Addition:" +Addition);
	    if (Addition<0)
	    
	    {
	    	System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
	    }
	    
	    break;
	    case 2:
	    	int Subtraction=First-Second;
	    System.out.println("Subtraction:" +Subtraction);
	    if (Subtraction<0)
	    
	    {
	    	System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
	    }
	    break;
	    case 3:
	    	int Division=First/Second;
	    System.out.println("Division:" +Division);
	    if (Division<0)
	    
	    {
	    	System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
	    }
	    break;
	    case 4:
	    	int Multiplication=First*Second;
	    System.out.println("Multiplication:" +Multiplication);
	    if (Multiplication<0)
	    
	    {
	    	System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
	    }
	    break;
	    }
	    
	}
		if(a==5)
		{
			{
				System.out.println("Enter First1 number");
				First1 = Scan.nextInt();
				System.out.println("Enter Second2 number");
			    Second2= Scan.nextInt();	
			    int Average = (First1+Second2)/2;
			    System.out.println("Average:" +Average);
			    if (Average<0)
			    
			    {
			    	System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
			    }
			
			
			}
			
			}
		Scan.close();
		}
	
	}




