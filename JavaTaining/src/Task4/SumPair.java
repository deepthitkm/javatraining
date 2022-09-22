//9. Java program to find the sum of the two elements of a given array
//which is equal to a given integer.
//a. Sample array: [1,2,4,5,6]
//b. Target value: 6.
package Task4;

public class SumPair {

	
		static boolean chkPair(int A[], int size, int x) {
		      for (int i = 0; i < (size - 1); i++) {
		          for (int j = (i + 1); j < size; j++) {
		              if (A[i] + A[j] == x) {
		                  System.out.println("Pair with a given sum " + x +
		                                     " is (" + A[i] + ", " + A[j] + ")");
		   
		                  return true;
		              }
		          }
		      }
		 
		      return false;
		  }
		 
		public static void main(String[] args) {
			
			 int A[] = {1, 2, 4, 5, 6};
		      int x = 6;
		      int size = A.length;
		 
		      if (chkPair(A, size, x)) {
		          System.out.println("Valid pair exists");
		      }
		      else {
		          System.out.println("No valid pair exists for " + x );
		      }
		  }
		
	}


