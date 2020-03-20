package pkg2;

public class abc
{
 public abc()
 {
	 System.out.println("default constructor");
	 		
 }
 public abc(int a)
 {
	 this(5,5,6);
	 System.out.println("one parameterized constructor");
	 		
 }
 public abc(int a,int b)
 { 
	 this(5,7,8,23);
	 System.out.println("two parameterize constructor");
	 		
 }
 public abc(int a,int b,int c)
 {  
	 this(54,67);
	 System.out.println("three parameterized constructor");
	 		
 }
 public abc(int a,int b,int c,int d)
 {
	 this();
	 System.out.println("four parameterized constructor");
	 		
 }
 public static void main(String[] args) 
 { 
	 abc s=new abc(5);

 
	
}
 
}
