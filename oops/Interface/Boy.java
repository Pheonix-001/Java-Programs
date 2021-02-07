package oops.Interface;

public class Boy implements Student, Singer{
	
	public static void main(String[] s) {
	
		Boy aman = new Boy();
		
		aman.sing();
		
	}

	@Override
	public void sing() {
		System.out.println("Person is singing");
		
	}

	@Override
	public void read() {
		System.out.println("Person is reading");
		
	}

}