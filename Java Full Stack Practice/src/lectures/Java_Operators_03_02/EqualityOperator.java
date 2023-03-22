package lectures.Java_Operators_03_02;

/**EqualityOperator(==,!=)
=======================
  We can apply equality operator for every primitive type including boolean type.
a. System.out.println(10==20); //false
b. System.out.println('a'=='b');//false
c. System.out.println('a'=97.0);//false
d. System.out.println(true==true);//true
e. System.out.println(false==false); //true

EqualityOperator on Objects
===========================
We can apply equality operator for objects types also
For object reference r1 and r2,
   if  r1==r2, both r1 and r2 are pointing to same object returns true
   else returns false
== :: It compares the reference of the object or address of the object.

eg:: Thread t1=new Thread();
     Thread t2=new Thread();
     Thread t3=t1;
     System.out.println(t1==t2);//false
     System.out.println(t1==t3);//true

Rule:: To use equality operator between object types compulsorily there should be some
       relation b/w argument types, otherwise we get compile time error.

eg#1.
  Thread t=new Thread();
  Object o=new Object();
  String s=new String("abc");
  System.out.println(t==o);//false
  System.out.println(o==s);//false
  System.out.println(t==s);//CE:incompatible types
*/
public class EqualityOperator {

	public static void main(String[] args) {
		
		System.out.println(10==20); //false
		System.out.println('a'=='b');//false
		System.out.println('a'== 97.0);//true
		System.out.println(true==true);//true
		System.out.println(false==false); //true
		
		//We can apply equality operator for objects types also
		// == :: It compares the reference of the object or address of the object.
		
		Thread t1=new Thread();
	     Thread t2=new Thread();
	     Thread t3=t1;
	     System.out.println(t1==t2);//false
	     System.out.println(t1==t3);//true
	     
	     //Rule:: To use equality operator between object types compulsorily there should be some
	      // relation b/w argument types, otherwise we get compile time error.
	     Thread t=new Thread();
	     Object o=new Object();
	     String s=new String("abc");
	     System.out.println(t==o);//false  //parent child relation
	     System.out.println(o==s);//false  //parent child relation
	     //System.out.println(t==s);//CE:incompatible types  //no relationShip
	      

	}

}
