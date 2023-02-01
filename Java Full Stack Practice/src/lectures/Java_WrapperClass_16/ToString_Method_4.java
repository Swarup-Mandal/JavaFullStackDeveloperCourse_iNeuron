package lectures.Java_WrapperClass_16;

/*toString()
=========
To convert the Wrapper Object or primitive to String.
Every Wrapper class contain toString()
form1
=====
  public String toString()
1. Every wrapper class (including Character class) contains the above toString()
method to convert wrapper object to String.
2. It is the overriding version of Object class toString() method.
3. Whenever we are trying to print wrapper object reference internally this
toString() method only executed*/

/*form2
=====
  public static String toString(primitivetype)
1. Every wrapper class contains a static toString() method to convert primitive to
String.*/

/*form3
=====
Integer and Long classes contains the following static toString() method to convert
the primitive to specified radix String form.
     public static String toString(primitive p,int radix)
                                                  |=> 2 to 36
 */

/*form4
=====
Integer and Long classes contains the following toXxxString() methods.
public static String toBinaryString(primitive p);
public static String toOctalString(primitive p);
public static String toHexString(primitive p);*/

/*==>Note: > In String class => javap java.lang.String
public static String valueOf(boolean);
public static String valueOf(char);
public static String valueOf(int);
public static String valueOf(long);
public static String valueOf(float);
public static String valueOf(double);
*/
public class ToString_Method_4 {

	public static void main(String[] args) {
		//form - 1 
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);// Internally it calls toString() and prints the Data.
		
		//form - 2 
		String s = Integer.toString(10);
		                            //|=> primitive type int.
		String s1=Integer.toString(10);
		System.out.println(s1);
		String s2=Boolean.toString(true);
		System.out.println(s2);
		String s3=Character.toString('a');
		System.out.println(s3);
		
		//form - 3
		 String s4=Integer.toString(15,2);
				 System.out.println(s4); // 1111
				 
	   //form - 4
		String s5=Integer.toBinaryString(7);
		String s6=Integer.toOctalString(10);
		String s7=Integer.toHexString(20);
		String s8=Integer.toHexString(10);
		System.out.println(s5);//111
		System.out.println(s6);//12
		System.out.println(s7);//14
		System.out.println(s8);//a
		
	   //Note
		String data = String.valueOf('a');//static factory methods
		System.out.println(data);
		String data1 = "sachin".toUpperCase();//instance factory methods
		System.out.println(data1);
	}

}
