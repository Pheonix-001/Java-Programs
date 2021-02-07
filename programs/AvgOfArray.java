package programs;
import java.util.*;

public class AvgOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int[] arry = new int[n];
		float avgarry = 0;
		
		System.out.println("Enter arrays elements");
		for(int i = 0; i < arry.length; i++) {
			
			arry[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arry.length; i++) {
			
			avgarry += (float)arry[i];
		}
		
		avgarry = avgarry/(float)arry.length;
		
		System.out.println("Average is " + avgarry);
		
	}
}
