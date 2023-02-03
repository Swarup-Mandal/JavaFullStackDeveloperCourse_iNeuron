package lectures.Java_WrapperClass_16;

public class AllCasesOF_AutoBoxing_AutoUnBoxing_10 {
	////CASE - 1 ***************
	
//	static Integer ii1 = 10;// AutoBoxing  => integer to Wrapper Object
//	  public static void main(String[] args) {
//		
//		int ii2 = ii1;//AutoUnBoxing  => Wrapper object to integer
//		 m1(ii2);
//	  }
//		public static void m1(Integer ii2){//AutoBoxing
//		int k = ii2;//AutoUnBoxing
//		System.out.println(k);//10
//	}
//	/*
//	 * Compiler is responsible for conversion of primitive to wrapper and wrapper to
//	 * primitive using the concept of "AutoBoxing and AutoUnBoxing".
//	 */
		
	///CASE - 2 *****************
	
//	static Integer i11;//i11 = null
//	public static void main(String[] args)
//	{
//	  int i22 = i11;// int i22 = i11.intValue() :: NullPointerException => java.lang.NullPointerException:
//	  System.out.println(i22);
//	}
	
	
	
	public static void main(String[] args)
    {
		///CASE - 3 *****************
	 Integer i1 = 10;//AutoBoxing
	 Integer i2 = i1 ;
	 i1++; //= > i1 = i1+1
	 
	 System.out.println(i1);
	 System.out.println(i2);
	 System.out.println(i1==i2);
	 
	  ///CASE - 4 *****************
	
		 Integer x = new Integer(10);
		 Integer y = new Integer(10);
		 System.out.println(x == y);//false
	  
	  ///CASE - 5 *****************
		 Integer x1 = new Integer(10);//memory from heap area
		 Integer y1 = 10;//AutoBoxing ===> Integer y = Integer.valueOf(10);
		 System.out.println(x1 == y1);//false
		 
	 ///CASE - 6 *****************
			 Integer x2 = new Integer(10);
			 Integer y2 = x2; //===> reference is reused so pointing to same object
			 System.out.println(x2 == y2);//true
			 
	///CASE - 7 *****************
			 Integer x3 = 10;
			 Integer y3 = 10;
			 System.out.println(x3 == y3);  //true
			 Integer a = 100;
			 Integer b = 100;
			 System.out.println(a == b);    //true
			 Integer i = 1000;
			 Integer j = 1000;
			 System.out.println(i == j);    //false (exceed buffer object range -128 to +127)

				/*
				 * Note: 1. To implement autoboxing concpet in wrapper class a buffer of object
				 * will be created at the time of class loading. 2. During AutoBoxing,if an
				 * object has to be created first jvm will check whether the object is already
				 * available inside buffer or not. 3. If it is available, then JVM will reuse
				 * the buffered object instead of creating a new Object. 4. If the Object is not
				 * available inside buffer, then jvm will create a new object in the heap area,
				 * this approach improves the performance and memory utilization */
			 
				 /* But this buffer concept is applicable only for few cases 
				  * 1. Byte => -128 to +127 
				  * 2. Short => -128 to +127 
				  * 3. Integer=> -128 to +127 
				  * 4. Long => -128 to +127 
				  * 5. Character => 0 to 127 
				  * 6. Boolean => true,false 
			 * In the remaining cases new object will be created. */
				 
				  // String/primtive to wrapper => valueOf() 
				  // Wrapper type to primitive => xxxValue()
				 
	 //example code 1 -------->
			 Integer x5 = 128;
			 Integer y5 = 128;
			 System.out.println(x5 == y5);//false
			 Integer a1 = 127;
			 Integer b1 = 127;
			 System.out.println(a1 == b1);//true
			 Boolean b11 = true;
			 Boolean b22 = true;
			 System.out.println(b11==b22);//true
			 Double d1 = 10.0;
			 Double d2 = 10.0;
			 System.out.println(d1==d2);//false
			 
	//example code 2 -------->	
			 Integer i14= new Integer(10);
			 Integer i24= new Integer(10);
			 System.out.println(i14==i24);//false
			 Integer i13 = 10;
			 Integer i23 = 10;
			 System.out.println(i13==i23);//true
			 Integer i15 =Integer.valueOf(10);
			 Integer i25 =Integer.valueOf(10);
			 System.out.println(i15==i25);//true
			 Integer i16 =10;
			 Integer i26 =Integer.valueOf(10);
			 System.out.println(i16==i26);//true
	 
    }

		

}
