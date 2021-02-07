package classAndObjects;

public class Test {
	
	void myMethod() {
		System.out.println("In a Test's class Method");
	}

}

class SubTest extends Test{
	
	void myMethod() {
		System.out.println("In a SubTest's class Method");
	}
}

class checkMethod{
	
	public static void main(String[] args) {
		
		Test t1 = new SubTest();
		SubTest t2 = new SubTest();
		
		t1.myMethod();
		t2.myMethod();
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
