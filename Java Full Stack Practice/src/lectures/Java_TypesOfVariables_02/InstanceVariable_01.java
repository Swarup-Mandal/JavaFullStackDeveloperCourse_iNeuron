package lectures.Java_TypesOfVariables_02;

/****
 * 1 > instance variables ================== 
 * ->Variables whose value changes from Object to object is called "instance variables". 
 * ->For every object seperated copy of instance variables will be created. 
 * ->Memory for these variables would be given on the heap area. 
 * ->So, jvm would perform initialisation with default values.
 ****/
/*
 * Note:: If we make instance variable as final, then compulsorily we should
 * perform initialisation explicitly jvm would not provide default values.
 * Whether we use or not otherwise we get compile time error.
 * 
 *** Rule::For final instance variable we should perform initalisation before constructor completion/call.
       a. At the time of declaration
       b. Inside instance block
       c. Inside constructor
 */
/***
 * eg1::At the time of declaration 
 *     class Test{
 *      final int i = 10; 
 *     }
 * 
 * eg2:: Inside instance block 
 *     class Test{ 
 *       final int i;
 *       { 
 *         i=100; 
 *       } 
 *     }
 * 
 * eg3::Inside constructor 
 *      class Test{
 *         final int i;
 *         Test(){
 *            i=10; 
 *         } 
 *      }
 * 
 * If we are initialising any where else it would result in compile time error.
 * class Test{ final int i; public void methodOne(){i=10;} //CE }
 */
class Student1{
    private String sname;
    private int sid;
    private int sage;

      public Student1(String sname,int sid,int sage){
	      this.sname=sname; this.sid=sid; this.sage=sage;
      }
}

public class InstanceVariable_01 {
	
	
		int i; //instance variable for InstanceVariable class
		 //System.out.println(i);   // CE: we can't print outside any method
		
		//final int v; // CE : blank final field v may not have been initialized
		final int v = 20;  //instance variable as final must be initialized.
		
		public void methodOne(){
			final int h;
			//inside a method instace variable can be directly accessed.
			System.out.println(i);//10 becoz it is an instance varaible	
			System.out.println(v);
			//System.out.println(h); //CE: The local variable h may not have been initialized
			h = v;
			System.out.println(h);
		}
			
		public static void main(String[] args) {
			
			Student1 s1= new Student1("sachin",10,49); //here for s1 and s2 diff diff instance variable is created
			Student1 s2= new Student1("dhoni",7,41);
			System.out.println(s1);//it will give the hash code of he object internally calling toString().
			
//			System.out.println(i);   //CE: we Cannot make non-static field i in to a static reference/method.
			                         //instance variable can't be accessed directly in static context
			
			System.out.println(new InstanceVariable_01()); //it gives me hash code internally calling object class toString();
			System.out.println(new InstanceVariable_01().i);//0 by default jvm will give for instance variable.
			                                        //by hashcode => InstanceVariable@4617c264.i is calling
			                 //or
			InstanceVariable_01 t=new InstanceVariable_01(); //Object created and that object is collected by t reference variable
			System.out.println(t.i); //10
			t.methodOne();
			//System.out.println(h); //h is local variable bcz it is present inside method so we can't access out side our method
			
		}
		

}
