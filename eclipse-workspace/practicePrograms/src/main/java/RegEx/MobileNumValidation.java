package RegEx;

import java.util.regex.Pattern;

public class MobileNumValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="([7-9]){1}[0-9]{9}"; // or  String regex="[7-9]\\d{9}"
		String num="7491965725";
		boolean b=Pattern.compile(regex).matcher(num).matches();
		System.out.println("Pattern matched "+b);
	}

}
