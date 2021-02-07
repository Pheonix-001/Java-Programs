package programs;
import java.util.*;

class DigitToWord {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int result = 0;
		String name = "";
		
		while(a != 0) {
			
			result = result * 0;
			result = result + a % 10;
			a /= 10;
		}
		System.out.println(result);
		
		System.out.println("sysout is running");
		
		
	}
	
	
}