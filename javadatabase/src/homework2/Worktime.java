package homework2;

public class Worktime {

	public static void main(String[] args) {
		int totalHours=Worktime.employeeWork();
		System.out.println("Employee worked in  hours  "+totalHours);
	}
	public static int employeeWork() {
		
		int workMorning=4;
		int workEvening=5;
		int allwork=workMorning+workEvening;
		return allwork;
		
		
	}
}
