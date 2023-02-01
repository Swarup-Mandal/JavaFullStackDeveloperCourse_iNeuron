package lectures.Java_WrapperClass_16;

/*All of the primitive wrapper types (Boolean, Byte, Char, Short, Integer, Long, Float and Double) 
have adopted the same pattern. In general, replace:

    new <WrapperType>(<primitiveType>);
    
                with

    <WrapperType>.valueOf(<primitiveType>);
    
(Note that the caching behavior mentioned above differs with the type and the Java platform,
		but the Java 9+ deprecation applies notwithstanding these differences.) */

public class Basic_WrapperClass {
	public static void main(String[] args) {
//		Integer i=new Integer(10);
//		 Integer i1=new Integer("10");    //
//		 Double d=new Double(10.5);
//		 Double d1=new Double("10.5");
		
		//Integer Wrapper class
		 Integer i = Integer.valueOf(10);
		 System.out.println("Integer " + i);//toString() -> 10
		 Integer i1 = Integer.valueOf("10");
		 System.out.println(i1);//toString() -> 10
		 System.out.println();
		 
		//Double Wrapperclass
		 Double d = Double.valueOf(10.5);
		 System.out.println("Double "+d);//toString() -> 10.5
		 Double d1 = Double.valueOf("10.5");
		 System.out.println(d1);//toString() -> 10.5
		 System.out.println();
		 
		//Float Wrapperclass
		 Float f = Float.valueOf(30.5f);
		 System.out.println("Float "+f);//toString() -> 30.5
		 Float f1 = Float.valueOf((float) 30.5);  //in new deprecation Double is not permited in Float
		 System.out.println(f1);//toString() -> 10
		 Float f2 = Float.valueOf("30.5");
		 System.out.println(f2);
		 System.out.println();
		 
		//Character Wrapperclass
		 Character c = Character.valueOf('a');
		 System.out.println("Character "+ c);
		//Character c1 = Character.valueOf("a"); //invalid
		 System.out.println();
		 
	    //Boolean Wrapperclass (Boolean part)
		 Boolean b1 = Boolean.valueOf(true);
		 System.out.println("Boolean case: " + b1);
		 Boolean b2 = Boolean.valueOf(false);
		 System.out.println(b2);
		 //Boolean b3 = Boolean.valueOf(True);//C.E
		 //Boolean b4 = Boolean.valueOf(False);//C.E
		 //Boolean b5 = Boolean.valueOf(TRUE);//C.E
		 System.out.println();
		 
	    //Boolean Wrapperclass (String part)
		 Boolean g1= Boolean.valueOf("true");  //for all case insensitive true("true","True", "TRUE","TruE") 
		 Boolean g2= Boolean.valueOf("True");   //will give result as true
		 Boolean g3= Boolean.valueOf("false");
		 Boolean g4= Boolean.valueOf("False");
		 Boolean g5= Boolean.valueOf("nitin");
		 Boolean g6= Boolean.valueOf("TRUE");
		 System.out.println("Boolean String case " + g1);//true
		 System.out.println(g2);//true
		 System.out.println(g3);//false
		 System.out.println(g4);//false
		 System.out.println(g5);//false
		 System.out.println(g6);//true
		 System.out.println();
		 
		 //Some Boolean Code
		 Boolean b11 = Boolean.valueOf("yes");
		 Boolean b22 = Boolean.valueOf("no");
		 System.out.println(b11);//false
		 System.out.println(b22);//false
		 System.out.println(b11.equals(b22));//false.equals(false)-> true
		 System.out.println(b11 == b22);//false, bcz it will compare ref.
		 Integer i11 = Integer.valueOf(10);
		 Integer i22 = Integer.valueOf(10);
		 System.out.println(i11);//10
		 System.out.println(i22);//10
		 System.out.println(i11.equals(i22));//true 
		 

	
    }
}
