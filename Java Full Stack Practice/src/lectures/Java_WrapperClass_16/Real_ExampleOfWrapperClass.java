package lectures.Java_WrapperClass_16;

/*usage of Wrapper class in realtime coding
==================================
//WAP to take inputs from the command line and perform arithemetic operations
class Test
{
//valueOf() => Converts String/Primitive to Wrapper type
//xxxValue() => Converts Wrapper type to Primitive type
//parseXXX() => converts String to primitive type
//commandline arguments => String inputs = args[0],args[1]
*/
public class Real_ExampleOfWrapperClass {

	public static void main(String[] args) {
		
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);
		System.out.println(i1+i2);
		System.out.println(i1-i2);
		System.out.println(i1*i2);
		System.out.println(i1/i2);
		//args -> String, convert into primitive type and process
		}
}
