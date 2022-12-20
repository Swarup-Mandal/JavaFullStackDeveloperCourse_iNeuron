package lectures.Java_MethodOverLoading_07;
// Method Overloading in java
// -> Refers multple methods with same name and with different parmeters
//EarlyBinding / compile-time polymorphism
// Compiler resolve the comflict
  // a> Number of Parameters ,  b> Data type of the parameters, c> order of the data type of the parameters.


class Calculator3{
	
	int add(int a, int b){
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	float add(int a, float b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	
	float add(int a,float b,float c) {
		return a+b+c;
	}
	
	double add(int a,int b,double c) {
		return a+b+c;
	}
	
	double add (double a, double b, double c) {
		return a+b+c;
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();
		int a = 10, b = 20 , c = 30;   //all integer value manually given
		float m = 12.5f, n = 9.5f , o = 5.5f;  //all float value manually given   //you can also take input from user
		double x = 10.34, y = 3.456 , z = 5.453;//all double value manually given
		
		System.out.println(calc.add(a, b));   //int,int    ///**parameter variable name can be change it does not matter to give exact same name.
		System.out.println(calc.add(a, m));    //int ,float
		System.out.println(calc.add(a, n , o));  //int, f, f
		System.out.println(calc.add(m, n));      //f,f
		System.out.println(calc.add(a, b , x));  //int, int , double
		System.out.println(calc.add(x, y , o));   //d,d,f
		
	}

}
