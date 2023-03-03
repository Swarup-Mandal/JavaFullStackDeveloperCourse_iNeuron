package lectures.Java_Operators_03_02;

public class Increment_Decrement_Operator {

	public static void main(String[] args) {
		
	//Increment ---------->
		   //Post Increment (1st use it/print it / give it then increment it by 1
		int a = 10;
		a = a + 1;
		System.out.println(a); //11
		a++;
		System.out.println(a);//12
		System.out.println(a++);//it will print a= 12 but actually a=13 after incrementation
		System.out.println(a);//13
		
		int b = 5;
		int c = b++; //  c=5 ,bcz b will give the 5 to c then in the next line b will incremented by 1
		System.out.println(" increment "+ b); //b=6  bcz  b++ hapened
		System.out.println(c);//c=5 bcz b=>5
		
		   //Pre Increment
		int g=10;
		System.out.println(g);          //10
		++g;                           //print 11 use 11
		System.out.println(g);         //11
		System.out.println(++g);       //inc 12 prnt it then use g=12
		System.out.println(g);         //g=12
		
   //Decrement ---------------->
		
		      //Post Decrement
				int d = 10;
				d = d - 1;  //--->
				System.out.println(d); //9
				d--;
				System.out.println(d);//8
				System.out.println(d--);//8 but actually d=7
				System.out.println(d);//7
				
				int e = 5;
				int f = e--; //  f=5 , bcz e = 5 will assign to f and inthe next line   decremented value  by 1 and stored in e
				System.out.println(f);//f=5
				System.out.println(e); //e=4
				
				//Pre Decrement
				int h=10;
				System.out.println(h);          //10
				--h;                           //print 9 use 9
				System.out.println(h);         //9
				System.out.println(--h);       //Decrement  8 prnt it then use g=8
				System.out.println(h);         //g=8
		
		
				
				
				//Questions1 ------->
				
				int i = 5;
				int j;
				j = i++ + i++ + ++i;  //j == > 5 + 6 + 8 = 19  // i =8
				System.out.println(i);
				System.out.println(j);
				
				//Questions2 ------->
				int k = 5;
				int m;
				m = ++k + k++ + ++k + k--;  //j == > 6 + 6 + 8 + 8 = 38  // i =7
				System.out.println(k);
				System.out.println(m);
	
				
		
	}

}
