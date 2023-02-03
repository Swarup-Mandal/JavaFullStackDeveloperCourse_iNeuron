package lectures.Java_Interface_15;

/*MarkerInterface
================
 => If an interface does not contain any methods and by implementing that
interface if our Object will get some ability such
type of interface are called "Marker Interface"/"Tag Interface"/"Ability
Interface".

 => example
 Serializable,Cloneable,SingleThreadModel.*/

interface Serializable{
}
class SampleImpll implements Serializable{
}
interface Cloneable{
}
class SampleImple implements Cloneable{
}

public class Marker_Interface_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
