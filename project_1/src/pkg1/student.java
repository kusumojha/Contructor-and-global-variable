package pkg1;

public class student {
	int age;
	int roll_no;
	public void display1()
	{
		System.out.println("WELCOME TO ALL OF YOU");
		
	}
    public void dispaly2()
    {
    	System.out.println("SELENIUM IS GOOD TOOL");
    }
public static void main(String[] args) {
	student kusum=new student();
	kusum.display1();
	kusum.dispaly2();
	kusum.age=22;
	System.out.println("kusum's age is="+kusum.age);
	kusum.roll_no=12;
	System.out.println("kusum's roll_no is:"+kusum.roll_no);
	
	
}
}

