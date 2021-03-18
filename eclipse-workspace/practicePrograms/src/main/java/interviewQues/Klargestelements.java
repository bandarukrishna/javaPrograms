package interviewQues;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Klargestelements {
	/*For example, if given array is [1, 23, 12, 9, 30, 2, 50] and 
	you are asked for the largest 3 elements i.e., k = 3 
	then your program should print 50, 30 and 23.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1, 23, 12, 9, 30, 2, 50};
System.out.println("Enter Value K for largestValues");
Scanner s=new Scanner(System.in);
int k=s.nextInt();
		kLargest(a,k);
	}
	static void kLargest(Integer a[],int k) {
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
	for(int i=0;i<k;i++) {
		System.out.println(a[i]);
	}
	}
}
