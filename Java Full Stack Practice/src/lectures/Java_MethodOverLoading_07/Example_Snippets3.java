package lectures.Java_MethodOverLoading_07;


class Calculator2{
	
	float add(float a, int b){    //Compile Time Error Happened
		return a+b;
	}
	
	float add(int a, float b) {
		return  a+b;
		
	}
}

public class Example_Snippets3 {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
//		System.out.println(calc.add(10, 20));      //Here,we will get error(C.E).Becz,
	}                                          //there has both float a and int a to hold those int 10 value

}
