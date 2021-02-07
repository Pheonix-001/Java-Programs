package programs;

public class VolumeOfSphare {

	public static void main(String[] args) {

		
		calculate(6);
	
	}

	
	
	static float calculate(float r) {
		
		float pi = 3.14159f; ;
		float result;
		result = (4/3f)  * pi * r * r * r;
		
		System.out.println("Volume of " + r + " radius is " + result);
		return result;
	}
}
