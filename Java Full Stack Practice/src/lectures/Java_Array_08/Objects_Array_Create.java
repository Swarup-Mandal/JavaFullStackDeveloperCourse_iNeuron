package lectures.Java_Array_08;

class Fan {
	int cost;
	String brandName;
	int noOfWings;
}

public class Objects_Array_Create {

	public static void main(String[] args) {
		Fan[] f = new Fan[3];  //creating Array of Fan Class (object's)
		f[0] = new Fan(); //creating object of f[0] index means all te instance variable also get a unic name,and address in that f(0) index and we can access it
		f[1] = new Fan();  //also same for f[1] 
		f[2] = new Fan(); //also same for f[1] 
		
		
		//Calling and initializing instance variable of f[0] index's
		        f[0].cost = 1000;
		        f[0].brandName = "USHA FAN";
		        f[0].noOfWings = 3;
		
		//Calling and initializing instance variable of f[0] index's
				f[1].cost = 1200;
				f[1].brandName = "Hevells FAN";
				f[1].noOfWings = 4;
				
		//Calling and initializing instance variable of f[0] index's
				f[2].cost = 900;
				f[2].brandName = "KAMAL FAN";
				f[2].noOfWings = 3;
				
				
			System.out.println(f[0].cost +" "+ f[0].brandName +" "+f[0].noOfWings);
		
		
		
		 
		

	}

}
