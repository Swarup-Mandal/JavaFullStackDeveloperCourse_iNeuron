package lectures.Java_WrapperClass_16;

/*parseXXXX()
===========
We use parseXXXX() to convert String object into primitive type.
form-1
======
public static primitive parseXXX(String s);
Every wrapper class,except Character class has parseXXX() to convert String into primitive type.

form-2
======
public static primitive parseXXXX(String s, int radix);
	                                         |=> range is from 2 to 36
Every Integral type Wrapper class(Byte,Short,Integer,Long) contains the following parseXXXX()
to convert Specified radix String to primitive type.

Note: String => parseXXX() => primitive type*/

public class ParseXxx_Method_03_5 {

	public static void main(String[] args) {
		//eg: form-1 
			int i=Integer.parseInt("10");
	        double d =Double.parseDouble("10.5");
	        boolean b=Boolean.parseBoolean("true");
	        System.out.println(i);
	        System.out.println(d);
	        System.out.println(b);
	        System.out.println();
	        
	        
	        //eg: form -2
	        int i1=Integer.parseInt("1111",2);
	        System.out.println(i1);//15
	        

	}

}
