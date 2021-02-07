package programs;
import java.util.*;

public class GenRandomNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random num = new Random();
		
		System.out.println("Enter how many number you want to generate");
		int n = sc.nextInt();
		
		System.out.print("Enter you range 0 to ");
		int range = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(num.nextInt(range) + " ");
		}

	}

}
