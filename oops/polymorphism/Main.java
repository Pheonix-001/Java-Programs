package oops.polymorphism;

public class Main {
	
	public static void main(String[] s) {
		
//		Dog d = new Dog();
//		
//		Pet p = d;			// upCasting...?
//		Animal a = d;		// implicitCasting.....?
//		
//		
//		//	Run Time Polymorphism
//		
//		d.run();
//		p.run();
		
		greet("Good Morning" , 5);
		
	}
	
	static void greet() {
		System.out.println("hello");
	}
	
	static void greet(String s) {
		System.out.println(s);
	}
	
	static void greet(String s, int i) {
		
		for(int a = 0; a < i; a++){
			System.out.println(s);
		}
	}

}
