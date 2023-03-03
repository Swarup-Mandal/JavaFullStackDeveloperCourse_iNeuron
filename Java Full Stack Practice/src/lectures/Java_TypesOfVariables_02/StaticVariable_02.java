package lectures.Java_TypesOfVariables_02;

/***2> static variables
=================
If the value of the variable must be changes from object to object then it is not recomended to keep
those variables as static.
In instance variable for every object a seperate copy will be created but in case
of static variables a single copy will be created at class level and shared by every object
of that class then those type of variables should be kept as static.
static variables will get a memory on the method area, it is not required to perform 
initialisation explicitly jvm will perform initialisation with default values.
*/
/*
 * Note:: If we make static variable as final, then compulsorily we should
 * perform initialisation explicitly, jvm wont provide default values. Whether
 * we use or not otherwise we get compile time error.
 */

/**
 * Rule:: For final static variables we should perform initialisation before
 * class loading completion. otherwise it would result in compile time error.
 * 
 * Possible places are ---->
 * a. At the time of declaration 
 *    class Test{ 
 *       final static int i=10; 
 *    }
 * 
 * b. Inside static block 
 * class Test{ 
 *    final static int i;
 *     static{
 *        i=10; 
 *     } 
 *  }
 * 
 * if we are performing initialisation any where then it would result in compile
 * time error
 * 
 * class Test{ 
 *    final static int i; 
 *    public static void methodOne(){
 *       i=10; //Compile time error. 
 *    } 
 * }
 */

public class StaticVariable_02 {
	static int i;  //memory given during class loadin tim in method area 
	//public static final int y;
	public static final int t = 7;  //have to intialize before class loading
	
	   public static void main(String... args){
		System.out.println(i);//0 == jvm will give the value
		System.out.println(t);
		methodOne();
	   }
	   public static void methodOne(){
	          //y=10; //Compile time error. 
	   } 
}
