package lectures.Java_ExceptionHandling_20;
//UncheckedException --> Compiler will not force us to handle(It will not be checked during compile time)
//CheckedException--> it will be checked by compiler 

public class Throws_With_ThreadSleep_6 {
	public static void main(String[] args)throws Exception
	{
		System.out.println("Before sleepn");
		Thread.sleep(4000);  //thread sleeping for 4 sec
		System.out.println("after the nap");

	}

}
