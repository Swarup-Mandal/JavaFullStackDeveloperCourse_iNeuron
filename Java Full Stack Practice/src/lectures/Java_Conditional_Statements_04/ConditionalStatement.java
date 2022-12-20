package lectures.Java_Conditional_Statements_04;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		if(a>b) {                          //condition 1
			System.out.println(a+b);
		}
		else if (a==b) {                   //condition 2
			System.out.println(a-b);
		}
		else {
			System.out.println("A is lesser");
		}

	}

}
