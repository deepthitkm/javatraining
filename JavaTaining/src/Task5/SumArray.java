//2. Write a JAVA program that gives the sum of all the values of the array except
//the highest and lowest values.
package Task5;

import java.util.Arrays;

public class SumArray {
	public static void main(String[] args)
	 {
	    int[] array_nums = {15, 7, 20, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max = array_nums[0];
		int min = array_nums[0];
		
		int sum = array_nums[0];
		for(int i = 1; i < array_nums.length; i++)
		{
			sum  += array_nums[i];
			if(array_nums[i] > max)
				max = array_nums[i];
			else if(array_nums[i] < min)
				min = array_nums[i];
		}
		
		int x = sum-max-min;
		
		System.out.println("The sum of array except highest and lowest values:"+x);
		System.out.print("\n");	
	  }
	}


