package lectures.Java_Introduction_01;

public class TypeCasting_04 {

	public static void main(String[] args) {
		//Type Casting 
		 
	      //1.Implicit Type Casting
	   
	   int n = 23;
	   char p = 'C';
	   float q = 2.88f;
	   n = n + p; //implicit type casting happen by compiler char(ASCII Value) to int
	   System.out.println("Implicit conversion from character to integer : " + n);
	   q = q + n;//implicit type casting happen by compiler int to float
	   System.out.println("Implicit conversion from integer to float : "+ q);
	   
	       //2.Explicit Type Casting
	   
	   float r = 5.55f;
	   int s = (int)r + 1; //Explicit Type Casting
	   System.out.println(s);
	   
	
	}

}
