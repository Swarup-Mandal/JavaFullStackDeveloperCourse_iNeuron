package lectures.Java_TypesOfVariables_02;

public class InstanceVariable {
	
		int i=10; //instace variable
		
//			System.out.println(i);   // CE:
			
			public void methodOne(){
				//inside instance method instace variable can be directly accessed.
				System.out.println(i);//10 becoz it is an instance varaible	
			}
			
		
		
			
		public static void main(String[] args) {
//			System.out.println(i);   //CE: instance variable can't be accessed directly in static context
			InstanceVariable t=new InstanceVariable(); //Object created i = 10 is stored in heap area
			System.out.println(t.i); //10
			t.methodOne();
			
		}
		

}
