package lectures.Java_LanbdaExpression_Funtional_Interface_19;

//@FunctionalInterface
interface Demo
{
	void disp();
	void add(int a, int b);
}
/*
* class Trial implements Demo 
* { 
*     public void disp() {
*          System.out.println("Hello Java Lovers"); 
*     } 
* }
*/
public class BasicOf_LambdaExpression_1 {
      
    public static void main(String[] args) {  
	  
    	Demo demo=new Demo() {
		
		public void disp()
		{
			System.out.println("Hello");
		}
		public void add(int a, int b)
		{
			int c=a+b;
			System.out.println(c);
		}
	};
	demo.disp();
	demo.add(10, 20);
	/*//Traditional way (implements)
	 * Trial t=new Trial(); 
	 *   t.disp();
	 */
	
	//Lamda Expression----------->
    //Demo d= ()->System.out.println("Hello iNeuron learners");		
    //d.disp();

  }
}
