package programs;

public class StarPattern2 {

	public static void main(String[] args) {


//		int n = 5; // NO. of maximum stars
//		
//		for(int i = n;i >= 1; i--) {
//			
//			for(int j = n-1;j >= i; j--) {
//				
//				System.out.print(" ");
//			}
//			for(int k = 1; k <=i; k++) {
//				
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
	temp();	

	}
	
	public static void CenterTrangle(){
		int n = 5;
		
		for(int i = n;i >= 1; i--) {
			
			for(int j = n-1;j >= i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k = 1; k <=i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void temp() {
		int a = 5;
		for(int i = 0; i < a; i++) {
			
			System.out.println("*");
		}
		
	}
	
	}
