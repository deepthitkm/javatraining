//11. Java program to sort an array of positive integers of a given array, in the sorted array the value of the first element 
//should be maximum, the second value should be the minimum value, the third should be the 
//second maximum, the fourth second be the second minimum and so on.
package Task4;

import java.util.Arrays;

public class SortedIntegers {
	static int[] rearrange(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
        
        return temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[]{11, 24, 31, 45, 58, 60, 72, 89, 98, 100};
        int result[];
         
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
         
        result = rearrange(nums,nums.length);
         
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));

	}

}
