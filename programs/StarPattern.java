package programs;

public class StarPattern {

	public static void main(String[] args) {

		for(int i = 3; i >0; i--) {
			
			for(int j = 4; j > i; j--) {
			
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Enter");
		
		for(int i = 3; i > 0; i--) {
			
			for(int j = 0; j < i; j++) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 3; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	

	}

}
