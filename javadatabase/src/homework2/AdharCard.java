package homework2;

import java.util.Random;

public class AdharCard {
	
	//create adhar card
	//get adhar phone number
	//change mobile number
	//change address
	//change Date of brith
	
	
	
	public static int CerateAdhar(String name,int age) {
		int adharNumber=new Random().nextInt(11111111,99999999);
		
		System.out.println("Cerate Adhar card  "+name +"  "+age+" " +adharNumber );
		return adharNumber;
	}	
	public static void GetAdharphoneNumber(int adharNumber) {
		System.out.println("getting adhar phone number  "+adharNumber);
		
		
	}	
	public static void changeMobile(int adharNumber ) {
		System.out.println("change Mobile Number  "+adharNumber);
		
		
	}	
	public static void changeAddress(int adharNumber) {
		System.out.println("change address "+adharNumber);
		
	}
	public static void changeDob(int adharNumber) {
		System.out.println("change Date of Birth "+adharNumber);
		
		
	}
}
