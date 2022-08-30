//5. Program to print all the numbers from 0-6 except 3 and 6
package Task2;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;

		for(i=0;i<=6;i++)
		{
			if(i==3 || i==6)
				continue;
		 System.out.println(i+ " ");
	}

}
}

