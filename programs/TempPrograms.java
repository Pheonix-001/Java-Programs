package programs;

import java.util.Scanner;

public class TempPrograms {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		Factorial();
		
//		Prime();
		
//		MaxAndMin();
		
//		SumOfDigit();
		
//		TopTwoMaxNum();
		
		PerfectNum(36);
	}
	
//	To find factorial of any number....
	static void Factorial() {
		
		int num = sc.nextInt();
		int result = 1;
		for(int i = 0; i < num; i++) {
			
			result *= num - i;
		}
		System.out.println("Factorial of " + num + " is "+result);	
	}
	
	
//	A Program to check given number is Prime number or not......	
	static void Prime() {
		
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count == 2 ) {
			System.out.println(num + " is a Prime number...");
		}
		else {
			System.out.println(num + " is not a Prime Number..............");
		}
	}
	
	
//	A Program to find greater number ...
	
	static void MaxAndMin() {
		
		System.out.println("How many number you want to enter:-");
		int l = sc.nextInt();
		System.out.println("Enter your numbers:--");
		int[] num = new int[l];		//  {12 21 14 41 5}
//		System.out.println(num.length);
		
		
		for(int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt();
		}
		
		int maxNum = num[0];
		int minNum = num[0];
		
		System.out.println(maxNum + " " + minNum);
		
		for(int i = 1; i < num.length; i++) {
			
			if(num[i] > maxNum) {
				
				maxNum = num[i];
			}
			else if(num[i] < minNum) {
				
				minNum = num[i];
			}
		}
		
		System.out.println("Largest number is " + maxNum);
		System.out.println("Smallest number is " + minNum);
	}
	
	
//	A Program to find Sum of Given Digit...
	
	static void SumOfDigit() {
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num != 0) {
			
			sum += num % 10;
			num = num / 10;		
		}
		System.out.println("Sum of every digit is " + sum);
	}
	
	
//	A Program to find top two max number
	static void TopTwoMaxNum() {
		
		System.out.println("How many number you want Enter:-");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " numbers:-");
		int[] num = new int[n];
		
		for(int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt();
		}
		
		int largestNum1 = num[0];
		int largestNum2 = num[0];
		
		for(int i = 1; i < num.length; i++) {
			
			if(num[i] > largestNum1) {
				
				largestNum1 = num[i];
			}
			else if(largestNum1 > num[i] & largestNum2 > num[i]) {
				
				
				
			}	
		}
		
		System.out.println("Largest number is " + largestNum1);
	}
	
	
	
//	A Program to check a number is perfect square or not..
	static void PerfectNum(int num) {
		
//		System.out.println("Enter a number:-");
//		num = sc.nextInt();
		
		int sqrt = (int)Math.sqrt(num);
		
		if(sqrt * sqrt == num) {
			System.out.println(num + " is a perfect square number.");
		}
		else{
			System.out.println(num + " is not a perfect square number.");
		}
		System.out.println("square root of " + num + " is " + sqrt);
	}

	
//	A Program to Construct Floyd Triangle..
	static void FloydTringle(int num) {
		
		
	}
	
	
}