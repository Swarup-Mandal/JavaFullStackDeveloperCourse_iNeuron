package lectures.Java_Methods_06;

//This is Approch 02 of writting a method

   class Calculator2{
	   int res;
	   void add (int a, int b) {
		   res = a+b;
		 //int res = a+b;  //we can create local variable also
		   System.out.println(res);
	   }
	   void display(){
		   int a = 20;    //not geeting error here bcz we use as local variable inside diplay()  methods
	   }
   }

public class Approch2 {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		calc.add(20, 30);

	}

}
