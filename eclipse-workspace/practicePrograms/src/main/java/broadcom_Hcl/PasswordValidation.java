package broadcom_Hcl;

import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="Passmword@123";
		boolean b=	Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W\\_])(?=\\S+$).{8,20}$")

				.matcher(password).matches();
		if(b) {
			System.out.println("Password matches the requirement");
		}
		else {
			System.out.println("Password not matches the requirement");
		}
	}

}
