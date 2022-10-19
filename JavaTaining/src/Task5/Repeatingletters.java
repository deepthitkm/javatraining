//4. Write a JAVA method to return a boolean true if the string doesn’t have
//repeating letters and consecutive or nonconsecutive i.e. all the letters of the
//string be unique (isogram) else false.
package Task5;

import java.util.Arrays;

public class Repeatingletters {
	static boolean is_isogram(String str)
    {
        
        str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
 
    
    public static void main(String[] args)
    {
        String str1 = "Machine";
       
          
        System.out.println(is_isogram(str1));
 
        String str2 = "Seed";
       
         
        System.out.println(is_isogram(str2));
 
        String str3 = "isogram";
       
          
        System.out.println(is_isogram(str3));
 
        String str4 = "Alzebra";
       
          
        System.out.println(is_isogram(str4));
    }
}


