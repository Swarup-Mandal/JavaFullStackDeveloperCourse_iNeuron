package lectures.Java_Array_08;

public class SelectionSortForArray {

	public static void main(String[] args) {
		
		//Q-5> WAP to sort an array using Selection Sort Algorithm.
		
		int [] a = {67,45,8,34,7,26,12,9,18,5};
		int min_index;
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			min_index=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min_index]) {
					min_index = j;
				}						
			}
			
			temp = a[min_index];
			a[min_index]=a[i];
			a[i]=temp;			
			
		}
		System.out.println("The Shorted Array (Selection Sort) : ");
		for(int elem:a)
		System.out.print(elem + " ");

	}

}
