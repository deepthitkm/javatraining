//1. Print the sum, difference, and product of two complex numbers by creating a
//class named 'Complex' with separate methods for each operation whose real
//and imaginary parts are entered by the user.

package Task6;


class Complex {
 
 int real, imaginary;

  Complex()
 {
 }

  Complex(int tempReal, int tempImaginary)
 {
     real = tempReal;
     imaginary = tempImaginary;
 }

  Complex addComp(Complex C1, Complex C2)
 {
        Complex temp = new Complex();
         temp.real = C1.real + C2.real;
          temp.imaginary = C1.imaginary + C2.imaginary;
     
     return temp;
 }

  Complex subtractComp(Complex C1, Complex C2)
 {
         Complex temp = new Complex();
          temp.real = C1.real - C2.real;
         temp.imaginary = C1.imaginary - C2.imaginary;
         return temp;
 }
 Complex MultiplyComp(Complex C1, Complex C2)
 {
          Complex temp = new Complex();
         temp.real = C1.real * C2.real;
          temp.imaginary = C1.imaginary * C2.imaginary;
          return temp;
 }
 
 void printComplexNumber()
 {
     System.out.println("Complex number: "
                        + real + " + "
                        + imaginary + "i");
 }
}

public class ComplexNumbers {
 
 public static void main(String[] args)
 {
        Complex C1 = new Complex(3, 2);
          C1.printComplexNumber();
          Complex C2 = new Complex(9, 5);
          C2.printComplexNumber();
        Complex C3 = new Complex();
         C3 = C3.addComp(C1, C2);
          System.out.print("Sum of ");
     C3.printComplexNumber();
       C3 = C3.subtractComp(C1, C2);
          System.out.print("Difference of ");
     C3.printComplexNumber();
     C3 = C3.MultiplyComp(C1, C2);
          System.out.print("Product of ");
     C3.printComplexNumber();
 }
}
	
	
