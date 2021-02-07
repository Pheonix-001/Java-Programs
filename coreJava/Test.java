package coreJava;

import java.util.*;
public class Test extends temp{
	
	static int a ;
	Test(){
		a = 4;
	}
	

	


	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		StringFun();
		
//		System.out.println("jayant");
//		
//		new Test().run();
//		System.out.println(Test.a);
		
		
		
//		String s1 = "jayant";
//		String s2 = new String();
//		s2 = "Jayant";
//		
//		System.out.println(s1.equals(s2));
//		
//		System.out.println(s1 == s2);
		
//		Scanner sc = new Scanner(System.in);
//		char[] c = new char[5];
//		
//		for(int i = 0; i < c.length; i++) {
//			
//			c[i] = sc.next().charAt(0);
//			
//		}
//		
//		for(char c2 : c) {
//			System.out.println(c2);
//		}
//		int i = 11;
//		try {
//			if(i < 10) {
//				System.out.println(i);
//			}
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
		
		
		
		
	}
	
	static void StringFun() {
		
		String n1 = "jayant";
		String n2 = new String("JAYANT");
		
		System.out.println(n1 + " " + n2);
		
		System.out.println(n1.toUpperCase());
		System.out.println(n1.charAt(3));
		
		System.out.println(n1.concat(n2));
		System.out.println(n1.indexOf('a'));
	}
	
	static void Array() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
	}
}


class temp{
	
	protected final void run() {
		System.out.println("running......");
}
}
