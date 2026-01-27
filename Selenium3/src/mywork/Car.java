package mywork;

public class Car {

	String brandName;
	String colorName;

	public static void main(String[] args) {
		Car	obj=new Car();
		obj.brandName="Maruti";
		obj.colorName="White";
		System.out.println("brandName=="+obj.brandName+"===colorName=="+obj.colorName);

		Car	obj2=new Car();
		obj2.brandName="BMW";
		obj2.colorName="Black";
		System.out.println("brandName=="+obj2.brandName+"====colorName=="+obj2.colorName);
	}

}
