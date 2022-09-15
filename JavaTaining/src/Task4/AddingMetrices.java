//4.program to add two matrices of the same size.
package Task4;

import java.util.Scanner;

public class AddingMetrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n;
Scanner s= new Scanner(System.in);
System.out.println("Enter row and column size ");
m=s.nextInt();
n=s.nextInt();
int a[][]= new int[m][n];
int b[][]= new int[m][n];
int c[][]= new int[m][n];
System.out.println("Enter values for first Matrix");
for(int i=0;i<m;i++)
	for(int j=0;j<n;j++)
		a[i][j]=s.nextInt();
System.out.println("Enter values for Second Matrix");
for(int i=0;i<m;i++)
	for(int j=0;j<n;j++)
		b[i][j]=s.nextInt();
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
	c[i][j]=a[i][j]+b[i][j];
System.out.println("Matrix A");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
	
	System.out.println("Matrix B");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	
}
System.out.println("Sum of Matrices are:");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
s.close();
}
	

	}


