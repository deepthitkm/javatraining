//1. Program to remove duplicate elements from array
package Task4;

import java.util.Arrays;

public class RemoveDuplicate {

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
for(int k=0;k<j;k++)
{
	System.out.print(a[k]+" ");
}

	}
}
	


