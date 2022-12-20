package lectures.Java_StaticKeyword_12;

public class StaticControlFlow {
	
	static int a;
	static int b;
	
	static 
	{
		System.out.println("This is static block");
		a=10;
		b=20;
	}
	static void disp(){
		System.out.println("This is other satic method and you have to call");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		System.out.println("The is static main() method");
		//all the static variables,block and static main method will executed
		disp();  // but you have to call others static method

	}

}
