package oops.encapsulation;

public class Temp {

	public static void main(String[] s) {
		
		None obj = new None();
		
				
		obj.setAge(15);
		
		obj.getAge();
		
	}
	
	
}

class None{
	
	private int age;
	private String name;

	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
		if(age > 20) {
			System.out.println("You cann't vote....");
		}
		else {
			System.out.println("You can vote.....");	
		}
	}
	
	
	
}
