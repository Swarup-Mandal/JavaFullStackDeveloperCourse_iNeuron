package lectures.Assignments.Assignment2;

public class Third_Program {

	public static void main(String[] args) {
		
		//Q-3> WAP to sort an array using Bubble Sort Algorithm.
		
		int [] a= {1,3,7,2,6,5,9,8,66,76,45,30,43,36,88,99,106,66,0,56,-2,-23,-12};
		
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j+1]<a[j]) {
					
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
				}
			}	
		}
		
		System.out.println("The Sorted Array Is (Bubble Sort) : ");
		System.out.print("[");
		for(int b:a) {
			
			System.out.print(b +" ");
		}
		
		System.out.println("]");
	
	}

}


