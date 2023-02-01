package lectures.VarArgs_Method_17;
/*Var arg method
==============
It stands for variable argument methods.
In java language,if we have variable no of arguments, then compulsorily new
method has to be written till jdk1.4.
But jdk1.5 version, we can write single method which can handle variable no of
arguments(but all of them should be of same type).
    Syntax:: methodOne(dataType... varaibleName)
                               ... => It stands for ellipse*/
//eg#1.
class Demo
{
  //JDK1.5V called Var-args(ellipse)
   public void add(int... x){
     System.out.println("var-arg approach");
   }
}

//eg :: 2  ------>
class Demo1
{
   public void methodOne(int... x){
       int total=0;
       for(int i=0;i<x.length;i++){
            total+=x[i];
       }
       System.out.println("The sum is "+total);
   }
}



//eg :: 3  ------>
class Demo2{
   public void methodOne(int... x){
      int total =0;
      for(int data:x)
      {
    	  total += data;
      }
      System.out.println("The SUM is(by For-each) :  "+total);
   }
}
public class Var_Args_Basics {

	public static void main(String[] args) {
		////eg#1 calling
		Demo d =new Demo();
		d.add();
		d.add(10);
		d.add(10,20);
		d.add(10,20,30);
		
		System.out.println();
		
		//eg :: 2 calling ------>
		Demo1 d1= new Demo1();
		d1.methodOne();//The sum is 0
		d1.methodOne(10);//The sum is 10
		d1.methodOne(10,20,30);// The sum is 60
		
		System.out.println();
		
		//eg :: 3 calling ------>
				
		Demo2 d11= new Demo2();
		d11.methodOne();//The sum is 
		d11.methodOne(10);//The sum is 10
		d11.methodOne(10,20,30);// The sum is 60

	}

}
