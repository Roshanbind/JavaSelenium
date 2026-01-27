package javadatabase;

public class Array2 {

	public static void main(String[] args) {
		b();

	}
	public static void b() {
		String a[]=new String[6];
		a[0]="grape";
		a[1]="strawberry";
		a[2]="papaya";
		a[3]="cocnut";
		a[4]="date";
		a[5]="banana";
		
		System.out.println(a[4]);
		String b[]=new String[6];
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		b[4]=a[4];
		b[5]=a[5];
		
		System.out.println(b[3]);
	
	
	}
}
