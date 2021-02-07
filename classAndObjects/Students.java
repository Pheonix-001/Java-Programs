package classAndObjects;

class Students {
	
	int id;
	int roll_no;
	String name, stu_class, branch;
	
	
	
	public void run(String name) {
		System.out.println(name + " can run");
	}
	
	void eat() {
		System.out.println(name + "is eating");
	}
	
	void read() {
		System.out.println(name + "is reading");
	}
	
}