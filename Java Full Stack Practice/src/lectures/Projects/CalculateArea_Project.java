package lectures.Projects;
import java.util.Scanner;

abstract class Shape{
	public float area;
	abstract public void takingInput();
	abstract public void calculateArea();
	public void display() {
		System.out.println("The Area is : "+area);
	}
}
//Normal class for polymorphism
class GetShape{
	public void getShape(Shape shape) {
		shape.takingInput();
		shape.calculateArea();
		shape.display();
	}
}
//Rectangular
class Rectangular extends Shape{
	 float length;
	 float breadth;
	 public void takingInput() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Length of Rectangular");
		 length = sc.nextFloat();
		 System.out.println("Enter Breadth of Rectangular");
		 breadth = sc.nextFloat(); 
	 }
	 public void calculateArea() {
		 area = (length * breadth);
	 }
}
//Circle
class Circle extends Shape{
	 float redius;
	 final float pi = 3.14f;
	 public void takingInput() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Redius of Circle");
		 redius = sc.nextFloat(); 
	 }
	 public void calculateArea() {
		 area = pi * (redius*redius);
	 }
}
//Squre
class Squre extends Shape{
	 float side;
	 public void takingInput() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter side of Squre");
		 side = sc.nextFloat();
		  
	 }
	 public void calculateArea() {
		 area = (side*side);
	 }
}
public class CalculateArea_Project {
     public static void main(String[] args) {
    	 //Creating all shape's object
    	 Rectangular rs = new Rectangular();
    	 Circle cs = new Circle();
    	 Squre ss = new Squre();
    	 
    	 //creating GetShape object
    	 //applying polymorphism
    	 GetShape gs = new GetShape();
    	 gs.getShape(rs);
    	 gs.getShape(cs);
    	 gs.getShape(ss);
    	 
     }
 }

////Calculating Are of rectangular,circle,squre by simple method concept(basic) **Not Recommended by doing this normalway.
//package lectures.Projects;
//import java.util.Scanner;
////Rectangular
//class Rectangular{
//	 float length;
//	 float breadth;
//	 float area;
//	 
//	 public void takingInput() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter Length of Rectangular");
//		 length = sc.nextFloat();
//		 System.out.println("Enter Breadth of Rectangular");
//		 breadth = sc.nextFloat(); 
//	 }
//	 public void calculateArea() {
//		 area = (length * breadth);
//	 }
//	 public void display() {
//		 System.out.println("The Total area of Rectangular is  : "+area);
//	 }
// }
////Circle
//class Circle{
//	 float redius;
//	 float area;
//	 final float pi = 3.14f;
//	 
//	 public void takingInput() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter Redius of Circle");
//		 redius = sc.nextFloat();
//		  
//	 }
//	 public void calculateArea() {
//		 area = pi * (redius*redius);
//	 }
//	 public void display() {
//		 System.out.println("The Total area of Rectangular is  : "+area);
//	 }
//}
////Squre
//class Squre{
//	 float side;
//	 float area;
//	 
//	 public void takingInput() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter side of Squre");
//		 side = sc.nextFloat();
//		  
//	 }
//	 public void calculateArea() {
//		 area = (side*side);
//	 }
//	 public void display() {
//		 System.out.println("The Total area of Rectangular is  : "+area);
//	 }
//}
//public class CalculateArea_Project {
//	public static void main(String[] args) {
//		Rectangular r = new Rectangular();
//		r.takingInput();
//		r.calculateArea();
//		r.display();
//		
//		Squre s = new Squre();
//		s.takingInput();
//		s.calculateArea();
//		s.display();
//		
//		Circle c = new Circle();
//		c.takingInput();
//		c.calculateArea();
//		c.display();
//		System.out.println("This is not Recommended");
//		
//		
//	}
//}
