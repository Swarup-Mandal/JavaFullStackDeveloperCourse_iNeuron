package lectures.Java_ExceptionHandling_20;

public class OverrridingException_Rules_14 {
	public static void main (String[] srgs) { 
		
	/*Rules of Overriding when exception is involved
	==============================================
	While Overriding if the child class method throws any checked exception
	compulsorily the parent class method should throw
	the same checked exception or its parent otherwise we will get Compile Time Error.
	 There are no restrictions on UncheckedException.
	eg#1.*/
//	class Parent{
//	   public void methodOne();
//	}
//	class Child extends Parent{
//	   public void methodOne() throws Exception{}
//	}
//	error: methodOne() in Child cannot override methodOne() in Parent
//	 public void methodOne() throws Exception{}
//	 overridden method does not throw Exception
	
//		Rules w.r.t Overriding
//	=====================
//	parent: public void methodOne() throws Exception{}
//	child : public void methodOne()
//	output: valid
//	parent: public void methodOne(){}
//	child : public void methodOne() throws Exception{}
//	output: invalid
//	parent: public void methodOne()throws Exception{}
//	child : public void methodOne()throws Exception{}
//	output: valid
//	parent: public void methodOne()throws IOException{}
//	child : public void methodOne()throws IOException{}
//	output: valid
//	parent: public void methodOne()throws IOException{}
//	child : public void methodOne()throws FileNotFoundException,EOFException{}
//	output: valid
//	parent: public void methodOne()throws IOException{}
//	child : public void methodOne()throws FileNotFoundException,InterruptedException{}
//	output: invalid
//	parent: public void methodOne()throws IOException{}
//	child : public void methodOne()throws FileNotFoundException,ArithmeticException{}
//	output: valid
//	parent: public void methodOne()
//	child : public void methodOne()throws
//	ArithmeticException,NullPointerException,RuntimeException{}
//	output: valid
//	parent: public void methodOne()throws IOException{}
//	child : public void methodOne()throws Exception{}
//	output: invalid
//	parent: public void methodOne()throws Throwable{}
//	child : public void methodOne()throws IOException{}
//	output: valid
		
	}
}
