package RegEx;

import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		String regex="^([a-zA-Z0-9._]){9,12}+@[a-z]+.[a-z]{2,5}$";
		String mail="krishnabha._@gmailcom";
		boolean b=Pattern.compile(regex).matcher(mail).matches();
		System.out.println("Pattern matched "+b);
	}

}
