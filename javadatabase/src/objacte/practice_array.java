package objacte;

public class practice_array {

	public static void main(String[] args) {
		//StudentAges();
		// ProductPrices();
		// EmployeeSalary();
		// StudentMarks(); 
		//number();
		//swap();
//		number2();
		//num() ;
	}

	public static void StudentAges() {

		int[]age= {20,22,24,26,35};
		int rohit= age[2];
		int rahul=age[4];

		System.out.println("rohit ka age---"+rohit);
		System.out.println("rahul ka age----"+rahul);

	}
	public static void ProductPrices() {
		String[]Product= {"lux","dove","oil","petrol"};
		int[]price= {10,50,100,200};
		int Rate=price[2];
		System.out.println("Product Prices--"+Rate);

	}
	public static void EmployeeSalary() {
		int[]salary= {12000,15000,20000,30000,35000};
		int z=salary[0];
		int y=salary[2];
		System.out.println("Employee Salary--"+z);
		System.out.println("Employee Salary--"+y);

	}
	public static void StudentMarks() {

		int[]marks= {80,75,90,85,70};
		int a=marks[0];
		int b=marks[2];
		int total=a+b;
		System.out.println("Total marks--"+total);
		System.out.println("English marks is--"+a+"---Math marks is--"+b);

	}
	public static void number() {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}

		System.out.println(a[2]);
		//System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		String name[]=new String[5];
		name[0]="Mohit";
		name[1]="Rohit";
		name[2]="Mohan";
		name[3]="rohan";
		name[4]="Rahul";
		for(int i=0;i<=4;i++) {
			System.out.println(name[i]);
		}

		System.out.println(name[2]);
		//System.out.println(name[5]);//ArrayIndexOutOfBoundsException

		double c[]=new double[5];
		c[0]=40.9;
		c[1]=70.1;
		c[2]=100.2;
		c[3]=405.7;
		c[4]=460.6;

		for(int i2=0;i2<=4;i2++) {
			System.out.println(c[i2]);
		}

		System.out.println(c[3]);	
	}
	public static void swap() {
		int[]a=new int[10];
		a[0]=5;
		a[1]=10;
		a[2]=a[0];
		a[0]=a[1];
		a[1]=a[2];

		System.out.println("Before Swap:"+a[0]);
		System.out.println(a[1]);

		int[]b=new int[10];
		b[0]=80;
		b[1]=70;
		b[2]=90;
		b[3]=85;
		b[4]=75;
		System.out.println((b[0]+b[1]+b[2]+b[3]+b[4])/5);

		int[]c=new int[10];
		c[0]=20000;
		c[1]=25000;
		c[2]=30000;

		System.out.println(c[0]+c[1]+c[2]);

	}

	public static void number2() {
		int[]a= {46,57,69,36,98,36,56,37,37};
		int x=a[2];
		//System.out.println(x);
		for(int i=1;i<9;i++) {
			//System.out.println(a[i]);
		}
		String[]b= {"Rahul","mohit","mohan","ramesh","Ramu","kishan","Sohan"};
		String y=b[4];
		//System.out.println(y);
		for(int i=0;i<7;i++) {
		//System.out.println(b[i]);
		}
		
		int[]z= {123,43,356,28,83,57,39,38,27,29};
		int num=z[4];
		System.out.println(num);
		for(int i1=1;i1<101;i1++) {
			//System.out.println(i1);
		}
				
	}
	public static void num() {
		int a=10;
		for(int i=1;i<=a;i++) {
			System.out.println(i*2);
		
		}
	}
}