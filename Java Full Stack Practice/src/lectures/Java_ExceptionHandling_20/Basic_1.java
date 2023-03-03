package lectures.Java_ExceptionHandling_20;
import java.util.Scanner;

/*Basic program--> here does'nt have any exception handler provided by programme
here Exception is taking care of by Default Exception Handler in Runtime.*/
public class Basic_1 {

	public static void main(String[] args) {
		System.out.println("Connection to Calc app is established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		System.out.println("Connection is terminated");
		
		/*Output
		 * =======
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * lectures.Java_ExceptionHandling_20.Basic_1.main(Basic_1.java:15)
		 */

	}

}
