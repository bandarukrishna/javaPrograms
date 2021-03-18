package ZohoInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a1b10Toabbbbbbbbbb_pattern {
/*	Eg 1: Input: a1b10
    Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
       Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="b3c6d15";
		//char[] s=k.toCharArray();
		List s1=new ArrayList();
		List s2=new ArrayList();
		//String [] 
		s2=Arrays.asList(s.split("[a-z]"));
		s2.remove(" ");
		s2.removeIf(null);
		s1=Arrays.asList(s.split("[0-9]"));

		//String [] s2=s.split("[a-z]");
		
		/*
		 * for(String a:s2) { if(a!=null)
		 * 
		 * } for(int i=0;i<=s2.length;i++) {
		 * 
		 * int l=Integer.parseInt(String.valueOf(s2[i])); for(int j=0;j<l;j++) {
		 * System.out.print(s2[i]); } }
		 */

	}

}
