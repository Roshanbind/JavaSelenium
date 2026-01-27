package homework;

public class Calculater {

    static void calculate(int a) {
        System.out.println("int data type called: " + a);
    }

    static void calculate(Integer a) {
        System.out.println("Integer type called: " + a);
    }
	
	public static void main(String[] args) {
		calculate(10);
		calculate(10);

	}

}
