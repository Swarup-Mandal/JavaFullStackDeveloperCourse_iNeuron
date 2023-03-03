package lectures.Java_ExceptionHandling_20;

import java.io.IOException;

public class MultiCatchBlock_13 {

	public static void main(String[] args) {
		/*MultiCatchBlock
		===============
		Till jdk1.6, eventhough we have multiple exception having same handling code we
		have to write a seperate catch
		block for every exceptions, it increases the length of the code and reviews
		readability.
		logic
		====*/
		
		try{
		   //Some code
		}catch(ArithmeticException ae){
		   ae.printStackTrace();
		}catch(NullPointerException ne){
		   ne.printStackTrace();
		}catch(ClassCastException ce){
		   System.out.println(ce.getMessage());
		}
		
//		To overcome this problem SUNMS has introduced "Multi catch block" concept in 1.7
//		version
		try{
		   //Some Code
		}
		catch(ArithmeticException |NullPointerException e){
		   e.printStackTrace();
		}
		catch(ClassCastException e1){
		   e1.printStackTrace();
		}
		
		/*In multicatch block,there should not be any relation b/w exception types(either
		child to parent or parent to child or same type) it would result in compile time
		error.*/
		//eg:: 
		/*
		 * try{
		 * 
		 * } catch( ArithmeticExeption | Exception e){ e.printStackTrace(); }
		 * Output:CompileTime Error
		 */

	}

}
