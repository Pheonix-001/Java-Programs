package oops.polymorphism;

public class cat1 {
	
	public void Sound() {
		System.out.println("meow");
	}

}

class cat2 extends cat1{
	
	public void Sound() {
		
		System.out.println("Roar");
	}
	
}

class Test{
	
	public static void main(String[] arg) {
		
		cat1 c1 = new cat1();
		cat2 c2 = new cat2();
		
		c1.Sound();
		c2.Sound();
	}
}
