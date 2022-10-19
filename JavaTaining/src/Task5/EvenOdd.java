//5. Write a JAVA program that takes out the even from the odds and odd from
//the list of even numbers,
package Task5;

public class EvenOdd {
	public static void main(String args[]){  
		int a[]={23,25,75,87,47,1,91,51,2}; 
		int b[]= {22,44,64,76,98,12,43,54,90};
		
		System.out.println("Even Numbers from the list of odd numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);
		
		
		System.out.println("Odd Numbers from the list of even numbers:");  
		for(int j=0;j<b.length;j++){  
		if(b[j]%2!=0){  
		System.out.println(b[j]);  
		}  
		}  
		}
		}
	}
}
	

		


