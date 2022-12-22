package lectures.Java_OOPs_Concepts_11.Inheritance_2;
//MemoryMap + Constructor + Inheritance

class Parentt{
	int a,b;
	Parentt(){
		a=10;
		b=20;
		System.out.println("Parent Constructor");
	}
	Parentt(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("Parent Parameterize Constructor");
	}
}
class Childd extends Parentt{
	//geting a,b from Parett class
	int x,y;
	Childd(){
		//super(); //and this will call the parent Constructor.
		this(111,222); //super method will not be created by default
		x = 100;
		y = 200;
	}
	Childd(int x, int y){
		//super();    //by default this will call the parentt Constructor().
		//super(30,40);  //Explicitly we are calling Parentt(int a, int b)
		super(x,y);
		this.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class MemoryMap_Constructor_Inheritance {

	public static void main(String[] args) {
//		Childd ch = new Childd();  //creating Childd object and also calling Constructor(0)
//		ch.disp();
//		
//		System.out.println();
//		
//		Childd ch1 = new Childd(1000,2000);  //creating Childd object and also calling Constructor(0)
//		ch1.disp();
//		
//		System.out.println();
		
		Childd ch2 = new Childd();  //creating Childd object and also calling Constructor(0)
		ch2.disp();
		
		System.out.println();
		
		Childd ch3 = new Childd(1000,2000);  //creating Childd object and also calling Constructor(0)
		ch3.disp();

	}

}
