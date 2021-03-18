package CdkGlobal;

import java.util.Arrays;

public class devideString {
	
	public static void main(String [] args) {
		String s="bhavanikrishna";
		int n=2,temp=0;
		int l=s.length()/n;
		int k=s.length();
		String [] s1=new String[n];
		if(k%n!=0) {
			System.out.println("Invalid Input: String size" + 
                    "is not divisible by n");
			return;
		}
		for(int i=0;i<s.length()-1;i=i+l) {
	
			s1[temp]= s.substring(i, i+l);
			temp++;

		}
		System.out.println(Arrays.toString(s1));
	}

}
