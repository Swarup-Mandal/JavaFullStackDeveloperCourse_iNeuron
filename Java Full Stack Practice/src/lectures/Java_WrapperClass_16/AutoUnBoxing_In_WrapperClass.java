package lectures.Java_WrapperClass_16;

public class AutoUnBoxing_In_WrapperClass {

	public static void main(String[] args) {
		/*AutoUnBoxing
		============
		 Automatic conversion of wrapper object to primtive type by compiler is called
		"AutoUnBoxing".*/
		
		Integer i1 = Integer.valueOf(10);
		 int i2 = i1;
		  /*  |
		      |compiler internally converts Integer to int type using intValue()
		      |  */
	   //int i2 = i1.intValue();
    //Note: AutoUnboxing is done by the compiler using a method called "xxxValue()"


	}

}
