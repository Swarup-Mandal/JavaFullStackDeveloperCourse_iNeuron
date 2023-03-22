package lectures.Java_Conditional_Statements_04;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 100;
//		switch(number) {		
//		case 60: System.out.println("1st case "); 
//		case 50: System.out.println("2nd case ");
//		case 30: System.out.println("3rd case ");
//		
//		case 100: System.out.println("4th case ");
//		case 80: System.out.println("5th case ");
//		case 70: System.out.println("6th case ");
//		
//		default: System.out.println("No Such Case Matching");
//		}
		/*
		 * Output---> 4th case 
		 *            5th case 
		 *            6th case 
		 *            No Such Case Matching
		 */
	
		
		switch(number) {
	case 60: System.out.println("1st case ");
	break;
	case 50: System.out.println("2nd case ");
	break;
	case 30: System.out.println("3rd case ");
	break;
	
	case 100: System.out.println("4th case "); //Output = 4th case 
	break;
	case 80: System.out.println("5th case ");
	break;
	case 70: System.out.println("6th case ");
	break;
	
	default: System.out.println("No Such Case Matching");
		}
		
	}

}
