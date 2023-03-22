package lectures.Java_MethodOverLoading_07;


class Calculator2{
	 public void methodOne(int... i){System.out.println("Var arg method");}
     public void methodOne(int i){System.out.println("Int arg method");}
	
	float add(float a, int b){    //10 will stored by doing implicite typecasting
		return a+b;
	}
	
	float add(int a, float b) {   //here, 10 will stored alsoas int so, Compiler facing ambiguty
		return  a+b;
		
	}
}

public class Example_Snippets3 {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
     	//System.out.println(calc.add(10, 20));      //Here,we will get error(C.E).Becz, //there has both float a and int a to hold those int 10 value
        calc.methodOne();
        calc.methodOne(10);
        calc.methodOne(10,20,30,40);
    }  
}

