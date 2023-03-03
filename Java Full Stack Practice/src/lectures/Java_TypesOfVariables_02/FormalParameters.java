package lectures.Java_TypesOfVariables_02;
/***
 * Formal Parameters 
 * ==================== 
 * The formal parameters of the method
 * would be local variables of the method, so it is possible to make those
 * variables as final. If we declare formal parameters as final then we cannot
 * change the value of those variables within the method.
 */
public class FormalParameters {
		   public static void add(final int a,int b){
			//a=100;//CE
			b=200;
			System.out.println(b);
		   }

		   public static void main(String... args){
			  add(10,20);
		  }
}
