package lectures.Java_StaticKeyword_12;

import java.util.Scanner;

class Loan{
	private float pa;
	private float td;
	private float si;
	private static float r;
	
	static {  //here only onece the variable will assigne at time of class loading.
		r=2.5f;
	}
	void input () {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please input the Principle Amount : ");
		pa = sc.nextFloat();
		System.out.println("Enter the the Time Duration of Loan : ");
		td = sc.nextFloat();
		//r = 2.5f; //here,rate of interest is fixed.but every object creation a new memory is generated for r. htis why we can use it as static
	}
	
	void siCalculation() {
		si = (pa * td * r)/100;
	}
	
	void givingSi() {
		System.out.println("The Total interest is on your principle : " +pa + " and Time Duration: " +td + " is :  " +si);
	}
}
public class LoanApplication {

	public static void main(String[] args) {
		
		Loan ln = new Loan(); //object 1
		ln.input();
		ln.siCalculation();
		ln.givingSi();
		
		Loan ln2 = new Loan(); //object 2
		ln2.input();
		ln2.siCalculation();
		ln2.givingSi();


	}

}
