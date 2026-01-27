package objacte;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		//arraylist();
		remove();
		ArrayList<String>arlist=new ArrayList<String>();
		arlist.add("kishan");
		arlist.add("rohan");
		arlist.add("java");
		arlist.add("ram");
		arlist.add("mohan");

		//	int	num=arlist.size();
		//	System.out.println(num);
		//		
		//		for(int i=0;i<5;i++) {
		//			String	name=arlist.get(i);
		//			System.out.println(name);
		//		}

	}
	public static void arraylist() {

		ArrayList<String>list=new ArrayList<String>();
		list.add("mohit");
		list.add("rohit");
		list.add("mohan");
		list.add("mahesh");
		list.add("ramesh");
		list.add("kishan");
		list.add("rahul");
		list.add("ramu");
		list.add("sohan");
		list.add("rohan");

		System.out.println(list);

		int	size=list.size();
		System.out.println("size of list----"+size);

		//String	name=list.get(10);//IndexOutOfBoundsException
		String	name1=list.get(6);
		System.out.println(name1);


	}
	public static void remove() {
		ArrayList<String>list=new ArrayList<String>();
		list.add("vikash");
		list.add("ram");
		list.add("mohan");
		list.add("mohit");
		list.add("ramu");
		
		
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
		System.out.println("collection of data in list--"+list);
		String	num=list.remove(3);
		System.out.println("remove of list----"+list);
		//System.out.println(list);
		String	list2=list.get(3); 
		System.out.println("size of list----"+list2);
		
		



	}

}
