package homework;

public class ClassEight {

	public static void main(String[] args) {
		login("Mohit Kumar");
		login("rohit kuamr", "  kumar rohit");
	}
	public static void login(String username) {
		
		System.out.println("username  "+username +" failure  messages");
		
	}
	public static void login(String username,String password) {
		
		System.out.println("username  "+username+"password"+ password+" login  successdd");
		
		
	}
}
