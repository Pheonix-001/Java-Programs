package programs;
import java.util.*;
public class NumToWord {

	public static void main(String[] args) {
		Scanner sac = new Scanner(System.in);
		int num = sac.nextInt();
		int n = 0;
		String place = "";
		int i = 0;
		
		
		while(num != 0) {
			
			n = num % 10;
			num /= 10;
		switch(i) {
		case 0:
			place = "Once";
			break;
		case 1:
			place = "Tense";
			break;
		case 2:
			place = "Hundred";
			break;
		case 3:
			place = "Thousands";
			break;
		case 4:
			place = "Ten Thousands";
		}
			i++;
			
			System.out.print(n + " " + place + " ");
		}

	}

}

//123
//1 hudred 2 tens 3 once 