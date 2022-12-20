package lectures.Java_Conditional_Statements_04;

public class NastedConditionalStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//example 1
		int a = 9;
		int b = 10;
		if(a>b) {
			if (a==10) {
				System.out.println(a+b);
			}
			else {
				System.out.println("A is gretaer but not equal to");
			}
		}
		else if (a==b) {
			System.out.println(a-b);
		}
		else {
			System.out.println("A is lesser");
		}
		
		 //Example 2 (Least Count)
		int c=10;
		int d=20;
		int e=5;
		
		if (c<d) {
			if (c<e) {
				System.out.println("C is the least " + c);
			}
			else {
				System.out.println("E is the least" + e);
			}
		}
		else if(d<e) {
			System.out.println("D is the least " + d);
		
		}
		else {
			System.out.println("E is the least " +e);
			
		}
		
		 //By logical operators (And &&) same Least Count
		
		int f=40;
		int g=35;
		int h=30;
		
		if (f<g && f<h) {
				System.out.println("F is the least " + f);
		}
		else if(g<h) {
			System.out.println("G is the least " + g);
		
		}
		else {
			System.out.println("H is the least " +h);
			
		}
		
		//By logical operators ( Or || )
		
		int i=10;
		int j=20;
		int k=30;
		
		if (i<j || i<k) {
				System.out.println("I is the least " + i);
		}
		else if(j<k) {
			System.out.println("J is the least " + j);
		
		}
		else {
			System.out.println("K is the least " +k);
			
		}
		
		//By logical operators (And && ) making all false
		int r=40;
		int s=35;
		int t=30;
		
		if (r<s && r==s) {
				System.out.println("R is the least " + r);
		}
		else if(s<t && s==r) {
			System.out.println("S is the least " + s);
		
		}
		else if(t<r && t==r) {
			System.out.println("last else-if block ");
		
		}
		else {
			System.out.println("last block");
			
		}
		
		
		//Conditional Operators or Ternary Operator
		
		int u=10;
		int v=20;
		int w = (u<v) ? u : v ;
		System.out.println(w);

	}

}
