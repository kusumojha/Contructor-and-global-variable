package pkg2;
import java.util.Scanner;
public class arithemic2 
{
  public int add(int a,int b)
  {
	  return a+b;
 }
  public int sub(int a,int b)
  {
	  return a-b;
 }
  public int mul(int a,int b)
  {
	 return(a*b);
 }
  public int div(int a,int b)
  {
	  return a/b;
 }
  public static void main(String[] args)
{
  	arithemic2 a2=new arithemic2();
  	Scanner s=new Scanner(System.in);
  	System.out.println("enter value of x1");
  	int x1=s.nextInt();
  	System.out.println("enter value of x2");
  	int x2=s.nextInt();
	System.out.println("enter value of x3");
  	int x3=s.nextInt();
	System.out.println("enter value of x4");
  	int x4=s.nextInt();
	System.out.println("enter value of x5");
  	int x5=s.nextInt();
  	System.out.println("enter value of x6");
  	int x6=s.nextInt();
  	int total=a2.add(x1,x2);
  	total=a2.sub(total,x3);
  	total=a2.add(total, x4);
  	total=a2.div(total, x5);
  	total=a2.mul(total, x6);
  	System.out.println("total is:"+total);
  	
}
}
