package lectures.Java_Methods_06;
//This is Approch 3(1.2) of writting a method

class Calculator3{
	   int a,b,res;
	   int add () {
		   a = 10;
		   b = 20;
		   res = a+b;
		 //int res = a+b;                //we can create local variable also
		 //System.out.println(res);     //This method must return a result of type int
		   return res;                 //it is only return a integer value
	   }
}

public class Approch3 {

	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();
		//calc.add();
		
		int receiver = calc.add();  //here we call method and recive also the integer data in an integer variable
		System.out.println(receiver); //print it


	}

}
