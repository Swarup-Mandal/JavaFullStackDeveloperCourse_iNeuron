package lectures.Java_Operators_03;

public class AssignmentOperators {
	public static void main(String[] args) {
		
		//1> Single Assignment Operator
		int p;
		p = 10;
		System.out.println("Single Assignment Operator");
		System.out.println(p);
		
		//2> Chained Assignment Operator
		
		int a,b,c,d;
		a=b=c=d=10;
		System.out.println("Chained Assignment Operator");
		System.out.println(a + " " + b + " " + c + " " + d);
	
		
		//Compound Assignment
		System.out.println("Assignment Operators");
		int t =20;
		t += 40;
		System.out.println(t);
		t -= 10;
		System.out.println(t);
		t *= 10;
		System.out.println(t);
		t /= 10;
		System.out.println(t);
		t %= 10;
		System.out.println(t);

	}

}
