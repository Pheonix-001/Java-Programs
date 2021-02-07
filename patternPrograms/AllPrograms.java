package patternPrograms;

public class AllPrograms {

	public static void main(String[] args) {
		
//		p1();
		p2();

	}
	
	static void p1() {
		
		for(int i = 0; i < 4; i++) {	
			for(char c = 'A'; c < 'E'; c++) {
				
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
	static void p2() {
		
		for(int i = 0; i < 5; i++) {
			
				for(int j = 4; j < i; j++) {
					
					System.out.print(" ");
				}
				
				for(int j = 3; j > 0; j--) {
					
					System.out.print("*");
				}
				
					for(int j = 0; j < 2; j++) {
					
					System.out.print(" ");
				}
			
			System.out.println();
		}
		
		
	}

}
