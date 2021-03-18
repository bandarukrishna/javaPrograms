package practicePrograms;

import java.util.Arrays;

public class ArrayAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int a[]= {1,2,3,5,6,7,8,9};
		int b[]= {4,10,11,12,13};
		int c[]=new int[a.length+b.length];
	System.arraycopy(a, 0, c, 0, a.length);	
	System.arraycopy(b, 0, c, a.length, b.length);
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	System.arraycopy(c, 0, a, 0, a.length);
	System.arraycopy(c,a.length, b, 0, b.length);
	//System.arraycopy(src, srcPos, dest, destPos, length);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	}

}
