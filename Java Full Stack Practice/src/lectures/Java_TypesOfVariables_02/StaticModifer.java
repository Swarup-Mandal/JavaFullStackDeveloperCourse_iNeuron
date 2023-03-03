package lectures.Java_TypesOfVariables_02;

/***static modifer
=============
   It is applicable for methods and variables.
   It is not applicable for classes at the topmost level, at the inner most level it 
   is applicable.
     instance variables ==> for every instance
     static variables   ==> for one class.
*/

/*
 * Note:: 
 * 
 * static area ======> static variables(valid), instance varaibles(X)
 * 
 * instance area =====> instance variables(valid) static variables(valid)
 */

class Test{
	static int x=10;
        int y=20;
        
}

//eg1::
//class Test{ 
//    int x=10;   //instance var
//    public void methodOne(){   //instance area
//	       System.out.println(x);//10
//    }
//}
//
//eg2::
//class Test{
//	int x=10;  //instance var
//      public static void methodOne(){  //static area
//	       System.out.println(x);//CE
//      }
//}
//
//eg3::
//class Test{  
//    static int x=10;   //static var
//    public void methodOne(){         //Instance area
//	     System.out.println(x); //10
//    }
//}
//
//eg4::
//class Test{ 
//    static int x=10;     //static var
//    public static void methodOne(){     //static area
//	System.out.println(x);//10
//    }
//}
//
//eg5::
//class Test{
//	  int x=10;
//	  static int x=100; //CE
//}
public class StaticModifer {
	final static String b =  "বাংলা ভাষা";//      ;
     //using UTF format char = 16 bit we can write string,identifiers and coments in diff language like bengali,marathi
	public static void main(String[] args) {
		Test t1=new Test();
		t1.x=888;
        t1.y=999;

        Test t2=new Test();
		System.out.println(t1.x +" "+ t1.y);//888  999
        System.out.println(t2.x +" "+ t2.y);//888   20     
        System.out.println(b);

	}

}
