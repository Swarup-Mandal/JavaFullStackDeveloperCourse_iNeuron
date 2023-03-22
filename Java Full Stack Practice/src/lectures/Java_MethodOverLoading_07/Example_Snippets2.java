package lectures.Java_MethodOverLoading_07;

//Method overloding with Numeric type promotion

class Calculator1{
	
	float add(float a, int b){    //Implicit type promotion  happen
		return a+b;
	}
	
	float add(float a, float b, int c) {
		return  a+b+c;
		
	}
}

public class Example_Snippets2 {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		System.out.println(calc.add(10, 20));      //Here, 10 is an integer and it implicitly stores in float  

	}

}
