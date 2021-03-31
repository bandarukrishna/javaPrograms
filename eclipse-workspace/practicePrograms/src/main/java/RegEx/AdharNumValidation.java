package RegEx;

import java.util.regex.Pattern;

public class AdharNumValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="^[2-9]{1}[0-9]{11}$";
		String Adharnum="749196572512";
boolean b=Pattern.compile(regex).matcher(Adharnum).matches();
System.out.println("Pattern matched "+b);
	}

}
