package ZohoInterview;

public class a1b10Toabbbbbbbbbb_pattern {
/*	Eg 1: Input: a1b10
    Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
       Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k="b3c6d15";
		char[] s=k.toCharArray();
		//String [] s1=s.split("[0-9]");
		//String [] s2=s.split("[a-zA-Z]");
//		for(String a:s2) {
//			System.out.println(a);
//		}
		for(int i=0;i<s.length;i=i+2) {
	
			int l=Integer.parseInt(String.valueOf(s[i+1]));
			for(int j=0;j<l;j++) {
				System.out.println(s[i]);
			}
		}

	}

}
