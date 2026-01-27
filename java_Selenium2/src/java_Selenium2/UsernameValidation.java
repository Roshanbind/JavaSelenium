package java_Selenium2;

public class UsernameValidation {

	public static void main(String[] args) {

		/*
		 * -using equals
			Username validation 
			(Admin, admin)
		 */
		String	UserName="Admin";
		String UserName1="admin";
		if(UserName.equals(UserName1)) {
			System.out.println("UserName case same to------pass");
		}else {
			System.out.println("UserName case not same to---- Fail");
		}
		/*
		 * IgnoreCase
		Username validation 
		(Admin, admin)
		 */
		String UserName3="Admin";
		String UserName4="admin";
		if(UserName3.equalsIgnoreCase(UserName4)) {
			System.out.println("UserName case same to------pass");
		}else {
			System.out.println("UserName case not same to---- Fail");
		}
		EmailValidetion();
	}
	public static void EmailValidetion() {
		/*Email id case insensitive match(equals)
			Test@Gmail.com
			test@gmail.com 
		 * 
		 */
		String Email="Test@Gmail.com";
		String EmailNew="test@Gmail.com";
		if(Email.equals(EmailNew)) {
			System.out.println("email case latter same to -- Pass");
		}else {
			System.out.println("email case latter not same to -- fail");
		}
		/*
		 *Email id case insensitive match(equalsIgnoreCase)
			Test@Gmail.com
			test@gmail.com  
		 * 
		 */
		String email="Test@Gmail.com";
		String Emailnew="test@Gmail.com";
		if(email.equalsIgnoreCase(Emailnew)) {
			System.out.println("email case latter same to -- Pass");
		}else {
			System.out.println("email case latter not same to -- fail");
		}
	}

}
