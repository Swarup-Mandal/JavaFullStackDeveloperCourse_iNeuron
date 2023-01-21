package lectures.Java_Interface_15;
/* Interface variables
   ===================
   => Inside the interface we can define variables.
   => Inside the interface variables define requirement level constants.
   => Every variable present inside the interface is by default public static final.
*/

//Variable in Interface => Syntax
interface ISamplee{
     int x=10;  //by default public static final
}

//e.g ::
interface Remote{
	 int VOLUME = 100;
}

/*
 * since the variable defined in interface is public static final,we cannot use
 * modifiers like private,protected,transient,volatile. since the variable is
 * static and final,compulsorily it should be initialized at the time of
 * declaration otherwise it would result in compile time error.
 */


public class Variable_in_Interface implements Remote{
		 public static void main(String... args){
		    //VOLUME=0;//CE:: cannot assign a value to final variable VOLUME
			 System.out.println("value of volume is(Interface) ::"+VOLUME);
			 int VOLUME = 10; //Local Variable will win
		     System.out.println("value of volume is ::"+VOLUME);
		 }
}
