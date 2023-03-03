package lectures.Java_ImportStatement_18;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

//To use Pattern class in our Program directly which import statement is required ?
 //import java.*; //invalid
 import java.util.*; //valid
 import java.util.regex.*; //valid(implicit import)
 import java.util.regex.Pattern;//valid(explicit import)

 

/*Case 1: Types of Import Statements:
There are 2 types of import statements.
1) Explicit class import
2) Implicit class import. */

/*Explicit class import:
Example: Import java.util.ArrayList ;
=> This type of import is highly recommended to use because it improves
readability of the code.
=> Best suitable for developers where readability is important.
Implicit class import:
Example: import java.util.*;
=> It is never recommended to use because it reduces readability of the code.
=> Best suitable for students where typing is important.*/

class MyArrayList extends java.util.ArrayList  //fully qualified name
{
	
} 

public class Basic_ImportStatement_1 {

	public static void main(String[] args) {
		 //ArrayList l=new ArrayList(); //Compile time error. we have to import package of ArrayList which is present in java.util package
		ArrayList l=new ArrayList();
		
		//Date d = new Date(); //The type Date is ambiguous if we import like import java.util.*; and import java.sql.*; also
		Date d = new Date(); //no error if we explicitly import Date to import java.util.Date; import java.sql.*;
		 
		


	}

}
