package lectures.Assignments.Assignment2;

public class Fifth_Program {

	public static void main(String[] args) {
		
		//Q-5> WAP to sort an array using Selection Sort Algorithm.
		
		int [] a = {67,45,8,34,7,26,12,9,18,5};
		int min;
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					min = j;
				}						
			}
			
			temp = a[min];
			a[min]=a[i];
			a[i]=temp;			
			
		}
		System.out.println("The Shorted Array (Selection Sort) : ");
		for(int elem:a)
		System.out.print(elem + " ");

	}

}
