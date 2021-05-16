package CdkGlobal;

import java.util.Arrays;

public class devideString {
	
	public static void main(String [] args) {
		String s="bha";
		int n=3;
		int l=s.length()/n;
		if(s.length()%n!=0) {

			System.out.println("String not divide into "+n+" parts");
		}
		else {

			for(int i=0;i<s.length();i=i+l) {
				System.out.println(s.substring(i, i+l));
			}

		}
//		String s="bhavanikrishna";
//		int n=2,temp=0;
//		int l=s.length()/n;
//		int k=s.length();
//		String [] s1=new String[n];
//		if(k%n!=0) {
//			System.out.println("Invalid Input: String size" + 
//                    "is not divisible by n");
//			return;
//		}
//		for(int i=0;i<s.length();i=i+l) {
//	
//			s1[temp]= s.substring(i, i+l);
//			temp++;
//
//		}
//		System.out.println(Arrays.toString(s1));
		
		
	}

}
