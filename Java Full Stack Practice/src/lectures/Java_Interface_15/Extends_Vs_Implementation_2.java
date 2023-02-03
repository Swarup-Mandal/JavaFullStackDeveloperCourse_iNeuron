package lectures.Java_Interface_15;
// extends Vs implements keyword
//Case 1 ----------->
   //extends keword example
class One{
	
}
class two extends One{   //we can extend only one class at a time
	
}
    //inteface example
interface IOne{
	void m1();
}
interface ITwo{
	void m2();
}
class CommonImpl implements IOne,ITwo{  //we can implements many interface at a time

	@Override
	public void m1() {
	    System.out.println("Method 1 of interface");
	}

	@Override
	public void m2() {
		System.out.println("Method 1 of interface");
		
	}
	
}

   //Case 2 ------------->
// can A class can extend a class and can implements any no of interfacessimultaneously.
interface IBook{
      public void bookName();
}
class NoteBook{
      public void noteBookPages(){}
}
class StudyImpl extends NoteBook implements IBook{    //1st-> Reusability => extends
      @Override                                       //2nd-> Interface => implements
      public void bookName(){
    	  System.out.println("Java Zero To Hero");
      }
      @Override
      public void noteBookPages(){
    	  System.out.println("320 Pages");
      }
}

//    Case 3 ------------------->
interface IOnee{
      public void methodOne();
}
interface ITwoo{
      public void methodTwo();
}
interface IThree extends IOnee,ITwoo{
      //public void methodOne();  //internally inherited
      //public void methodTwo();
      public void methodThree();
}
class SampleeImpl implements IThree{

	@Override
	public void methodOne() {}

	@Override
	public void methodTwo() {}

	@Override
	public void methodThree() {}
	
}
public class Extends_Vs_Implementation_2 {

	public static void main(String[] args) {
		
		
	}

}
