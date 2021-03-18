package practicePrograms;

import java.util.Stack;

public class balancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="{{{[[[]]]}}}[";
Stack<Character> st=new Stack<Character>();
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c=='{' || c== '[' || c=='('){
		st.push(c);
	}
	else if(c=='}' || c== ']' || c==')') {
		char check=st.pop();
		if(check=='{' && c=='}') {
			continue;
		}
		else if(check=='[' && c==']') {
			continue;
		}
		else if(check=='(' && c==')') {
			continue;
		}
	}
	
}
if(st.isEmpty()) 
	System.out.println("Given string is balanced");

else
	System.out.println("Given string is not balanced");
	}

}
