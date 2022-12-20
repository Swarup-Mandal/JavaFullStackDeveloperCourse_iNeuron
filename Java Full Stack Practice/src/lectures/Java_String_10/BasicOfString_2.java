package lectures.Java_String_10;

public class BasicOfString_2 {

	public static void main(String[] args) {
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
         11.public String toString()
         12.public int indexOf(char ch)
         13.public int lastIndexOf(char ch)
         14.public String trim()
		 * */
		
		//3. public boolean equals(Object o)
		String s ="java";
		System.out.println(s.equals("java")); //true
		System.out.println(s.equals("JAVA"));//false
		
		//4. public boolean equalsIgnoreCase(String s)
		System.out.println(s.equalsIgnoreCase("JAVA"));//true //totally igboring the case of letter
		System.out.println(s.equalsIgnoreCase("Java"));//true
		System.out.println();
		
		//5. public String substring(int begin)
		 System.out.print(s.substring(1));//searching from 1 to end of the string
		 System.out.println();
		 
		//6. public String substring(int begin,int end)
		 // It gives the String from the begin index to end-1 of the String.
		 System.out.print(s.substring(0,3));//searching from 0 to 2 (3-1) will happen
		 System.out.println();
		 System.out.println();
		 
	//e.g#1
		 String a ="sachinINDMI";
		 System.out.println(a.length());      //11
		 System.out.println(a.substring(9));  //MI
		 System.out.println(a.substring(0,8));//sachinIN
		 System.out.println(a.substring(0,9));//sachinIND
		 
		 //7. public int length()
		 System.out.println();

		 //8. public String replace(char old,char new)
		 String b="ababab";
		 System.out.println(b.replace('a','b')); //bbbbbb
		 
		 String name ="sbchin";
		 System.out.println(name.replace('b','a'));//sachin
		 System.out.println();
		 
		 //9. public String toLowerCase()
		 String name1 ="SACHIN TENdulkar";
		 System.out.println(name1.toLowerCase());  // SACHIN TENdulkar --> sachin tendulkar
		 
		//10. public String toLowerCase()
		 String name2 ="SACHIN TENdulkar";
		 System.out.println(name1.toUpperCase());  // SACHIN TENdulkar --> SACHIN TENDULKAR
		 
		 //e.g
		 String name3="sAchIn";//mixedCase
		 System.out.println(name3.toUpperCase());//SACHIN
		 System.out.println(name3.toLowerCase());//sachin
		 
		 //public String toString()
		 System.out.println(name3);// we are printing it
		 System.out.println(name3.toString());  //we can use that also, otherwish JVM internally use it when printing name3

		 System.out.println();
		 
		//e.g:
		//userdefined class
		 class Student{
		 String name4 = "sachin";
		 int id = 10;
		 }
		 Student std = new Student();
		 System.out.println(std);//Student@HexaDecimalValue  --> com.String_10.BasicOfString_2$1Student@5acf9800
		 System.out.println(std.toString());////Student@HexaDecimalValue -->com.String_10.BasicOfString_2$1Student@5acf9800
		 System.out.println();
		 String name5 =new String("dhoni");
		 System.out.println(name5);//dhoni
		 System.out.println(name.toString());//dhoni
		 
		 System.out.println();
		
	   //12. public int indexOf(char ch)
		 String d="sachinramesh";
		 System.out.println(d.indexOf('a'));//1 , it gives 1st occurence from left to right
		 System.out.println(d.indexOf('z'));//-1
		 
		 System.out.println();
		 
	   //13. public int lastIndexOf(char ch)
		 System.out.println(d.lastIndexOf('a'));//1 , it gives last occurance from left to right
		 System.out.println(d.lastIndexOf('z'));//-1
		 
		 System.out.println();

		//14. public String trim()
		 
		 String namee = "Sachin IND";
		 System.out.println(namee.length());//10
		 System.out.println(namee.trim());//Sachin IND
		 System.out.println();
		 String state = " Karnataka ";
		 System.out.println(state.length());//13
		 System.out.println(state.trim());//Karnataka  --> new object is created internally
		 System.out.println(state);//_ _Karnataka_ _, but it gives previous value , bcz no reference variable to collect
		
		 String state2 =new String(state); //Wrong way to collect ref var
		 System.out.println(state2);  //state =_ _Karnataka_ _
		 
		 String state3 =new String();
		 state3 = state.trim();   //Right way to collect ref var
		 System.out.println(state3);// karnataka
		 
		 String state4 = state.trim();//Right way to collect ref var
		 System.out.println(state4);// karnataka
		 
		 System.out.println();
		 
		 //Q 1 >
		 String nameee = "hyderAbbasbengaluru";
		 System.out.println();
		 System.out.println(nameee.indexOf('A'));//5
		 System.out.println(nameee.indexOf('a'));//8
		 System.out.println();
		 System.out.println(nameee.indexOf('b'));//6
		 System.out.println(nameee.lastIndexOf('b'));//10
		 System.out.println();
		 System.out.println(nameee.lastIndexOf('Z'));//-1
		 
		 System.out.println();
		 
		 //Predict the output
		// ===================
			    // Q 2>
				 String s1="sachin"; // s1,s3 -> sachin (scp) ***
				 String s2=s1.toUpperCase(); // s2->SACHIN(heap area) ***
				 String s3=s1.toLowerCase();// sachin (scp)
				 System.out.println(s1==s2);//false
				 System.out.println(s1==s3);//true
				 
				 System.out.println();
				 
				 //Q3> 
				 String s11="sachin"; // s1,s2-> sachin (SCP)
				 String s22=s11.toString(); //sachin (SCP)
				 System.out.println(s11==s22);//true
				 
				 System.out.println();
				 
				 //Q4>
				 String q1=new String("sachin"); //q1 --> 1--> heap, 1 scp
				 String q2=q1.toString(); // sachin in scp
				 String q3=q1.toUpperCase();//SACHIN in scp
				 String q4=q1.toLowerCase(); //q2,q4 =sachin in scp
				 String q5=q1.toUpperCase();//q3,q5 in heap
				 String q6=q1.toLowerCase();//q2,q4,q6 =sachin in scp
				 System.out.println(q1==q6);//true
				 System.out.println(q3==q5);//false


		

	}

}
