package lectures.Java_MethodOverLoading_07;

import java.util.Arrays;

public class Parent{
    public static void main(String[] args) 
    {
//    	double[] a=new double[10];
//        a[0]=97;
//        a[1]='a';
//        byte b= 10;
//        a[2]=b;
//        short s=25;
//         a[3]=s;
//         a[4]=10L;
//         a[5]=34.6f;
//         a[6]=45.6;
//         
//         for (double elem : a) {
//        	 System.out.println(elem);
//         }
//         
//         Object[] obj=new Object[5];
//         obj[0] =new Object();//valid
//         obj[1] =10;//valid
//         obj[2] =new String("sachin");//valid
//         obj[3] ="sachin";
//         
//         Runnable[] r=new Runnable[5];
//         r[0]= new Thread("sachin");
//        // r[1]= new Runnable("sachin");
//         //r[1]= new String("dhoni");//CE
//         
//         int[] p= {10,20,30,40};
//         int[] q= {100,200};
//         int[] t = {45,67,67};
//         p=q;
//         for (int elem : p) {
//        	 System.out.print(elem + " , ");
//         }
//         System.out.println();
//         for (int elem : q) {
//        	 System.out.print(elem + " , ");
//         }
//         System.out.println();
//
//         q=t;
//         for (int elem : q) {
//        	 System.out.print(elem + " , ");
//         }
//         System.out.println();
//         for (int elem : t) {
//        	 System.out.print(elem + " , ");
//         }
//         System.out.println();
//	System.out.println("String[] main method");
//	
//    	int[] a,b;  // a-> 1D, b-> 1D
//    	 int a[],b[]; // a-> 1D, b->1D
//    	 int a[],b;   // a-> 1D, b-> normal variable
//    	 int a[],[]b; //CE
//    	 int a,[]b;   //CE
//    	 int []a,[]b; //CE
   // 	 int[] []a = {{58},{75}},b[] = {{{78}},{{87,85}}};
    //	int []a,b[];
    	int[] a[] ={{10,20,30},{100,200},{1000},{40,50,60,70}};
    	System.out.println(a);
    	System.out.println(a[0][0]);
    	System.out.println(a[0]);
    	System.out.println(a[1]);
    	System.out.println(a[2]);
    	System.out.println(a[3]);
    	//System.out.println(a[4]);
    	//new int[]{10,20,30,40};
    	
    	add(new int[]{10,20,30,40});
		add(new int[]{10,20});
		add(new int[]{});
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int data : arr) {
		    System.out.print(data);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));//[10, 20, 30, 40, 50]
	
		  int[] arr1 = { 10, 20, 30, 40, 50 };
		  int[] duplicateArray = Arrays.copyOf(arr1, arr1.length);
		  System.out.println(Arrays.toString(duplicateArray));
		  int[] arrr = new int[] {10,40};
		  

    }
    	public static void add(int[] a){
    		int sum=0;
    		for(int i=0;i<a.length;i++){
    			sum+=a[i];
    		}
    		
    		System.out.println("The sum is ::"+sum);
    	}
}
