package lectures.Java_ExceptionHandling_20;
class Demo1
{
	void disp()
	{
		try
		{
		System.out.println("Method started");
		System.exit(0);  //System.exit will dominate finally block
		}
		finally {
		System.out.println("Method ending");
		}
	}
}
public class LaunchFinally_SystemExit_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo1 d=new Demo1();
        d.disp();
	}

}

