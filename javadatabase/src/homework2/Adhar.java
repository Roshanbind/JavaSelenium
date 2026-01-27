package homework2;

import java.util.Random;

public class Adhar {


	//create adhar card
	//get adhar phone number
	//change mobile number
	//change address
	//change Date of brith
	
	static int myVar=5000;
	static int adharNumber;
	
	public static void main(String[] args) {


	}

	public static int CerateAdhar(String name,int age) {
		adharNumber=new Random().nextInt(11111111,99999999);

		System.out.println("Cerate Adhar card  "+name +"  "+age+" " +adharNumber );
		return adharNumber;
	}	
	public static void GetAdharphoneNumber() {
		//System.out.println(myVar);
		System.out.println("getting adhar phone number  "+adharNumber);


	}	
	public static void changeMobile( ) {
		//System.out.println(myVar);
		System.out.println("change Mobile Number  "+adharNumber);


	}	
	public static void changeAddress() {
		//System.out.println(myVar);
		System.out.println("change address "+adharNumber);

	}
	public static void changeDob() {
		//System.out.println(myVar);
		System.out.println("change Date of Birth "+adharNumber);


	}

}
