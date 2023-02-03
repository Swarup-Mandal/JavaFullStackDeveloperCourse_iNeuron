package lectures.VarArgs_Method_17;
/*
SingleDimension Array vs Var Arg method
=======================================
1. Whereever Singledimesion array is present we can replace it with Var Arg.
     eg:: public static void main(String[] args) => String... args
2. Whereever Var arg is present we cannot replace it with SingleDimension Array.
    eg:: public void methodOne(String... args) => String[] args (invalid)

Note:
m1(int... x)
      => we can call to this method by passing group of int values and x will
become 1D array(int[] x)
m1(int[] x)
      => we can call to this method by passing 1D array only.package lectures.VarArgs_Method_17;
*/

//Note::
//methodOne(int...x)
// => we can call this method by passing a group of int values,so it
//becomes 1-D array.
//methodOne(int[]... x)
// => we can call this method by passing a group of 1D int[], so it
//becomes 2-D array.


class Test1{
	//eg1::
    public void methodOne(int... x){
       for(int data: x){
          System.out.println(data);
          //In the above pgm x is treated as One-D array.
       }
    }
  //eg2::
    public void method1(int[]... x){
    	 for(int[] OneD: x){
    	    for(int element:OneD){
    	       System.out.println(element);
    	       //In the above program x is treated as 2D array
    	    }
    	 }
    }
}
public class SingleDimensionArray_Vs_VarArgmethod3 {

	public static void main(String[] args) {
		//eg1 calling
		Test1 t= new Test1();
		t.methodOne(10,20,30);
		
		System.out.println();
		
		//eg2 calling
		Test1 t1= new Test1();
		 int[] a= {10,20,30};
		 int[] b= {30,40};
		 t1.method1(a,b);
	}
}
