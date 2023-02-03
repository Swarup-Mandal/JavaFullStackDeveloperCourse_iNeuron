package lectures.Java_WrapperClass_16;

/*Methods
  1. =======
public byte byteValue();
public short shortValue();
public int intValue();
public long longValue();
public float floatValue();
public double doubleValue();*/
/*
  2. charValur() => public char charValue()
  3. booleanValue() => public boolean booleanValue()
  # In total xxxValue() are 36 in number.
=> xxxValue() => convert the Wrapper Object => primitive.*/
public class XxxValue_Method_02_4 {

	public static void main(String[] args) {
		
		//eg#1.
		Integer i=Integer.valueOf(130);
		// result = minrange +(total -maxrange -1)    #for byte => [-128 + (130 - 127 -1) = -126 ]
		System.out.println(i.byteValue());//-126
		System.out.println(i.shortValue());//130
		System.out.println(i.intValue());//130
		System.out.println(i.longValue());//130
		System.out.println(i.floatValue());//130.0
		System.out.println(i.doubleValue());//130.0
		
		//eg#2.
		Character c=Character.valueOf('c');
		char ch= c.charValue();
		System.out.println(ch); //c the same character u get.
		
		//eg#3.
		Boolean b=Boolean.valueOf("nitin");
		boolean b1=b.booleanValue();
		System.out.println(b1);//false

	}

}
