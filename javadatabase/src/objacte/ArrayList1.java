package objacte;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayList1 {

	public static void main(String[] args) {
		Student();
		//product();
		//evenNumber();
		//fruits();
		//studentMarks();
		//salaries();
		//numbers();
		//batchNames();
		//cityNames();
		//StudentMarks();
		//number();
	}
	public static void Student() {
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("Mohit");
		arr.add("Rohit");
		arr.add("Rahul");
		arr.add("Ramu");
		arr.add("Mohan");

		for(int i=0;i<arr.size();i++) {
			arr.get(i);
		}
		System.out.println("collection of data in list--"+arr);

	}
	public static void product() {
		ArrayList<String>arrlist=new ArrayList<String>();
		arrlist.add("400.5");
		arrlist.add("600.3");
		arrlist.add("800.6");
		arrlist.add("1000.8");
		System.out.println("collection of data in list--"+arrlist);
		double	siz=arrlist.size();
		System.out.println("size of list----"+siz);

	}
	public static void evenNumber() {
		ArrayList<String>arrelist=new ArrayList<String>();
		arrelist.add("2");
		arrelist.add("4");
		arrelist.add("6");
		arrelist.add("8");
		arrelist.add("10");
		arrelist.add("12");
		arrelist.add("14");
		arrelist.add("16");
		arrelist.add("18");
		arrelist.add("20");
		//System.out.println("collection of even list number"+arre);
		for(int i=0;i<arrelist.size();i++) {
			arrelist.get(i);
		}
		System.out.println("collection of even list number--"+arrelist);
	}
	public static void fruits() {
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add(0,"apples");
		fruits.add(1,"mango");
		fruits.add(2,"banana");
		fruits.add(3,"Grapes");
		if(fruits.contains("mango")) {
			System.out.println("mango is present");
		}else {
			System.out.println("mango is not present");
		}
	}
	public static void studentMarks() {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(60);
		marks.add(75);
		marks.add(95);
		marks.add(90);
		int	number=marks.get(0);
		for(int i=0;i<marks.size();i++) {
			if(marks.get(i)>number) {
				number=marks.get(i);
			}
		}
		System.out.println(" highest marks---"+number);

	}
	public static void salaries() {
		ArrayList<Integer>salari=new ArrayList<Integer>();
		salari.add(20000);
		salari.add(40000);
		salari.add(60000);
		salari.add(80000);
		System.out.println("Actula salary---"+salari);
		salari.set(0, 23000);
		salari.set(1, 45000);
		salari.set(2, 65000);
		salari.set(3, 82000);
		System.out.println("updated list---"+salari);
	}
	public static void numbers() {
		ArrayList<Integer>number=new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		System.out.println("Original ArrayList---"+number);
		//System.out.println("Numbers in reverse order:");
		for (int i = number.size() - 1; i >= 0; i--) {
			number.get(i);    
		}
		System.out.println("Numbers in reverse order---"+number);
	}
	public static void batchNames() {
		ArrayList<String>morningBatch=new ArrayList<String>();
		morningBatch.add("Rohit");
		morningBatch.add("mohit");
		morningBatch.add("rahul");
		morningBatch.add("ramesh");
		morningBatch.add("kishan");


		ArrayList<String>eveningBatch=new ArrayList<String>();
		eveningBatch.add("Vikash kuamr");
		eveningBatch.add("Ravi Gupta");
		eveningBatch.add("Neha Yadav");
		eveningBatch.add("Amit Verma");
		eveningBatch.add("Ramu Verma");

		ArrayList<String> allBatches = new ArrayList<>();
		allBatches.addAll(allBatches);
		allBatches.addAll(eveningBatch);
		System.out.println("allbatch Names----"+allBatches);

	}
	public static void cityNames() {
		ArrayList<String> city = new ArrayList<>();
		city.add("Bhadohi");
		city.add("jaunpur");
		city.add("mirzapur");
		city.add("varanasi");
		System.out.println("collection of data in list--"+city);
		String	num=city.remove(2);
		System.out.println("remove of list--"+num);
		System.out.println(city);
		
	}
	public static void StudentMarks() {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(75);
		marks.add(60);
		marks.add(90);
		marks.add(85);
		marks.add(80);
		System.out.println("collection of marks in list--"+marks);
		Collections.sort(marks);
		System.out.println("ascending order--"+marks);
		

	}
	public static void number() {
		for(int i=1;i<=100;i++){
			System.out.println(i+"-------Mohit kumar---"+i);
			
		}
	}
}
