package lectures.Java_Operators_03_02;

/*RelationalOperator
==================
It can be applied on every type except boolean type
  System.out.println(10>10.5);//false
  System.out.println('a'>95.5);//false
  System.out.println('z'>'a');//true
  System.out.println(true>true);//CE:incompatible types

We can't apply relational operator on String objects
  System.out.println("sachin">"dhoni");

Nesting of relational operators in not permitted
  System.out.println(10<20<30); //CE: < or > can't be applied on boolean.

For any 'x' value including NaN, the following expression return false
  System.out.println(10<Float.NaN); //false
  System.out.println(10<=Float.NaN); //false
  System.out.println(10>Float.NaN); //false
  System.out.println(10>=Float.NaN); //false
  System.out.println(Float.Nan==Float.NaN); //false
   System.out.println(10>=Double.NaN); //false

Note::
  System.out.println(Float.NaN!=Float.NaN); //true
  System.out.println(10!=Float.NaN); //false
*/
public class RelationalOperators {
	public static void main(String[] args) {
		int a =30,b = 10;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(10>10.5);//false
		  System.out.println('a'>95.5);//false
		  System.out.println('z'>'a');//true
	   // System.out.println(true>true);//CE:incompatible types
		  
		//System.out.println("sachin">"dhoni");  //**We can't apply relational operator on String objects
		  
		  //**Nesting of relational operators in not permitted
		  //System.out.println(10<20<30); //CE: < or > can't be applied on boolean.
		  
		 //** For any 'x' value including NaN, the following expression return false
		  System.out.println(10<Float.NaN); //false
		  System.out.println(10<=Float.NaN); //false
		  System.out.println(10>Float.NaN); //false
		  System.out.println(10>=Float.NaN); //false
		  System.out.println(Float.NaN==Float.NaN); //false
		  System.out.println(10>=Double.NaN); //false

		//Note::
		  System.out.println(Float.NaN != Float.NaN); //true
		  System.out.println(10 != Float.NaN); //true
		
	}

}
