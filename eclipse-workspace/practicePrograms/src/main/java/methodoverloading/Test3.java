package methodoverloading;

class Animal
{
	
}
class Tiger extends Animal
{
	
}
public class Test3
{
	
	int m1(Animal a)//method definition
	{
		System.out.println("Animal version method");
		return 10;
	}
	public void m1(Tiger  t)//method definition
	{
		System.out.println("Tiger version method");
	}
	
	
public static void main(String[] args)
{
	Test3  t=new Test3();
	
	Animal a=new Animal();
	t.m1(a);//method call - Animal version method
	
	Tiger tr=new Tiger();
	t.m1(tr);//method call - Tiger version method
	
	
	Animal a1=new Tiger();//confusion starts here.
/*type of a1 is Animal but a1 is referring Tiger object. */
	t.m1(a1);//method call - Animal version method
	}
}
