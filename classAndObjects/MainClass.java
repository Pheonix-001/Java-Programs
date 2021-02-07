package classAndObjects;

public class MainClass {
	
	public static void main(String[] args) {
		
		Students stu1 = new Students();
		
		
		stu1.run("aman");
		
		teacher t1 = new teacher();
	
		t1.name = "Ram";
		
		t1.teach("Ramesh");
		
		t1.eat();
	}
	
	

}



class teacher {
	
	int id,mobile_no;
	String name, address;
	
	public void teach(String name) {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
}
