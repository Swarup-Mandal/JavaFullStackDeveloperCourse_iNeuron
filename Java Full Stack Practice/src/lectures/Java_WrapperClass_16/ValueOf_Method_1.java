package lectures.Java_WrapperClass_16;
/*
  public static wrapper valueOf(String data, int radix) throws java.lang.NumberFormatException;
  public static wrapper valueOf(String data) throws java.lang.NumberFormatException;
  public static wrapper valueOf(int data);
*/
public class ValueOf_Method_1 {

	public static void main(String[] args) {
		//eg#1.
		Integer i=Integer.valueOf("10");
		Double d=Double.valueOf("10.5");
		Boolean b=Boolean.valueOf("nitin");
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
		//eg#2.
		/*
		 * public static valueOf(String s,int radix) |=> binary : 2(0,1) |=> octal :
		 * 8(0-7) |=> decimal : 10(0-9) |=> hexadecimal : 16(0-9,a,b,c,d,e,f) |=> base : 36(0-9,a-z)
		 */

		Integer i1=Integer.valueOf("1111");
		System.out.println(i1);//1111
		Integer i2=Integer.valueOf("1111",2);
		System.out.println(i2);//15
		//Integer i3=Integer.valueOf("ten");
		//System.out.println(i3);//RE:NumberFormatException
		//Integer i4=Integer.valueOf("1111",37);
		//System.out.println(i4);//RE:NumberFormatException
		Integer i5=Integer.valueOf("100",2);  // consider 100 as octal number
		System.out.println(i5);//4
		
		//eg#3.
		//public static valueOf(primitivetype x)
		Integer i9=Integer.valueOf(10);
		Double d1=Double.valueOf(10.5);
		Character c=Character.valueOf('a');
		Boolean b3=Boolean.valueOf(true);
		
		//Primtive/String =>valueOf() => WrapperObject

	}

}
