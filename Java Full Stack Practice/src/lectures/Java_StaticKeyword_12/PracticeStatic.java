package lectures.Java_StaticKeyword_12;

public class PracticeStatic {
	//Examples applicable only for JDK1.6 examples
	//example1
	static int i=methodOne();
	public static int methodOne(){
		System.out.println("Hello i can print 1");
		//System.exit(0);
		return 10;
	}
	//example 2
	static PracticeStatic t=new PracticeStatic();
	PracticeStatic(){
		System.out.println("Hello i can print 2");
		//System.exit(0);
	}
	//example 3
	static PracticeStatic t1=new PracticeStatic();
	{
		System.out.println("Hello i can print 3");
		//System.exit(0);
	}
	
	static int[] a=new int[5];
	static{
		a[0]=10;
		System.out.println("    Hii");
	}
	//example 4
	//Without using System.out.println() can we print some statement of console?
			 //eg#1
	public static void main(String[] args) {
		//type of print style
		System.out.println("Hello " + a[0]);
		System.out.print(" :Swarup");
		String s = "Mandal";
		System.out.printf(" %s",s);
		System.out.format(" : %s", s);
		System.err.println(" err variable");
		

	}
	
}
