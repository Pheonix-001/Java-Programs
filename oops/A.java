package oops;

public class A extends B {
	
	public static void main(String[] s) {

	B obj1 = new B();
	B obj2 = new B();
	
	obj1.age = 20;
	obj1.name = "Jayant";
	obj1.address = "DLN";
	
	obj2.name = "Tom";
	
	obj1.address = "DLN";
	
	System.out.println(obj1.age);
	System.out.println(obj1.address);
	
	C obj3 = new C();
	obj1.read();
	obj2.play();
	obj3.teach();
	
	String n = " ";
	
	System.out.println(n);
	
	}
	

}
