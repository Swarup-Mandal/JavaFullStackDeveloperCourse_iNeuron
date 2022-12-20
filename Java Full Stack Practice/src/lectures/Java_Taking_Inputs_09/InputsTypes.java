package lectures.Java_Taking_Inputs_09;
import java.math.BigDecimal;
import java.math.BigInteger;  //ti use BigInteger();
import java.util.Scanner;   //first inport the package where Scanner class present

public class InputsTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //creating object of Scanner class's
		
		System.out.println("Enter Integer value : "); //nextInt();
		int in =  scan.nextInt();
		System.out.println("After taking input printing it : " + in);
		
		System.out.println("Enter floating value : ");  //nextFloat();
		float flo =  scan.nextFloat();//implicite Type Convertion : we can store int in float input taking process
		System.out.println("After taking input printing it : " + flo);
		
		System.out.println("Enter Integer in floating input area : "); //float nextFloat();
		float floin = scan.nextInt();  
		System.out.println("Printing inter in float input takin process : " + floin);
		
		System.out.println("Enter String value without space: ");  //String next();
		String str =  scan.next();
		System.out.println("After taking input printing it : " + str);
		
		System.out.println("Enter String value with space: ");  //nextLine();
		String str1 =  scan.nextLine();
		System.out.println("After taking input printing it : " + str1);
		
		System.out.println("Enter double value : ");  //nextDouble();
		double dou =  scan.nextDouble();
		System.out.println("After taking input printing it : " + dou);
		
		System.out.println("Enter Long value : ");   //nextLong();
		long lon =  scan.nextLong();
		System.out.println("After taking input printing it : " + lon);
		
		System.out.println("Enter Byte value : ");  //nextByte();
		byte byt =  scan.nextByte();
		System.out.println("After taking input printing it : " + byt);
		
		System.out.println("Enter Boolean value : ");  //nextBoolean();
		boolean bool =  scan.nextBoolean();
		System.out.println("After taking input printing it : " + bool);
		
		System.out.println("Enter BigInteger value : ");   //nextBigInteger();
		BigInteger bi =  scan.nextBigInteger();  //to use BigInteger(); we have to import java.math.BigInteger
		System.out.println("After taking input printing it : " + bi);
		
		System.out.println("Enter Big Decimal value : ");   //nextBigDecimal();
		BigDecimal bd =  scan.nextBigDecimal();  //to use nextBigDecimal(); we have to import java.math.nextBigDecimal;
		System.out.println("After taking input printing it : " + bd);

		
		

		
	}

}
