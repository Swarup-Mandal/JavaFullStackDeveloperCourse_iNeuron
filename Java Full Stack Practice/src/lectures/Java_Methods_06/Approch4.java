package lectures.Java_Methods_06;
//This is Approch 3(1.2) of writting a method

class Calculator4{
	   int res;
	   int add (int a , int b) {
		   res = a+b;
		   return res;                 //it is only return a integer value
	   }
}

public class Approch4 {

	public static void main(String[] args) {
		Calculator4 calc = new Calculator4();
		//calc.add();
		
		int receiver = calc.add(60,20);  //here we call method and recive also the integer data in an integer variable
		System.out.println(receiver); //print it


	}

}
