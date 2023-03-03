package lectures.Java_OOPs_Concepts_11.Inheritance_2;

/*Method Hidding ==>
 static method do participate in inheritance ,but we can't override if we do that
 it will consider as Specialized Method*/

class Parent07{
	//Normal Parent Method
//	public void disp()
//    {
//		System.out.println("Parent Class");
//	}
	public static void disp()
    {
		System.out.println("Parent Class");
	}
}
class Child07 extends Parent07{
	//Overrride Method normal 
//	public void disp()
//    {
//		System.out.println("Child Class");
//	}
	
	public static void disp()
    {
		System.out.println("Child  Class");
	}
}
public class Method_Hiding {

	public static void main(String[] args) {
		//for normal method no issue
//		Parent07 p = new Child07();
//		p.disp();
		
		Parent07 p1 = new Child07();
		p1.disp();  //output -> Parent Class
		//it will only give Parent class data if we override static ,
		          //but it not it looks like we override parent class to child class.
		          //the child class method will act as Specialized method
		Child07 p3 = new Child07(); //Specialized method call
		p3.disp();//Output -> Child  Class
	}

}
