package methodoverloading;

public class Test5 {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);//20
		
		Test5 t=new Test5();
		System.out.println(t.a);//10
		
		t.m1();	
		m2();
	}	
	  void m1()
	{
		System.out.println(a);//10
		System.out.println(b);//20
	}
	static void m2()
	{
		System.out.println("static method");
		System.out.println(b);//20
	}
}

