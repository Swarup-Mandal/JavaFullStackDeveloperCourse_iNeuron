package lectures.Java_LanbdaExpression_Funtional_Interface_19;
//WAP to compute length of String
@FunctionalInterface
interface CLS
{
	int getLength(String str);
}

//#1 by Traditional implements method
//class LOS implements CLS
//{
//	public int getLength(String str)
//	{
//		int length=str.length();
//		return length;
//	}
//}

public class WAP_ComputeLengthOfString_3 {

	public static void main(String[] args) 
	{
		//#2 by Anonymous Inner Class
//		LOS l=new LOS();
//		System.out.println(l.getLength("iNeuron.ai"));
		
//		CLS cls=new CLS() {
//			
//			public int getLength(String str)
//			{
//				return str.length();
//			}
//		};
//		System.out.println(cls.getLength("iNeuron.ai"));
		
		//#3 by Lambda Expresion --------->
		CLS cls= str -> str.length();
		
		System.out.println(cls.getLength("iNeuron.ai"));

	}

}



