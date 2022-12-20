package lectures.Java_StaticKeyword_12;
class Demo{ //class
	static int a;  //static variable
	static int b;
	
	static  //static block or static intialization block 
	{
		System.out.println("Static Block");
		a =20;
		b = 30;
	}
	static void disp() {   //static method
		System.out.println("Static Method");
		System.out.println(a); //20
		System.out.println(b); //30
		
	}
	
	int x;   //instance variable
	int y;
	
	Demo(){
		
		System.out.println("This is a Constructor");
	}
	
	{ // Normal java block/initialization block
		System.out.println();
		x = 30;
		y = 40;
		System.out.println("Non Static java block");
		System.out.println();
	}
	void disp1() {     //normal method 
		System.out.println("Non-Static method");
		System.out.println(x);
		System.out.println(y);
	}
	void disp2() {     //normal method 
		
		disp();
	}
}
public class Basic_Static {

	public static void main(String[] args) {
		
		Demo.disp(); //calling only static method
		
		Demo d = new Demo();  //creating object of Demo class
		d.disp1();   ///calling only non static method
		
	}
}
