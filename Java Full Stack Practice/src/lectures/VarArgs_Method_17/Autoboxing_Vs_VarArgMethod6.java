package lectures.VarArgs_Method_17;

public class Autoboxing_Vs_VarArgMethod6 {

	/* Case 3: Autoboxing vs var-arg method : */
	
		public static void methodOne(Integer i) {
		System.out.println("AutoBoxing");
		}
		public static void methodOne(int... i) {
		System.out.println("var-arg method");
		}
		public static void main(String[] args) {
		int x=10;
		methodOne(x); // int =====> implicit type casting===> long,float,double
		              // int =====> Autoboxing ===> Integer
		//Output: AutoBoxing
	    
	
//	//Case 4 ========>
//	    public static void methodOne(Long l) {
//		   System.out.println("Long");
//		}
//		public static void main(String[] args) {
//		int x=10;
//		methodOne(x); //CE: can't find the method
		
		//case 5 ===========>
//		public static void methodOne(Object o) {
//			System.out.println("Object");
//		}
//		public static void main(String[] args) {
//			int x=10;
//			methodOne(x); // AutoBoxing ===> int ===> Integer
//			              // Widening ===> Integer ====> Number,Object 
//			//Output: Object
		
	} 
}
