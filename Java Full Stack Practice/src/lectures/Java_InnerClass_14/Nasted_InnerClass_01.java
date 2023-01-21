package lectures.Java_InnerClass_14;

class OuterClasss{
	private int num; 
	public void show() {     
		System.out.println("in show : " + num );
	}
	
	//creating Inner Class
	class InnerClasss{
		public void config() {
			System.out.println("In Config " + num);
		}
	}
}
public class Nasted_InnerClass_01 {

	public static void main(String[] args) {
		OuterClasss obj = new OuterClasss();
		obj.show();  //this is is fine
		//obj.config();    // X
		
//		InnerClasss obj1 = new InnerClasss();   // X
//		obj1.config();
		
		OuterClasss.InnerClasss obj1;   //telling that InnerClass is belongs to OuterClass
		obj1 = obj.new InnerClasss();  //if InnerClass is non-static 
		          //Or
		OuterClasss.InnerClasss in = new OuterClasss().new InnerClasss();
		obj1.config();

	}

}
