package programs;

public class StarTrangle {

	public static void main(String[] args) {

		
		int a = 1;

		for(int i = 0; i < 5; i++) {
			
			for(int j = i-1;j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < a; k++) {
				
				System.out.print("*");
			}
			a++;
			System.out.println();
			
		}
		
		

	}

}
