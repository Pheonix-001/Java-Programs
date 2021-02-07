package programs;
import java.util.*;

public class mergeTwoArrays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of element for first array");
		int i = sc.nextInt();
		
		int[] arry1 = new int[i];
		
		
		System.out.println("Enter " + i +" elements");
		for(int x = 0; x < arry1.length; x++) {
			
		arry1[x] = sc.nextInt();
		}
		
		System.out.println("Enter no. of element for second array");
		int j = sc.nextInt();
		
		System.out.println("Enter any " + j + " elements");
		int[] arry2 = new int[j];
		for(int y = 0; y < arry2.length; y++) {
			
			arry2[y] = sc.nextInt();
		}
		
		int[] result = new int[arry1.length + arry2.length];
		for(int x = 0; x < arry1.length; x++) {
			
			result[x] = arry1[x];
		}
		
		for(int y = 0; y < arry2.length; y++) {
			
			result[y + arry1.length] = arry2[y];
		}
		
		
		
		for(int a = 0; a < result.length; a++) {
			
			System.out.print(result[a]+" ");
		}
		
	}

}
