//8. program to remove the duplicate elements of a given array and return the new length of the array.
package Task4;

//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Scanner;

public class NewLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,9,5,9,2,10,34,2};
		
		
		System.out.println("Array elements before sorting "+Arrays.toString(a));
		System.out.println("Original length of an Array is : "+a.length);
Arrays.sort(a);
System.out.println("Array elements after sorting "+Arrays.toString(a));
for(int i=0; i<a.length;i++)
{
    //System.out.print(a[i]+" ");
}

System.out.println("\nThe new length of the array is: "+array_sort(a));

}
	 public static int array_sort(int[] a) {
         int index = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[index-1])
                a[index++] = a[i];
        }
	  return index;
    }
}


	