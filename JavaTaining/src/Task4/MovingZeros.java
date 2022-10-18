// 5.program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
package Task4;

import java.util.Arrays;

public class MovingZeros {
	static void movingZerosToEnd(int arr[], int n)
	{
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }
	public static void main (String[] args)
    {
        int arr[] = {0, 9, 0, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        System.out.println("Array elements are: " +Arrays.toString(arr));
        movingZerosToEnd(arr, n);
        System.out.println("Array after moving zeros to the end: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}



