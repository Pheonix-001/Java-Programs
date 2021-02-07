package Game;

public class Main extends TikTakToe {

	public static void main(String[] args) {

//		Checking Conditions for deciding Winner.....
		
		
		String[] ab = new String[2];
		
		if(ab[0] == ab[1]) {
			System.out.println(ab[0]);
		}
		else {
			System.out.println("jf");
		}
		
	}
	
	
	
	static void myMethod() {
		
		if((arry[0][0] == arry[0][1]) && (arry[0][1] == arry[0][2])) {		// 1
			System.out.println(arry[0][0] + " is winner..");
		}
		if((arry[1][0] == arry[1][1]) && (arry[1][1] == arry[1][2])) {		// 2
			System.out.println(arry[1][0] + " is winner..");
		}
		if((arry[2][0] == arry[2][1]) && (arry[2][1] == arry[2][2])) {		// 3
			System.out.println(arry[2][0] + " is winner..");
		}
		if((arry[0][0] == arry[1][0]) && (arry[1][0] == arry[2][0])) {		// 4
			System.out.println(arry[0][0] + " is winner..");
		}
		if((arry[0][1] == arry[1][1]) && (arry[1][1] == arry[2][1])) {		// 5
			System.out.println(arry[0][1] + " is winner..");
		}
		if((arry[0][2] == arry[1][2]) && (arry[1][2] == arry[2][2])) {		// 6
			System.out.println(arry[0][2] + " is winner..");
		}
		if((arry[0][0] == arry[1][1]) && (arry[1][1] == arry[2][2])) {		// 7
			System.out.println(arry[0][0] + " is winner..");
		}
		if((arry[0][2] == arry[1][1]) && (arry[1][1] == arry[2][0])) {		// 8
			System.out.println(arry[0][2] + " is winner..");
		}
		
		
	}
	

		
	
}

