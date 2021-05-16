package CdkGlobal;

import java.util.Arrays;

public class ArrayRotationUsingStrucralcode {
	public static void main(String [] args) {
	int a[]= {1,2,3,4,5,6,7};
	int n=3;
	for(int i=0;i<n;i++)
	{
		rotateArray(a);
	}
	System.out.println(Arrays.toString(a));	
	}
static void rotateArray(int a[]){
	int temp=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
	}
	a[a.length-1]=temp;
}
//generic code for all data types data should in object array like Integer,Character
public static <T> void rotate(T[] a) {
	
	Object var=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
	}
	
	a[a.length-1]=(T) var;
}
}
