package myhomeWork;

public class Classf {
	int x=10;
}
class B{
	Classf f=new Classf();
	void show() {

		System.out.println(f.x);
	}
}
class C{
	public static void main(String[] args) {
		B b =		new B();
		b.show();

	}
}


