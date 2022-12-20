package lectures.Java_Array_08;

public class SubSetOfAnotherArray {
	
	//Q-6> WAP to check whether an array is a subset of another array.

	static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
 
            if (j == m)
            return false;
        }
 
        return true;
    }

	public static void main(String[] args) {
		
		int arr1[] = { 10, 20, 50, 70, 90, 100 , 22 , 40};
        int arr2[] = { 10, 50, 90, 22, 100 };
    
        int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2 is subset of arr1 ");
        else
            System.out.print("arr2 is not subset of arr1 ");
	}

}
