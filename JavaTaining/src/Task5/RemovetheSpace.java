//3. Write a JAVA method to remove all the spaces from the String and return the
//resultant.
package Task5;

public class RemovetheSpace {
	public static void main(String[] args)
    {
        String str = "     This   is     the Best     ";
 
        
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
}


