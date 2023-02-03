package lectures.Java_WrapperClass_16;

final class Test{
   private final int i;
   
   Test(int i){
       this.i = i;
   }
   public Test modify(int i){   ///you can modify   ->has core logic of immutable 
          if (this.i == i)
                return this;
          else
                return new Test(i);
    }
}

public class ImmutableClass_2 {

	public static void main(String[] args){
	    Test t1 = new Test(10);
	    Test t2 = t1.modify(10);
	    Test t3 = t1.modify(100);
	    Test t4 = t3.modify(100);
	    System.out.println(t1==t2);//true
	    System.out.println(t1==t3);//false
	    System.out.println(t2==t3);//false
	    System.out.println(t3==t4);//true
	}

}
