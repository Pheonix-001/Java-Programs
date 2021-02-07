package oops.encapsulation;

public class Practics2 {

	private int age;
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public int getAge() {
		
		if(age > 55) {
			System.out.println("your age is " + age + " you are too old..");
		}
		
		else {
			System.out.println("Your age is " + age + " you are under criteria");
		}
		
		return age;
	}
	
	
}
