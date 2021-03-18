package interviewQues;

import java.io.File;
import java.util.Arrays;

public class ques1 {

	public static void main(String[] args) {
int a[]= {2,4,3,10,7,8};
int b[]= {19,18,11,13,15,14,1};
int c[]= new int[a.length+b.length];
Arrays.sort(a);
Arrays.sort(b);
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(b));
//System.out.print(Arrays.compare(a, b));
System.arraycopy(a, 0, c, 0, a.length);
System.arraycopy(b, 0, c, a.length, b.length);
Arrays.sort(c);
System.out.print(Arrays.toString(c));
System.arraycopy(c, 0, a, 0, a.length);
System.out.print(Arrays.toString(a));
System.arraycopy(c, a.length,b,0,b.length);
System.out.print(Arrays.toString(b));

	}
	

}
