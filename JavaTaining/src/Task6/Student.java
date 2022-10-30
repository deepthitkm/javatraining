/*3. Write a program to print the names of students by creating a Student
class. If no name is passed while creating an object of Student class,
then the name should be "Unknown", otherwise the name should be
equal to the String value passed while creating an object of Student
class. (Hint: Overloading concept)*/

package Task6;


	class stud{
	     String ss;
	    String name;
	  public stud(String ss){
	      name = ss;
	  }
	  public stud()
	  {
	      name = "unknown";
	  }
	}
	public class Student{
	    public static void main(String[] args) {
	        stud obj = new stud();
	        obj.ss = "Joseph";
	      
	        System.out.println(obj.ss);
	        System.out.println(obj.name);

	        
	    }
	}


