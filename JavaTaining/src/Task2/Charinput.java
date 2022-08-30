//8. Program that takes character input from the user
package Task2;

import java.util.Scanner;
//import java.util.*;


public class Charinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a value");
		{
			var a = reader.next().trim().toLowerCase().charAt(0);
			
			
			if(a=='r')
			{
				System.out.println("Found");
			}
			else if(a=='a')
			{
				System.out.println("Found");
			}
			else if(a=='n')
			{
				System.out.println("Found");
			}
			else if(a=='d')
			{
				System.out.println("Found");
			}
			else if(a=='o')
			{
				System.out.println("Found");
			}
			else if(a=='m')
			{
				System.out.println("Found");
			}
			else
			{
				System.out.println("Not Found");
			}
			reader.close();
	}
		
}
	
	
}

