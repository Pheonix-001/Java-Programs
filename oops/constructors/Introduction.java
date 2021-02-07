package oops.constructors;

public class Introduction {
	
	int id;
	String name;
	
	Introduction(String z){
		
		System.out.println(z + " obj are created.");
	}
	
	
	Introduction(){
		System.out.println("My obj is created....");
	}
	
	void eat() {
		
//		name = s;
		System.out.println(name + " is eating.");
		
	}
	

	public static void main(String[] args) {

		
		Introduction obj1 = new Introduction();
		
		Introduction obj2 = new Introduction();
		
		Introduction obj3 = new Introduction("this");
		
		obj1.name = "jayant";
		obj2.name = obj1.name;
		
		obj1.eat();
		obj2.eat();
//		obj.name = "Jay";
		
	}

}
