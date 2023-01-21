package lectures.Java_Interface_15;

                        //Interface Example 1
//SRS
//interface ISample{      //interface
//	void m1();  //100% abtract class
//	void m2();  //methods 
//}
//class SampleImpl implements ISample{    //interface implementation by implemets keyword
//	@Override
//	public void m1() {
//		System.out.println("Implementation Given for m1() method.");
//	}
//	@Override
//	public void m2() {
//		System.out.println("Implementation Given for m2() method also.");
//	}
//}
//public class Basic_Interface {
//
//	public static void main(String[] args) {
//		//creating object by loose coupling
//		ISample sample = new SampleImpl();
//		sample.m1();
//		sample.m2();
//	}
//}
//*******************************************

                     //Interface Example 2
//SRS
interface ISample{      //interface
	void m1();  //100% abtract class
	void m2();  //methods 
}
abstract class SampleImpl implements ISample{    //interface implementation by implemets keyword
	@Override
	public void m1() {
		System.out.println("Implementation Given for m1() method.");
	}
	// void m2();  //don't want to create implementation so by default a abstract method implemented 
	//internally so, we have to create abstract class. bcz, for only one abstract method present 
	//the class must be abstract also
}
class SubSampleImpl extends SampleImpl{     //extending by a subclass.
	@Override
	public void m2 () {
		System.out.println("Implementation given by sub/child class for m2 () method.");
	}
}
public class Basic_Interface {

	public static void main(String[] args) {
		//creating object by loose coupling
		ISample sample = new SubSampleImpl();
		sample.m1();
		sample.m2();
	}
}
