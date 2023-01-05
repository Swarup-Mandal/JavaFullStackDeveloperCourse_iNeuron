package lectures.Java_InnerClass_14;

//Some Scenerios----------->
//Scenerio 1  *******

//public class InnerClass {
//	int num; //instance variable
//	public void show() {     //Non-Static method  ----------->
//		System.out.println("in show : " + num );
//	}
//	public static void main(String[] args) {     //Static Method-------------------->
//		//we can't call non-static method into a static method -> 
//		//show();     //we have to creat object that class or creat non-static method into static method.
//		InnerClass obj = new InnerClass();
//		obj.show();
//		System.out.println(obj.num);
//	}
//}

//Scenerio 1  *******
public class InnerClass {
	private int num; //instance variable
	
	//have to create object of A class (like Inner Class)
	A con = new A();
	//con.config();   //you can,t call any method outside any method.bcz, calling  method is a action and all action shold be inside a method.
	public void show() {     //Non-Static method  ----------->
		System.out.println("in show : " + num );
		con.config();
	}
	//creating another class
	class A{
		public void config() {
			System.out.println("In Config " + num );
		}
	}
	public static void main(String[] args) {     //Static Method-------------------->
		//we can't call non-static method into a static method -> 
		//show();     //we have to creat object that class or creat non-static method into static method.
		InnerClass obj = new InnerClass();
		obj.show();
	
		
	}
}