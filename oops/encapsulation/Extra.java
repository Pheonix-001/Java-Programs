package oops.encapsulation;

public class Extra {

	private int age;
	private String name;
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
		if(age > 20) {
			System.out.println("You age to old.");
		}
		else {
		System.out.println("You can enter in our school.");
		}
	}
}