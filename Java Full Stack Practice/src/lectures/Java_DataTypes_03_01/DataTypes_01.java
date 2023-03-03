package lectures.Java_DataTypes_03_01;

public class DataTypes_01 {

	public static void main(String[] args) {
		// Size of Byte
		System.out.println("Size of Byte : " + Byte.SIZE);
		System.out.println("Min Value of Byte is : " + Byte.MIN_VALUE);
		System.out.println("Max Value of Byte is : " + Byte.MAX_VALUE);
		
		//size of Short
		System.out.println("Size of Short : " + Short.SIZE);
		System.out.println("Min Value of Short is : " + Short.MIN_VALUE);
		System.out.println("Max Value of Short is : " + Short.MAX_VALUE);
		
		//size of Integer
		System.out.println("Size of Integer : " + Integer.SIZE);
		System.out.println("Min Value of Integer is : " + Integer.MIN_VALUE);
		System.out.println("Max Value of Integer is : " + Integer.MAX_VALUE);
		
		//size of Long 
		System.out.println("Size of Long : " + Long.SIZE);
		System.out.println("Min Value of Long is : " + Long.MIN_VALUE);
		System.out.println("Max Value of Long is : " + Long.MAX_VALUE);
		
		//size of Float
		System.out.println("Size of Float : " + Float.SIZE);
		System.out.println("Min Value of Float is : " + Float.MIN_VALUE);
		System.out.println("Max Value of Float is : " + Float.MAX_VALUE);
		
		//size of Double
	    System.out.println("Size of Double : " + Double.SIZE);
		System.out.println("Min Value of Double is : " + Double.MIN_VALUE);
		System.out.println("Max Value of Double is : " + Double.MAX_VALUE);
		
		//size of Character
	    System.out.println("Size of Character : " + Character.SIZE);
		System.out.println("Min Value of Character is : " + Character.MIN_VALUE);
		System.out.println("Max Value of Character is : " + Character.MAX_VALUE);
		
		
		byte num = 10; //valid
		byte num1 = 27; //valid  max value
//		byte num2 = 129; //invalid  max value exceeds (C.E) incompatible type error--> integer can't be converted in byte
		
//		byte result = num + num1; //Unresolved compilation problem:Type mismatch: cannot convert from int to byte bcz ans is in int beacause trancation happend here
		   //Solution
		int result = num + num1; //Automatic type promotion to int --> byte * byte = int (expression).so, you have to store result in integer.
	          //or
		byte res= (byte) (num +num1); //Explicitly Type Casting to store in byte the result of expreyion
		System.out.println(result);
		System.out.println(res);

		
		
//		 long num3 = 12;//no problem it will treat as integer value by default and store it on long 
//		 long num4 = 12345677899000L; //it will give error so, bcz it excced we have 
		 
		
		
//		char letter = 'A'; // valid 
		 int letter = 'A'; //valid it gives ASCII value of A = 65
		System.out.println("The value of A is : " + letter);
		
		int letter1 = 'Z';
		System.out.println("The value of Z is : " + letter1);
		
		int letter2 = 'a';
		System.out.println("The value of a is : " + letter2);
		
		int letter3 = 'z';
		System.out.println("The value of z is : " + letter3);
	
		
		
		///Here Truncation or Round of zero : happen when int * int = (gives result only in) integer not float or any other data types
		
	   int a = 25;  //actually 25/2 = 12.5 but,
	   int b = 2;
	   int c= a/b;  //here we get 12
	   System.out.println(c);
	   float d = a/b; //here we get 12.0 why?
	   System.out.println(d);	
	   
	     //Solve 
	   float e = 25;  //actually 25/2 = 12.5 
	   float f = 2;
	   float g= e/f;  //here we get 12.5
	   System.out.println(g);
	   
	   double h = 0;  
	   double i = 2;
	   double j= h/i; 
	   System.out.println(j); //you get 0.0 ans
	   
	   double k = 0;  
	   double l = 0;
	   double m= k/l;  
	   System.out.println(m); //Result : NaN (not a number)
	   
	   char ab = 'A';  
	   char ba = 'B';
	   int ca= (ab + ba);  
	   System.out.println("char "+ ca);
	   char da =(char)(65); 
	   System.out.println("char " +da);	
	
	

	}

}
