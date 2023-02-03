package lectures.VarArgs_Method_17;

/*newInstance( )
============
newInstance( ) is a method , present in class Class , which can be used to create
an object .
We can use the newInstance( ) method , If we don't class name at the beginning and
available dynamically Runtime.
Object o=Class.forName(arg[0]).newInstance( );
If the corresponding .class file not available at Runtime then we will get
RuntimeException saying ClassNotFoundException , It is checked.
To used newInstance( ) method the corresponding class should compulsory contain no
argument constructor , Other wise we will get
RuntimeException saying InstantiationException. */

class Student {
	public Student () {
		System.out.println("This is Constrauctor");
	}
}
public class NewInstance_Method8 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Take the input of the classname for which object has to be created at the runtime
		String className = args[0];
		//Load the class file explicitly
		Class c = Class.forName(className);
		//for the loaded class object is created using zero param constructor only
		Object obj = c.newInstance();//The method newInstance() from the type Class is deprecated since version 9
		//Perform type casting to get Student Object
		Student std = (Student)obj;
		System.out.println(std);

	}

}
