package lectures.Java_Interface_15;

/*What is the need of abstract class? can we create an object of abstract class, Does
it contains constructor?*/
//eg:: 1
class Parent {
	
   //Parent Class Constructor	
   Parent() {
     System.out.println("Parent " + this.hashCode());
   }
   
}
class Child extends Parent {
	
	//Child Class Constructor	
    public Child() {
    	super();
      System.out.println("Child " + this.hashCode());
    }
    
}

/*
 * Why abstract class can contain constructor where as interface doesnot contain
 * constructor?
 */

//eg#2.
abstract class Person{
    String name;
    int age;
    float height;
    int weight;
    //Constructor (variable intialization)
    Person(String name,int age,float height,int weight){
        super();
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
   }
}
class Student extends Person{  //Child class extends Parent class 
	//name;age;height;weight; all inharited from parent class
     int rollno;
     int marks;
     Student(String name,int age,float height,int weight,int rollno,int marks){
        super(name,age,height,weight);
        this.rollno=rollno;
        this.marks=marks;
     }
}

public class Interface_VS_AbstractClass {

	public static void main(String[] args) {
		//for eg:1
		Child c = new Child();//Child class object is created and hascode present only for child class 1175962212
		System.out.println("In Main Method " + c.hashCode());
		
		//for eg:2
		Person p = new Student("sachin",49,5.6f,71,10,100);
		System.out.println(p.name);
		

	}

}
