//6. Write a program to remove the duplicates from a sorted array, change them
//into 0 and add 0 in the end.
package Task4;

import java.util.Arrays;
//import java.util.Scanner;

public class ReplaceZero {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				int a[] = {2,9,5,9,2,10,34,22};
				int j=0;
				
				System.out.println("Array elements before sorting "+Arrays.toString(a));
				
		Arrays.sort(a);
		System.out.println("Array elements after sorting "+Arrays.toString(a));
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}

		}
		
		a[j++]=a[a.length-1];
		
		System.out.println("Array elements after removing duplicates "+Arrays.toString(a));
		}
}

		//for(int k=0;k<j;k++)
		//{
		//if(a[j]==a[j+1])	
		//{
	//System.out.print(a[k]=0);
	
		//}
		//else
		//{
			//System.out.print(a[k]+ " ");
		//}
			//}
		//}
		//}
		//}
		