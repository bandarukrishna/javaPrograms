package RegEx;

import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)(?=\\S+$).{8,20}";
		String pwd="krish@K123";
boolean b=Pattern.compile(regex).matcher(pwd).matches();
System.out.println("Pattern matched "+b);
	}

}
