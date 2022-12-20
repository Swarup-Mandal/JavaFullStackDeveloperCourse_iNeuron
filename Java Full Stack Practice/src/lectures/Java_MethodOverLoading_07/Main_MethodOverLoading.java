package lectures.Java_MethodOverLoading_07;

//Can we overload main method? (yes)

public class Main_MethodOverLoading {
	
    public static void main(int[] args) {           //main method overloading
		
		System.out.println("It is accepting int args(not staring point"); 
	}
	

	public static void main(String[] args) {    // Starting point of the code recognize by JVM(The Main method)
		
		System.out.println("It is the actual starting point(main method)"); 
	}
	
    public static void main(double d) {             //main method overloading
		
		System.out.println("accepting Double method");   
	}

}
