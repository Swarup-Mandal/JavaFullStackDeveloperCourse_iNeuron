package lectures.VarArgs_Method_17;

public class New_Operator_Or_Keyword7 {

	/*new Vs newInstance( )
	==================
	1. new is an operator to create an objects , if we know class name at the beginning
	then we can create an object by using
	 new operator .
	2. newInstance( ) is a method presenting class " Class " , which can be used to
	create object.
	3. If we don't know the class name at the beginning and its available dynamically
	Runtime then we should go for
	 newInstance() method */
	 
	/*
	 * new === new is an operator , which can be used to create an object. We can
	 * use new operator if we know the class name at the beginning. Test t= new
	 * Test( ); If the corresponding .class file not available at Runtime then we
	 * will get RuntimeException saying NoClassDefFoundError,It is unchecked. To
	 * used new operator the corresponding class not required to contain no argument
	 * constructor.
	 */
	
	/*
	 * Note: The Actuall Process of a new keyword step by step---------->
	 *  new will create a memory on the heap area 
	 *  Student => JVM will search for Student.class file in
	 * Current Working Directory if found load the .class file data into MethodArea
	 * During the loading of .class file a. static variables will get memory set
	 * with default vaalue b. static block gets executed In the heap area, for the
	 * required object memory for instance variables is given jvm will set the
	 * default values to it a. Execute the instance block if available b. call the
	 * constructor to set the meaningful values to the instance varaibles. JVM will
	 * give the address of the object to hashing algorithm which generates the
	 * hashCode for the object and that hashCode will be returned as the reference
	 * to the programmer new => requried class details known to compiler but not
	 * available at jvm then it would result in "NoClassDefFoundError" newInstance()
	 * => requried class details not available at jvm then it would result in
	 * "ClassNotFoundException
	 */
	
}
