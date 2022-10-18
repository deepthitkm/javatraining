//3. Program to find second smallest element in a array
package Task4;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		
		int[] a = {2,9,5,7,4,10,8,-1};
		System.out.println("Array before sorting" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting" +Arrays.toString(a));
		for(int i=0;i<a.length; i++)
		{
			
		
		if (a[i]<smallest)
		{
			secondsmallest=smallest;
			smallest=a[i];
			
		}
		
		else if(a[i]<secondsmallest)
		{
			secondsmallest=a[i];
			
		}
	
		}
		
	System.out.println("The Second smallest number is: "	+secondsmallest);
			
		
		}
	


	}


