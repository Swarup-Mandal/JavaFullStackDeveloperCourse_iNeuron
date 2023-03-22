package lectures.Java_MethodOverLoading_07;

class Test
{
   public void methodOne(){
	   System.out.println("Zero arg method");
   }
   public void methodOne(int i){
	   System.out.println("Int arg method");
   }
   public void methodOne(Double f){
	   System.out.println("Float arg method");
   }
}
public class Snippets1 {

	public static void main(String[] args) {
		Test t= new Test();
         t.methodOne(10);
         t.methodOne();

        Test t1=new Test();
         t1.methodOne(22.5);

	}

}
