package lectures.Java_Operators_03_02;

public class Conditional_TernaryOperators {

	public static void main(String[] args) {
		// Basic Ternary Operators
//		int a=10;
//		int b=20;
//		int c = (a<b) ? a : b ;
//		System.out.println(c);
		
		
		// Nested Ternary Operator
		int a=100;
		int b=40;
		int c=30;
		int res = (a<b) ? (a<c? a :c) : (b<c? b:c) ;
		System.out.println(res);
		
	}

}
