package practicePrograms;
public class sumOfNumInString {

	public static void main(String[] args) {
		String s="adc10c11d12";
		//input adc10c11d12, output 33
		String temp="0";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}
			else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}

		}
		sum=sum+Integer.parseInt(temp);
		System.out.println(sum);
	}
}