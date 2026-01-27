package javadatabase;

public class CalculaterSalary {

	public static void main(String[] args) {
		Salary(2000);
		Salary(2000,500);

	}
	public static void Salary(int basicsal) {
		
		System.out.println(basicsal);
		
		
	}
	public static void Salary(int salary,int bonus) {
		int z=salary+bonus; 
		System.out.println(salary+ " and "+ bonus);
		System.out.println(z); 
	}
}
