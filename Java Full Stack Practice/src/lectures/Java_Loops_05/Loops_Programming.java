package lectures.Java_Loops_05;

import java.util.Scanner;

public class Loops_Programming {

	public static void main(String[] args) {
	    // Q > print the sum of n natural number
		
//		       Scanner sc = new Scanner (System.in);
//		       System.out.println("Enter the Number : ");
//		       int n = sc.nextInt();
//		
//		       int sum = 0 ;;
//		       for(int i = 1 ; i <= n ; i++) 
//		       {
//			   sum = sum + i;
//		       }
//		System.out.println("The sum of "+ n + " Natural Number: " + sum);

		// Q > Write a program that prompts the user to input a positive integer. 
//		       It should then print the multiplication table of that number. 
		
//				Scanner sc = new Scanner (System.in);
//				System.out.println("Enter any Positive Integer Number : ");
//				int n = sc.nextInt();
//				if(n > 0){
//				     int table;
//				     System.out.println("The Table of " + n + " is :" );
//				     for(int i = 1 ; i <= 10 ; i++) {
//					      table = n * i;
//					      System.out.println(n + " * " + i + " : " + table);
//			         }
//	            }
//	             else {
//		              System.out.println("Invalid Input!! Plese enter an Integer number to get Table of that");
//	             }
		        
	
        //Print all even numbers till n.
//				Scanner sc = new Scanner (System.in);
//				System.out.println("Enter the Number : ");
//				int n = sc.nextInt();
//				
//				System.out.println("The total even number present in " + n + " is :" );
//				for(int i = 1 ; i <= n ; i++) {
//						if(i % 2 == 0) {
//						   System.out.println(i);
//						}
//				}
//			
		
//		//Print all Odd numbers till n.
//		        Scanner sc = new Scanner (System.in);
//		        System.out.println("Enter the Number : ");
//		        int n = sc.nextInt();
//		
//		        System.out.println("The total odd number present in " + n + " is :" );
//		        for(int i = 1 ; i <= n ; i++) {
//				     if(i % 2 == 0) {
//				        continue;  //do nothing ,continue the loop again
//				     }
//				     
//				     System.out.println(i);
//		        }
		
		
		//Run This and See what happened
		
//		        for(; ;) {
//                   System.out.println("Swarup");
//              }
		
//		        for(int i = 0; ;i ++) {
//                     System.out.println("Swarup");
//               }
		
		
	  // Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//		 If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//		 If they enter 0 then stop.
//		 If he/ she scores :
//		 Marks >=90 <=100 -> print “This is Good”
//		 89 <= Marks >= 60 -> print “This is also Good”
//		 59 <= Marks >= 0 -> print “This is Good as well”
//			Because marks don’t matter but our effort does.
//		 (Hint : use do-while loop but think & understand why)
		
//		         Scanner sc = new Scanner(System.in);
//		         int input;
//		         do {
//		        		 System.out.println("Enter marks of  subject out of 100 : ");
//		        		 int marks = sc.nextInt();
//		        		 if (marks >= 90 && marks <= 100) {
//		        			 System.out.println("This is Good");
//		        		 }
//		        		 else if (marks <=  89 && marks >= 60) {
//		        			 System.out.println("This is also Good");
//		        		 }
//		        		 else if (marks <=  59 && marks >= 0) {
//		        			 System.out.println("This is Good as well");
//		        		 }
//		        		 else {
//		        			 System.out.println("Invalid");
//		        		 }
//		        		 
//		        		 System.out.println("Want to continue? Yes(Press 1) or No (Press 0): ");
//		        		 input = sc.nextInt();
//		         } while (input == 1 );
//		         System.out.println("Stoping the Program!! you have chosed 0 or other number");
		
		
	    // Write a program to find the factorial value of any number entered through the keyboard. 
		         

//		         Scanner sc = new Scanner(System.in);
//                 int fact = 1; // To hold factorial
//        
//                 System.out.print("Enter any positive integer: ");
//                 int num = sc.nextInt();
//       
//                 for(int i=1; i<=num; i++)
//                 {
//                   fact = fact * i;
//                 }
//        
//                 System.out.println("Factorial: "+ fact);
		
		//Two numbers are entered through the keyboard.
//		   Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

//		         Scanner sc = new Scanner(System.in);
//		         System.out.println("Enter a number:  ");
//		         int base = sc.nextInt();
//		         System.out.println("Enter a number for the power you want:  ");
//		         int power = sc.nextInt();
//		         int result = 1;
//		         for(int i = 1; i <= power ; i++) {
//		        	  result = result * base;
//		         }
//		         System.out.println("The Power" + "(" + power + ")" +" of base "+ base + " is :"+ result);
		         

		//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
//		  For example, if the input is 12345, the output should be 54321.
		
//		         Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter a number you want reverse :  ");
//                 int num = sc.nextInt();
//                 System.out.println("The reversed number is : ");
//                 for(int i = num; i >= 1 ; i--) {
//       	            System.out.print(i + " ");
//                 }

		
		//Write a program that reads a set of integers, 
//		   and then prints the sum of the even and odd integers.
		
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter a number you want sum of all odd and even :  ");
//                 int num = sc.nextInt();
//                 int sum = 0;
//                 int sum1 = 0;
//                 for(int i = 1 ; i <= num ; i++) {
//                	 if(i % 2 == 0) {
//                		 sum = sum + i;
//                	 }
//                	 else {
//                		 sum1 = sum1 + i;
//                	 }
//                 }
//                 System.out.println("Sum of all Even Number is :  " + sum);
//                 System.out.println("Sum of all Odd Number is :  " + sum1);
		
		//Write a program that prompts the user to input a positive integer. 
//		  It should then output a message indicating whether the number is a prime number.
		
//		          Scanner sc = new Scanner(System.in);
//		          System.out.println("Enter the Number to Check Prime  : ");
//		          int num = sc.nextInt();
//		          
//		          int temp = 0;
//		          for (int i = 2; i < num; i++) {  //you can also add num/2 for time complexity
//		        	  if (num % i == 0) {
//		        		  temp++;
//		        	  }
//		          }
//		          if (temp > 0) {
//		        	  System.out.println("This is not a Prime number");
//		          }
//		          else if(num <= 1) {
//		        	  System.out.println("This Number is not a Prime nor Composite");
//		          }
//		          else {
//		        	  System.out.println("This is a Prime Number");
//		          }
		          
		// Write a program to calculate HCF of Two given number.
		          //Logic One
//		          Scanner sc = new Scanner(System.in);
//		          System.out.println("Enter two number : ");
//		          int a = sc.nextInt();
//		          int b = sc.nextInt();
//		          int gcd = 0;
//		          for(int i = 1; i <= a ; i++) { //In this logic loop will be executed what ever number you give, that much time. you can give b in the condition area
//		        	  if(a%i == 0 && b%i==0) {  //you can give b in the condition area
//		        		  System.out.println(i);
//		        		  gcd = i;
//		        	  }
//		        	  
//		          }
//		          System.out.println("GCD : "+gcd);
//		
		
//		          Scanner sc = new Scanner(System.in);
//                  System.out.println("Enter two number : ");
//                  int a = sc.nextInt();
//                  int b = sc.nextInt();
//                  while(a % b != 0) { //In this logic loop will be executed only TWO time.
//      	              int r = a % b;
//      	              a = b;
//      	              b = r;
//      	          }
//                  System.out.println("GCD : "+b);

//		Write a do-while loop that asks the user to enter two numbers. 
//		The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so,
//		the loop should repeat; otherwise it should terminate.
		
//		Scanner sc = new Scanner(System.in);
//	     
//        int number1, number2;
//        char choice;
//        
//        do
//        {
//            System.out.print("Enter the first number ");
//            number1 = sc.nextInt();
//          
//            System.out.print("Enter the second number ");
//            number2 = sc.nextInt();
//            
//            int sum = number1 + number2;
//            System.out.println("Sum of numbers: " + sum);
//        
//            System.out.print("Do you want to continue y/n? ");
//            choice = sc.next().charAt(0);
//            
//            System.out.println();
//            
//        }while(choice=='y' || choice == 'Y');
//        System.out.println("exiting the program");
		
		
//		Write a program to enter the numbers till the user wants,
//		and at the end it should display the count of positive,
//		negative and zeros entered.
		
//		 Scanner console = new Scanner(System.in);
//	        
//	        int number,          
//	            countPositive = 0, 
//	            countNegative = 0,
//	            countZero = 0;
//
//	        char choice;
//		
//	        do
//	        {
//	            System.out.print("Enter the number ");
//	            number = console.nextInt();
//	        
//	            if(number > 0)
//	            {
//	                countPositive++;
//	            }
//	            else if(number < 0)
//	            {
//	                countNegative++;
//	            }
//	            else
//	            {
//	                countZero++;
//	            }
//	        
//	            System.out.print("Do you want to continue y/n? ");
//	            choice = console.next().charAt(0);
//	            
//	        }while(choice=='y' || choice == 'Y');
//	        
//	        System.out.println("Positive numbers: " + countPositive);
//	        System.out.println("Negative numbers: " + countNegative);
//	        System.out.println("Zero numbers: " + countZero);
		
		
//		Write a program to enter the numbers till the user wants,
//		and at the end the program should display the largest and smallest numbers entered.	
		
//        Scanner console = new Scanner(System.in);
//        
//        int number;
//        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
//        int min = Integer.MAX_VALUE;  // Intialize min with maximum value
//
//        char choice;
//	
//        do
//        {
//            System.out.print("Enter the number ");
//            number = console.nextInt();
//        
//            if(number > max)  //number > min_value( for integer -2147483648)
//            {
//                max = number;
//            }
//            
//            if(number < min)  //number < max_value( for integer +2147483647)
//            {
//                min = number;
//            }
//        
//            System.out.print("Do you want to continue y/n? ");
//            choice = console.next().charAt(0);
//            
//        }while(choice=='y' || choice == 'Y');
//        
//        System.out.println("Largest number: " + max);
//        System.out.println("Smallest number: " + min);
		
    //Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//	  For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
		  int digit1,  // To hold first digit (Ones) of number 
            digit2,  // To hold second digit (Tens) of number
            digit3;  // To hold third digit (Hundreds) of number

        for(int number = 1; number <= 500; number++)
        {
           int temp = number;
           digit1 = temp % 10;

           temp = temp / 10;
           digit2 = temp % 10;
        
           temp = temp / 10;
           digit3 = temp % 10;

           if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
           {
             System.out.println(number);
           }
        }
		

        
        
        
	}

}
