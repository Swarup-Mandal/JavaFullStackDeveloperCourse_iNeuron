package lectures.Java_OOPs_Concepts_11.Encapsulation_1;
 class Test{
	 private String name;
	 private int rollno;
	 private float marks;
	 
	 public void takingInput(String name,int rollno, float marks) {
		 this.name=name;
		 this.rollno =rollno;
		 this.marks=marks;
	 }
	 public String getIngInput(){
		 return name;
//		 return rollno;
//		 return marks
//		 System.out.println(name);
//		 System.out.println(rollno);
//		 System.out.println(marks);
	 }
 }
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//t.name = "Swarup";
		t.takingInput("Swarup", 78, 98.99f);
		System.out.println(t.getIngInput());;

	}

}
