package pkg2;

public class arithemic
{

	//output should be ((((10+2)-2)+2)*2)/2)
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is:"+c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("substraction result is:"+c);
		return c;
	
	}
	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("multiplication result is:" +c);
		return c;
	}
	public void div(int a,int b)
	{
		int c;
        c=a/b;
        System.out.println("division result is:"+c);
        
	}
	public static void main(String[] args) 
	{
		arithemic a=new arithemic();
		int sum_result=a.sum(10,2);
		int sub_result=a.sub(sum_result, 2);
		int sum_result1=a.sum(sub_result,2);
		int mul_result=a.mul(sum_result1,2);
	    a.div(mul_result, 2);
		
		
	}
	
	
}
