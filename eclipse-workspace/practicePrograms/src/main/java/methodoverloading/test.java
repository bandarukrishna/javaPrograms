package methodoverloading;

public class test
{
	
	int m1(Object o)
	{
		System.out.println("object arg method");
		return 10;
	}
	public void m1(Number n)
	{
		System.out.println("Number arg method");
	}
	public void m1(Integer I)
	{
	System.out.println("Integer arg method");
	}
	
public static void main(String[] args)
{
	test  t=new test();
	Integer I=new Integer(10);
	t.m1(I);//Integer-arg method
/*if m1(Integer) method is not available then m1(Number) method will be executed.
If m1(Number) method is not available then m1(Object) method will be executed */
	t.m1(new Integer(10));//Integer-arg method
}
}

