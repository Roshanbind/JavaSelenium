package myLoop;

import java.util.Scanner;

public class Mywork {

	public static void main(String[] args) {
		String Y_N="";
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Please enter your choice number 1/2/3/4 :");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("I am Rohit kumar");
				System.out.println("You are kishan kumar ");
				System.out.println("Do you want to enter another record? Yes/No:");
				Y_N=sc.nextLine();
				break;
			case 2:
				System.out.println("I am case two");
				System.out.println("You are in case two");
				break;
			case 3:
				System.out.println("I am case three");
				System.out.println("You are in case three");
				break;
			case 4:
				System.out.println("I am case four");
				System.out.println("You are in case four");
				break;

			default:
				System.out.println("Wrong choice you have to choose from 1/2/3/4 only :");
            
			}
			System.out.println("Do you want to enter another record? yes/no:");
			sc.nextLine();
			Y_N=sc.nextLine();

		}while(Y_N.equalsIgnoreCase("yes"));
		System.out.println("Good Bye !!!!!");
	}

}
