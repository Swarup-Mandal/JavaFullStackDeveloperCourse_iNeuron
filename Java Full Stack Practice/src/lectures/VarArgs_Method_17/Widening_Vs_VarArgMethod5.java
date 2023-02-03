package lectures.VarArgs_Method_17;

public class Widening_Vs_VarArgMethod5 {

	/* case2::Widening vs var-arg method */
	//Overloading
	public static void methodOne(long l) {
	      System.out.println("widening");
	}
	public static void methodOne(int... i) {  //this is not like int x ==> it is int[] x. so, not even used
	      System.out.println("var-arg method");
	}
	public static void main(String[] args) {
	   int x=10;
	   methodOne(x); // primtive ====> do type casting====>
	                 //               found ==> long(binding happens by compiler)
	
	
	//output: widening

	}
}
