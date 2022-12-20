package lectures.Java_StaticKeyword_12;

class StaticM{
	static int a;
	
	static {
		a=10;
	}
	
	static void disp(){
		System.out.println("static disp method : " + a);
	}
}
public class StaticMethod {
	static void disp2() {
		System.out.println("This is a Static method");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		StaticM.disp();   //you can call a static method directly by class name 
		disp2();  //inside a class we can call it directly.
		
		StaticM d = new StaticM();
		d.disp();  //you can also call static method by object creation. 

	}
}
