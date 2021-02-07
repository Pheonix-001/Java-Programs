package programs;

public class ArmstrongInThousands {

	public static void main(String[] args) {
		
		for(int i = 1; i < 1000; i++) {
		
		int n = i;
		int sum,result = 0;
		while(n != 0) {
			
			sum = n % 10;
			result += sum * sum * sum;
			n /= 10;
			
			}
		
		
		if(result == i)
			System.out.println(i + " " + result);
		else
			continue;
		}

	}

}
