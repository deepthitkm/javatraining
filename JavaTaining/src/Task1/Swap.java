// 1.Swapping 2 numbers using third variable
package Task1;
import java.util.Scanner;

public class Swap {
public static void main(String[] args) {

int x;
int y;
int z;
Scanner scan=new Scanner(System.in);
{
System.out.println("Enter the value of x");
//Scanner scan=new Scanner(System.in);
x = scan.nextInt();
System.out.println("Enter the value of y");
//Scanner scan1=new Scanner(System.in);
y = scan.nextInt();

z=y;
y=x;
x=z;

System.out.println("After swapping x =" +x +" Y =" +y);

}
scan.close();
}
}



