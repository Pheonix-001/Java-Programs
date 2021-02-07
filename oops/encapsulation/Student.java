package oops.encapsulation;

public class Student {
	

		int age;
		String name = "jf";
		String address;
			
	void run(String n) {
		
		name = n;
		System.out.println(name + " can run");		
	}

	public static void main(String[] s) {
		
	Student obj = new Student();
	Student obj2 = new Stu2();
		
		System.out.println(obj);
		
		obj2.run("jayant");
		obj.run("jayant");
	}
	}
	
	class Stu2 extends Student{
		
		String name;
		
		void run(String s) {
			
			name = s;
			
			System.out.println(name + " can not run");
		}
		
	}