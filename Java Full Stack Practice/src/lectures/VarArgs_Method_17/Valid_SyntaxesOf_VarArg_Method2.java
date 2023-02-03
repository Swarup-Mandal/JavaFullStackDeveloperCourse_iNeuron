package lectures.VarArgs_Method_17;
//case 5 example
class Test
{
    public void methodOne(int ...i){System.out.println("Var arg method");}
    public void methodOne(int i){System.out.println("Int arg method");}
    public void methodOne(int i,int x){System.out.println("Int arg method");}
}
public class Valid_SyntaxesOf_VarArg_Method2 {

	public static void main(String[] args) {
		/*
		 * case1 ===== Valid Signatures 
		 * 1.public void methodOne(int... x) 
		 * 2.public void methodOne(int...x) 
		 * 3.public void methodOne(int ...x)
		 */
		
		/*
		 * case2 ===== We can mix normal argument with var argument 
		 * public void methodOne(int x,int... y) 
		 * public void methodOne(String s,int... x)
		 */
		
	   /*case3
		 =====
		 While mixing var arg with normal argument var arg should be always last.
		 public void methodOne(int... x,int y); (invalid)
	  */
		
	   /*case4
		=====
		In an argument list there should be only one var argument
		public void methodOne(int... x,int ...y); (invalid)
	  */
		
//		case5
//		=====
//		We can overload var arg method, but var arg method will get a call only if none of
//		matches are found.
//		(just like default statement of switch case)
//		eg::
		Test t= new Test();

		t.methodOne(10);//Int arg method
		t.methodOne();//Var arg method
		t.methodOne(10,20);//Int arg method
		t.methodOne(10,20,30);//var arg method
		
		/*case6
		=====
		public void methodOne(int... x) => it can be replace as int[] x
		
		*/
		
		/*
		 * case7 
		 * ===== 
		 * public void methodOne(int... x) //==> internally (int... x) =>to  (int [] x)
		 * public void methodOne(int[] x)
		 * output:: CE because we cannot have two methods with same signature.
		 */
		

	}

}
