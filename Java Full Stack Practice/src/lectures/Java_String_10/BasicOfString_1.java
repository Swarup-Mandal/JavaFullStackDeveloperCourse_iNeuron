package lectures.Java_String_10;

public class BasicOfString_1 {

	public static void main(String[] args) {
		// Basic Syntax of String 
	//Case -1
		   //Immutable String
		String s1 = "Swarup";
		String s2 = new String ("Mandal");
		System.out.println(s1);
		System.out.println(s2);
		
		s1.concat("Tendulkar"); 
		System.out.println(s1); //give output swarup as above //new object created(swarup Tendulkar) here but ther is no ref var to collect so, Garbage Collector remove it
                   
		            //VS
		
		   //Mutable String
		StringBuilder s = new StringBuilder("sachin"); //string data created by StringBuilder class
		s.append("Tendulkar");
		System.out.println(s);
		
	//Case - 2
		 String s3 = new String("sachin");  //two String Object created with same value
		 String s4 = new String("sachin");
		 System.out.println(s3==s4); //false
		 System.out.println(s3.equals(s4));//true
		 
		             //VS
		 
		 StringBuilder s5 = new StringBuilder("sachin");  //two String Object created with same value
		 StringBuilder s6 = new StringBuilder("sachin");
		 System.out.println(s5==s6); //false
		 System.out.println(s5.equals(s6));//false also in StringBuilder bcz, it compare the reference not the content.same as == operator
		 
    //********SCP************
		 String s7=new String("dhoni");
		 String s8=new String("dhoni");
		 
		 System.out.println(s7==s8); //false as it is 
		 
		 String s9="dhoni";
		 String s10="dhoni";
		 
		 System.out.println(s9==s10);  //trur, in SCP no duplicate object allowed, if same object with same ref var then both will indicate the same object 
		
		 
	//Case - 3
		 String m =new String("sachin"); //How many object will be created? Ans - 2 object here ,
				// 1 for String Constatn with literal in SCP,and 1 for new keyword to creat a object in Heap area 
		
				  //VS
         String m1 ="sachin";  // Only 1 object will be created in SCP area for Direct Literal
       //---------
		 String n1=new String("dhoni"); //content same but ref var different,bcz both var is ref var and present in heap are
		 String n2=new String("dhoni");
		 
		 System.out.println(n1==n2);//false as it is
		 
		 String n3="dhoni";  //willstore and indicate in SCP. already dhoni is created for the first time(n1), it will not creat another one
		 String n4="dhoni";  
		 
		 System.out.println(n3==n4);//true , bcz both are direct literals and both will already present and will represent by only one content
	
	//Case - 4
		 String p = new String("sachin");  //schin in both area
		 p.concat("tendulkar"); //tendulkar will creat in SCP,sachintendulkar will creat in heap area,and also deleted by G.C
		 p=p.concat("IND"); //INd will creat in SCP(Literal), and sachinIND will creat in heap and p will indicating.so, previous sachin will be G.O
		 p="sachintendulkar"; //sachintendulkar will created only in SCP bcz,it Direct Literal.and also indicating by p .so, old p value sachinIND will be G.O

		 System.out.println(p);//output - sachintendulkar( the SCP one)
		 
		 //Q1>--------
		 String p1= new String("sachin"); //schin in both area
		 p1.concat("tendulkar");//tendulkar will creat in SCP,sachintendulkar will creat in heap area,and also deleted by G.C.so Now P1 is sachin
		 p1+="IND"; //p1 = sachin + IND =>p1 = sachinIND
		 String p2=p1.concat("MI"); //p2 = sachinINDMI
		 System.out.println(p1);
		 System.out.println(p2);
		 
		//Q1>--------
		 String q1=new String("you cannot change me!");
	     String q2=new String("you cannot change me!");
		 System.out.println(q1==q2); //false
		 String q3="you cannot change me!";
		 System.out.println(q1==q3);  //false
		 String q4="you cannot change me!"; 
		 System.out.println(q3==q4);//true
		 String q5="you cannot " + "change me!";  //Compiler already know the value,so, operation will done in compile time
		 System.out.println(q3==q5);//true
		 String q6="you cannot ";
		 String q7=q6+"change me!";  //variable (q6)come into picture, JVM did this expresion
		 System.out.println(q3==q7);//true
		 final String q8="you cannot ";  //Compile already know the final value so,operation will done compile time
		 String q9=q8+"change me!";
		 System.out.println(q3==q9);//true
		 System.out.println(q6==q8);//true
		 
	//Case - 5
		 //e.g - 1
		  String t1 =new String("sachin");// One in heap(s1) and the other one in SCP
		  String t2=t1.intern();//using s1 access object in SCP which has no reference
		  System.out.println(t1==t2);//false
		  String t3="sachin";
		  System.out.println(t2==t3);//true
		  
		  //e.g -2
		  String a1=new String("sachin");// One in heap(s1) and the other one in SCP
		  String a2=a1.concat("IND");// One in SCP(IND) and the other one in heap(s2)
		  String a3=a2.intern(); //true
		  String a4="sachinIND";
		  System.out.println(a3 == a4);//true
		  
		  //e.g:3
			  char[] ch = {'j','a','v','a'}; //Char type array
			  String b1 =new String(ch);
			  System.out.println(b1);//java
			  System.out.println();
			  
			  byte[] b = {65,66,67,68}; //iy gives 65 = A ... ASCII Value
			  String b2= new String(b);
			  System.out.println(b2);//"ABCD"
			  
			  StringBuilder sb =new StringBuilder("sachin"); //mutable
			  System.out.println("StringBuffer data is :: "+sb);
			  String b3 =new String(sb);// mutable becames immutable
			  System.out.println("String data is : "+b3);
			  
		  /*
		   * String class Constructor
             =======================
             String s =new String() => Creates an Empty String Object
             String s =new String(String literals) => Creates an Object with String literals on Heap
                   eg: String str = new String("sachin");
             String s =new String(StringBuffer sb) => Creates an equivalent String object for StringBuffer
             String s =new String(char[] ch) => Creates an equivalent String object for character array
             String s =new String(byte[] b) => Creates an equivalent String object for byte array
		   * */
		
			  
		/* 
		 * Important methods of String
          ===========================
          1.public char charAt(int index)  --> to get index value 
          2.public String concat(String str)  --->to add string value with a String vlaue
          3.public boolean equals(Object o)      ----> to check the content of String,and object reference of StringBuffer , StringBuilder
          4.public boolean equalsIgnoreCase(String s)
          5.public String subString(int begin)
          6.public String subString(int begin,int end)
          7.public int length()    ---> to get exact length of a string(char type array)
          8.public String replace(char old,char new)
          9.public String toLowerCase()
         10.public String toUpperCase()
         11.public String trim()
         12.public int indexOf(char ch)
         13.public int lastIndexOf(char ch)
		 * */

		 
		 
	
	
	
	
	}
}
