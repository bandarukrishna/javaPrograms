package wrapperClasses;

public class wrapperExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
String s="20";
Integer i=a;  //autoboxing, now compiler will write Integer.valueOf(a) internally  
System.out.println(i);
System.out.println("converting int into Integer explicitly");
Integer j=Integer.valueOf(a); //converting int into Integer explicitly  
System.out.println(j);
Integer k=Integer.valueOf(s);//converting int into Integer explicitly  
System.out.println(k);
	}

}
