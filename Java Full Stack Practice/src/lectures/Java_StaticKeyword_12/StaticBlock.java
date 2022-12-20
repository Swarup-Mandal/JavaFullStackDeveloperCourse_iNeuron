package lectures.Java_StaticKeyword_12;
//static block{ }

public class StaticBlock {
    static int a;
	
	static 
	{
		a = 90;             //static block is using here for right purpose
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		System.out.println("The main method");
	}
}


//class StaticB{
//	static int a;
//	
//	static 
//	{
//		a = 90;             //static block is using here for right purpose
//		System.out.println("Static Block");
//	}
//}
//public class StaticBlock {
//	public static void main(String[] args) {
//		System.out.println("The main method");
//		System.out.println(StaticB.a);
//	}
//
//}
