package lectures.Java_String_10;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
	// All OverLoaded method in StringBuffer/StrinBuilder
		
		/*1>>>
		 * 1. public StringBuffer append(int i)
           2. public StringBuffer append(long l)
           3. public StringBuffer append(boolean b)
           4. public StringBuffer append(double d)
           5. public StringBuffer append(float f)
           6. public StringBuffer append(int index,Object o)
		 */
		
		java.lang.StringBuffer sb = new java.lang.StringBuffer();
		sb.append("PI value is :: ");
		sb.append(3.1414);
		sb.append(" This is exactly ");
		sb.append(true);
		System.out.println(sb);// PI value is ::3.1414 This is exactly true
		
		System.out.println();
		
		/*Overloaded methods 2>>>
		===================
		7. public StringBuffer insert(int index,String s)
		8. public StringBuffer insert(int index,int i)
		9. public StringBuffer insert(int index,long l)
		10. public StringBuffer insert(int index,double d)
		11. public StringBuffer insert(int index,boolean b)
	    12. public StringBuffer insert(int index,float s)
		13. public StringBuffer insert(int index,Object o)
		*/
		
		//eg::
		java.lang.StringBuffer nb = new java.lang.StringBuffer("sacin");
			nb.insert(3, 'h');
			System.out.println(nb);//sachin
			nb.insert(6, "IND");
			System.out.println(sb);//sachinIND
			
			System.out.println();
			
   //Others normal method og StringBuffer/StringBuilder
		
		//1> public StringBuffer delete(int begin,int end)
		
		//2> public StringBuffer deleteCharAt(int index)
			//e.g.
			java.lang.StringBuffer sbn=new java.lang.StringBuffer("sachinrameshtendulkar");
			sbn.delete(6,12);
			System.out.println(sbn);//sachintendulkar
			sbn.deleteCharAt(13);

			System.out.println(sbn);//sachintndulkar
			System.out.println();
			
	   //3> public StringBuffer reverse()	
			//eg:: 
			java.lang.StringBuffer seb=new java.lang.StringBuffer("sachin");
			seb.reverse();
			System.out.println(seb);//nihcas
			System.out.println();
			
	   //4> public void setLength(int Length)
			//eg::
			java.lang.StringBuffer sbr=new java.lang.StringBuffer("sachinramesh");
			sbr.setLength(6);
			System.out.println(sbr);//sachin
			System.out.println();
			
	   //5> public void trimToSize()
			//eg::
			java.lang.StringBuffer sbm = new java.lang.StringBuffer(1000);
			System.out.println(sbm.capacity());//1000
			sb.append("sachin");
			System.out.println(sbm.capacity());//1000
			sb.trimToSize();
			System.out.println(sbm);//sachin
			System.out.println(sbm.capacity());//6
			System.out.println();
			
	   //6> public void ensureCapacity(int capacity)
			//eg::
			java.lang.StringBuffer sbf = new java.lang.StringBuffer();
			System.out.println(sbf.capacity());//16
			sb.ensureCapacity(1000);
			System.out.println(sbf.capacity());//1000
			System.out.println();
			
	// MethodChaining -------->
		
		java.lang.StringBuffer sbb = new java.lang.StringBuffer();
		sbb.append("sachin").insert(6, "tendulkar").reverse().append("IND").delete(0,
		4).reverse();
		System.out.println(sbb);
		
		String name ="sachin";
		String data = name.toUpperCase();
		int count = data.length();
		System.out.println(count);
		//method chaining
		System.out.println(name.toUpperCase().length());
		
		java.lang.StringBuffer sb1 = new java.lang.StringBuffer("virat");
		//method chaining
		sb1.append("kohli").

		insert(10,"anushka").
		reverse().
		append("IND").
		insert(sb1.length(),"RCB").
		reverse().delete(0,6);
		System.out.println(sb1);
		
		//but
		java.lang.StringBuffer sb2 =new java.lang.StringBuffer("dhoni");
	  //sb2.length().append("CSK");//CE:int can't be dereferenced
		
		
		
		/*all the method in StringBuilder is same as StrungBuffer.
		 * The only Difference is StringBuffer ==> synchronized (Thread-Safe,only one user at a time can use)
		 *                        StringBuilder ==> Non- synchronized (not Thread-Safe, many user can use this class any time)
		 */
		
		
		
		
		
		
		
	}
}
