package lectures.Java_Array_08;

public class MutableString {

	public static void main(String[] args) {
		// eg1::
		 StringBuffer sb = new StringBuffer();
		 System.out.println(sb.length());//no of charecter stored = 0
		 System.out.println(sb.capacity());//16, how many no of charecters can be hold by default?
		 sb.append("abcdefghijklmnop");
		 System.out.println(sb.capacity());//16
		 sb.append('q'); //added 1 charecter to 16 (charecer 17) --> new capacity = (current capacity + 1) *2
		 System.out.println(sb.capacity());//34 (17 + 16 = 34)
		 
		 System.out.println();
		 
		//eg1::
		 StringBuffer sbb = new StringBuffer(19);
		 System.out.println(sbb.length());//no of charecter stored = 0
		 System.out.println(sbb.capacity());//19 , derived capacity 
		 
		 System.out.println();
		 
		 StringBuffer sbbb = new StringBuffer(19);
		 System.out.println(sbbb.capacity());//19 , derived capacity 
		 
		//eg2::
		 StringBuilder sb1 = new StringBuilder("sachin");
		 System.out.println(sb1.capacity());//22 
		 
		 System.out.println();
		 
		 /*
		  * Important methods of StringBuffer/StringBuilder
===============================================
a. public int length()
b. public int capacity()
c. public char charAt(int index)
d. public void setCharAt(int index,char ch)
==================================================
e. public StringBuffer append(String s)
f. public StringBuffer append(int i)
g. public StringBuffer append(long l)
h. public StringBuffer append(boolean b)
i. public StringBuffer append(double d)
j. public StringBuffer append(float f)
k. public StringBuffer append(int index,Object o)
===================================================
l. public StringBuffer insert(int index,String s)
m. public StringBuffer insert(int index,int i)
n. public StringBuffer insert(int index,long l)
o. public StringBuffer insert(int index,double d)
p. public StringBuffer insert(int index,boolean b)
q. public StringBuffer insert(int index,float f)
r. public StringBuffer insert(int index,Object o)
=================================================
public StringBuffer delete(int begin,int end)
public StringBuffer deleteCharAt(int index)
public StringBuffer reverse()
public void setLength(int Length)
public void trimToSize()
public void ensureCapacity(int capacity)
 */
		 //e.g 3 ::
			 StringBuilder sb2 = new StringBuilder("sachinrameshtendulkar");
			 System.out.println(sb2.length());//21
			 System.out.println(sb2.capacity());//21 + 16 = 37
			 System.out.println(sb2.charAt(20));//'r'
		   //System.out.println(sb2.charAt(100));//StringIndexOutOfBoundsException
			 
			 System.out.println();
			 
		//e.g 4 ::
			 StringBuilder sb3 =new StringBuilder("kohlianushka");
			 sb3.setCharAt(5,'A');
			 System.out.println(sb3);//kohliAnushka 


	}

}
