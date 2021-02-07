package programs;

public class SumOfDigits {
	

	public static void main(String[] args) {
		
		int num = 545;
		int sum = 0;
		
		while(num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		
		System.out.println(sum);
		
		System.out.println(sum(444));
		

	}
	
	static int sum(int a) {
		int sum = 0;
		
		while(a != 0) {
			
		sum += a % 10;
		a = a / 10;
		
		}
		
		return sum;
		
	}
	
	
	static int armstrong(int a) {
		
		int sum = 0,mul;
		
		while(a != 0) {
			sum += a % 10;
			
		}
		return sum;
	}

}
