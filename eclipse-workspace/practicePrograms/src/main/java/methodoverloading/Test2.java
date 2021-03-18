package methodoverloading;

public class Test2
{
	
	int m1(float f)
	{
		System.out.println("float arg method");
		return 10;
	}
	public void m1(String s)
	{
		System.out.println("string arg method");
	}
	
public static void main(String[] args)
{
	Test2  t=new Test2();
	byte b=10;
	t.m1(b);
	
	t.m1("hyd");
}
}

