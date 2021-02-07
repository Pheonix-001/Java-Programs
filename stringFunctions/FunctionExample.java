package stringFunctions;

public class FunctionExample {

	public static void main(String[] args) {
		
		String s = "I Love Java";
		
//		To find length 
		System.out.println("String \"" + s +"\" contains " + s.length()+ " character.");
		
//		To Lower Case
		System.out.println("String \"" + s + "\" in Lower Case:- " + s.toLowerCase());
		
//		To Upper Case
		System.out.println("String \"" + s + "\" in Upper Case:- " + s.toUpperCase());
		
//		To find character using index number.
		System.out.println("String \"" + s + "\" contains " + s.charAt(5) + " on 5th index number");
		
//		To find a continuous part after any index number
		System.out.println("String \"" + s + "\" contains ");
	}
}
