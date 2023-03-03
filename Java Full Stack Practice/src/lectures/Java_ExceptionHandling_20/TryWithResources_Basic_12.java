package lectures.Java_ExceptionHandling_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources_Basic_12 {

	public static void main(String[] args) {
		/*untill jdk1.6, it is compulsorily required to write finally block to close all the
		resources which are open as a part of try block.
		eg::*/ 
		
		//This is Totally wrong way to write try with resources
		
//		 BufferedReader br=null;
//		 try{
//		      br=new BufferedReader(new FileReader("abc.txt"));
//		 }
//		 catch(IOException ie){
//		      ie.printStackTrace();
//		 }
//		 finally{
//		    try
//		    {
//		      if(br!=null) {
//		       br.close();
//		      }
//		    }
//		    catch(IOException ie){
//		      ie.printStackTrace();
//		    }
//		 }
		
		//After 1.7 version it is enhanced
		
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt")))
		{
			//use br and perform the necessary operation
			//once the control reaches the end of try automatically br will be closed
		}catch(IOException ie){
			//handling code
				System.out.println("Exception Handled");
		}
		
		/*Rules of using try with resource
		================================
		1. we can declare any no of resources, but all these resources should be seperated
		with ;
		 eg#1.*/
		
//		 try(BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
//				 BufferedReader br2=new BufferedReader(new FileReader("abc.txt"));
//				    Scanner sc = new Scanner(System.in);){
//		      //use the resources
//			 System.out.println("Resource Used");
//		 }
		 
	  /*2. All resources are said to be AutoCloseable resources iff the class implements an
		 interface called "java.lang.AutoCloseable"
		 either directly or indirectly
		 eg:: java.io package classes, java.sql.package classes
		
		 public interface java.lang.AutoCloseable {
		         public abstract void close() throws java.lang.Exception;
		 }
		Note: which ever class has implemented this interface those classes objects
		are refered as "resources".*/
		 
		/*3. All resource reference by default are treated as implicitly final and hence we
		    can't perform reassignment with in try block.
		  
		 try(BufferedReader br5=new BufferedReader(new FileReader("abc.txt"))){
		       br5=new BufferedReader(new FileReader("abc.txt"));
		 }
		 
		 output::CE: can't reassign a value */		
		 
		 /*4. untill 1.6 version try should compulsorily be followed by either catch or
		      finally, but from 1.7 version we can take only take try with resources without cath or finally.
		   
		      try(R){
		         //valid
		      }
		 */
			
		 /*
			* 5. Advantage of try with resources concept is finally block will become dummy
			 * because we are not required to close resources explicitly. 
			 
			* 6. try with
			  resource nesting is also possible. 
			  try(R1){
			      try(R2){ 
			          try(R3){
			          
                       }
                   }
                }
			 
	    */


		 
		 
		 
		 
	}

}
