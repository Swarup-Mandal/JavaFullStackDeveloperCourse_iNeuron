package lectures.Java_OOPs_Concepts_11.Encapsulation_1;
//Memory Map (inheritance + Constructor => super() & this() )
class Parent{
	int a,b;
	Parent(){
		 a=10;
		 b=20;
		 System.out.println("Parent no para Constructor");
	}
	Parent(int a,int b){
		 this.a=a;
		 this.b=b;
		 System.out.println("Parent para Constructor");
	}
}
class Child extends Parent{
	int x,y;
	Child(){
		this(111,222);
		 x=100;
		 y=200;
	}
	Child(int x,int y){
		super(x,y);
		 this.x=x;
		 this.y=y;
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}
public class Practice2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
		
		Child c1 = new Child(1000,2000);
		c1.disp();

	}

}
