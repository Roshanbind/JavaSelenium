package java_Selenium2;

public class WeekdayWork {

	public static void main(String[] args) {
		/*
		 * Agar "Monday" aaya → Office system bolega "Weekday - Work Hard!".
		 *agar Monday nhi aayega to Office system bolega "Holiday - Relax!".
		 */
		String day="Monday";
		String day1="MONDAY";
		if(day.equalsIgnoreCase(day1)) {
			System.out.println(" weekday Work Hard");
		}else {
			System.out.println("Holiday Relax!");
		}
		day();
		Studentmarks();
	}
	public static void day() {
		String day="Monday";
		String day1="MONDAY";
		if(day.equals(day1)) {
			System.out.println(" weekday Work Hard");
		}else {
			System.out.println(" Holiday Relax!");
		}



	}
	public static void Studentmarks() {
		/*
		 * Agar marks 40 se jyada aaya hain → Student Pass message dalo
		nhi to ye message dalo 
		Warna → Student Fail
		 *
		 */
		int marks1=40;
		int marks2=30;
		if(marks1>marks2) {
			System.out.println(" Student----pass");
		}else {
			System.out.println(" Student---fail");
		}

	}

}
