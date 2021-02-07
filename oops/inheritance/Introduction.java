package oops.inheritance;

public class Introduction {

	static Teacher t = new Teacher();
	
	
	public static void main(String[] s) {
		
		t.teach();
	}
}

class Person{
	
	
}

class Teacher extends Person{
	
	protected static void teach() {
	System.out.println("Teacher is teaching.. ");
	}
	
}

class Singer extends Person{

	void sing() {
	System.out.println("Singer is singing...");
	}
}