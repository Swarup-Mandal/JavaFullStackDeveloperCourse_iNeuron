package lectures.VarArgs_Method_17;

public class Widening_Vs_Autoboxing4 {
	//Overloading
	public static void methodOne(long l) {
		System.out.println("widening");
	}
	public static void methodOne(Integer i) {
		System.out.println("autoboxing");
	}

	public static void main(String[] args) {
		int x=10;
		methodOne(x);// widening ==> primtive(int) ====> do type casting (to long) 
		             //                     ====> found ==> long(binding happens by compiler)
		              
	}
}
