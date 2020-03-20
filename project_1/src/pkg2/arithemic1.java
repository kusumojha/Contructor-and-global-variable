package pkg2;

public class arithemic1 
{
  //output should be (((((10*2)-2)-2)+2)/2)
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
		arithemic1 a1=new arithemic1();
		int mul_result=a1.mul(10, 2);
		int sub_result=a1.sub(mul_result,2);
		int sub_result1=a1.sub(sub_result, 2);
		int sum_result=a1.sum(sub_result1,2);
		a1.div(sum_result, 2);
	}
}
