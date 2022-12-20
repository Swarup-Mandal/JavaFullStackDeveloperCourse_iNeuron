package lectures.Java_StaticKeyword_12;

class Demo1{
	int a;               //some instance variables
	int b;
	
	static int count;
	
	{                   //non-satic block
		count++;        //instead of writing this in each constructor it is recomended to write in non-static java block.
	}                    //bcz,every constructor will first include  non-static java block first then it's own body 
	
	Demo1(){               //creating a comstructor
//		count++;
	}
	Demo1(int a, int b){     //creating a comstructor
		this.a=a;
		this.a=b;
//		count++;
	}
	Demo1(int a){            //creating a comstructor
		this.a=a;
//		count++;
	}
	
}
public class NonStaticBlock {
	public static void main(String[] args) {
		
		Demo1 d1 =new Demo1();
		Demo1 d4 =new Demo1();
		Demo1 d2 =new Demo1(10,20);
		Demo1 d3 =new Demo1(30);
		System.out.println("Total object created is : "+ Demo1.count);
	}
}
