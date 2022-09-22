//7. program to get the difference between the largest and smallest
//values in an array of integers. The length of the array must be 1 and above.
package Task4;

import java.util.Arrays;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(a)); 
		int max_val = a[0];
		int min = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max_val)
				max_val = a[i];
			else if(a[i] < min)
				min = a[i];
		}
		System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));	
	 }
	

	}


