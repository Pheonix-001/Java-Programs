package Game;
import java.util.*;
public class TikTakToe {
	
	static String[][] arry = new String[3][3];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your symbol");
//		
//		int i = 3,j = 3;
//		int[][] arry = new int[i][j];
//		
//		for(i = 0; i < arry.length; i++) {
//			
//			for(j = 0; j < arry.length; j++) {
//				
//				arry[i][j] = in.nextInt();
//			}
//		}
//		
//		for(i = 0; i < arry.length; i++) {
//			
//			for(j = 0; j < arry.length; j++){
//				
//				System.out.print(arry[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		PrintStrct();
//		UserInpt();
		
//		Main obj = new Main();
		
//		obj.myMethod();
		
	}
	
	
	static void PrintStrct() {		
		
		Main obj1 = new Main();
		
		
//		To Print a blank Structure......
		
		
		for(int i = 0; i < arry.length; i++) {
		
			for(int j = 0; j < arry.length; j++) {
			
				arry[i][j] = "";	
			}
		}
		
		for(int i = 0; i < arry.length; i++) {
			
			for(int j = 0; j < arry.length; j++) {
					
				if(arry[i][j] == "") {
					
					arry[i][j] = "__";	
					}
				
				System.out.print(arry[i][j] + " ");
				}
			
			System.out.println();
			}
		System.out.println();
		
//			To print index......
		
		int k = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.print(k++ + "  ");
			}
			System.out.println();
		}
		
		
		
//////  getting input from user to update value of array....
		
			String l = "";
			
		for(int i = 1; i < 10; i++) {
			
			if(i % 2 == 1) {
				System.out.println("Enter place location for X ");
				l = "X";
			}
			else {
				System.out.println("Enter place location for O ");
				l = "O";
			}
			
//			System.out.println("Enter place of your symbol");
			
			int[] p = new int[9];
			p[i] = sc.nextInt();
			int n = p[i];
			
			switch(n) {
			case 1:
				arry[0][0] = l;
				break;
			case 2:
				arry[0][1] = l;
				break;
			case 3:
				arry[0][2] = l;
				break;
			case 4:
				arry[1][0] = l;
				break;
			case 5:
				arry[1][1] = l;
				break;
			case 6:
				arry[1][2] = l;
				break;
			case 7:
				arry[2][0] = l;
				break;
			case 8:
				arry[2][1] = l;
				break;
			case 9:
				arry[2][2] = l;
				break;
			
			}
			
			if(i > 5 ) {
				
				obj1.myMethod();
			}
			
//		To Print array after each input.....
			
			for(int a = 0; a < arry.length; a++) {
				for(int b = 0; b < arry.length; b++) {
					
					System.out.print(arry[a][b] + "  ");
				}
				System.out.println("\n");
			}
			
		}
		
			
//			Showing result array after all input....
		
		System.out.println("All inputs are done Resultant Structure is :-- \n");
		
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(arry[i][j] + "  ");
				}
				System.out.println("\n");
			}
			
		}
	
	
	static void UserInpt() {		//	Taking Input from User....
		
		
		for(int i = 0; i < 18; i++) {
			
		int in = sc.nextInt();
		
		switch(in) {
		case 1:
			arry[0][0] = sc.nextLine();
			break;
		case 2:
			arry[0][1] = sc.nextLine();
			break;
		case 3:
			arry[0][2] = sc.nextLine();
			break;
		case 4:
			arry[1][0] = sc.nextLine();
			break;
		case 5:
			arry[1][1] = sc.nextLine();
			break;
		case 6:
			arry[1][2] = sc.nextLine();
			break;
		case 7:
			arry[2][0] = sc.nextLine();
			break;
		case 8:
			arry[2][1] = sc.nextLine();
			break;
		case 9:
			arry[2][2] = sc.nextLine();
			break;
			
		}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arry[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	static {
				System.out.println("\nDeveloped By Mr.Jayant ");
	}
}

