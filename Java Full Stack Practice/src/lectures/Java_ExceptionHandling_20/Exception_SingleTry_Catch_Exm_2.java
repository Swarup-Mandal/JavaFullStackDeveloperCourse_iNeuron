package lectures.Java_ExceptionHandling_20;
import java.util.Scanner;
//single try & catch block
public class Exception_SingleTry_Catch_Exm_2 
{

	public static void main(String[] args) 
	{
		System.out.println("Connection to Calc app is established");
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first num to divide");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd num to divide");
		int num2=scan.nextInt();
		
		 int res=num1/num2;
		
		System.out.println("The res is "+ res);
		}
		catch(Exception e)  //it is an inbuilt parent class of all inbuilt Exception Class
		{
			System.out.println("You're trying to divide by zero illogical");
		}
		System.out.println("Connection is terminated");
		
		

	}

}
