//1. Write a JAVA program that takes a given String of words and returns the
//length of the shortest word.
package Task5;

public class Shortestword {
	public static void main(String[] args){     
	      String string = "This is the best resource for learning";    
	      String word = "", small = "";    
	      String[] words = new String[100];    
	      int length = 0;    
	          
	          
	      string = string + " ";    
	          
	      for(int i = 0; i < string.length(); i++){    
	             
	          if(string.charAt(i) != ' '){    
	              word = word + string.charAt(i);    
	          }    
	          else{    
	                 
	              words[length] = word;    
	                  
	              length++;    
	                  
	              word = "";    
	          }    
	      }            
	          
	      small = words[0];    
	          
	          
	      for(int k = 0; k < length; k++){    
	              
	             
	              
	          if(small.length() > words[k].length())    
	              small = words[k];    
	   
	             
	              
	              
	                
	      }    
	      System.out.println("Shortest word: " + small);    
	         
	  } 
	}  


