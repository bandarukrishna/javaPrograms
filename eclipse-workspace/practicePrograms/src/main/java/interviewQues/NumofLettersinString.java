package interviewQues;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumofLettersinString {
	/*Input:
		str = aaaabbbccc
		Output: a4b3c3
		Explanation: a repeated 4 times
		consecutively b 3 times, c also 3
		times.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="wwwwaaadexxxxxx";
		String m=letterCount(str);
		System.out.println(m);
		
	}
static String letterCount(String s) {
	Map<Character, Integer> m=new LinkedHashMap<Character, Integer>();
	char [] s1=s.toCharArray();
	String sb ="";
	for(char k:s1) {
		if(!m.containsKey(k)) {
			m.put(k, 1);
		}
		else {
			int i=m.get(k)+1;
			m.put(k, i);
			//m.replace(k, i);
		}
		
	}
	
	for(Map.Entry<Character, Integer> mp:m.entrySet()) {
		sb=sb.concat(mp.getKey().toString());
		sb=sb.concat(mp.getValue().toString());

	}
	return sb;
	
	
}
}
