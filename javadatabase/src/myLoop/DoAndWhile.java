
package myLoop;

import java.util.Scanner;

public class DoAndWhile {

	public static void main(String[] args) {
		String Y_N="";
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Please enter your name !!");
			String str=sc.nextLine();
			System.out.println("Please enter Your School name !!!");
			String name=sc.nextLine();
			System.out.println("Please enter your Roll No !!");
			String rollNo=sc.nextLine();
			System.out.println("Please enter your Class!!! ");
			String className=sc.nextLine();
			System.out.println("Hello  "   + str  +"   your School name is  "+name+"  and your Roll No "  +rollNo+ "\n"+
							   "  Welcome You are in  "+ className +"   class ;" );	
			System.out.println("Do you want to enter another record? Yes/No");
			Y_N=sc.nextLine();	
		}while(Y_N.equalsIgnoreCase("yes"));
			System.out.println("Good Byee !!!");
	}

}
