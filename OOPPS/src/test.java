import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		int num=sc.nextInt();
		//System.out.println(num*10);
		Math mt=null;
		if(num>100) {
			mt=new Calculator();
		}else {
			mt=new Computer();
		}

	}

}
