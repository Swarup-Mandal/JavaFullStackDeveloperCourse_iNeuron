package lectures.Java_DataTypes_03_01;

/**Trancation/ Rounding of Zero => 
=================================
when we are doing expression in between two whole number then the result would be in
integer type irrespective of we are storing in float or others type.
int + int  = int
byte + byte = int
short + short = int

byte  + long = long

long + long = long  //**

for float and Double it would the bigger data type---->
float + float = float
double + double = double
float + double = double
float + int = float
float + long = float
double + long = double
*/
public class Truncation_RoundingToZero_02 {

	public static void main(String[] args) {
		//byte + byte = int
		byte num1 = 45;
		byte num2 =  10;
		//byte result = num1 + num2; //here 45 + 10 = 55 as int it would give bcz Trancation Happening
        int result = num1 + num2;
        byte res = (byte) (num1+num2);
        System.out.println(result);
        System.out.println(res);
        
        
        
        //long + long = long    ====> not int
        long nu = 451l;
        long nu1 = 10l;
        long ress = nu + nu1;
        System.out.println(ress);
        
        //float + int = float
        float a = 10.2f;
        int b = 10;
        float c = a+b;
        System.out.println(c);
        
        double d = 56.50;
        long e = 340l;
        
        double rt = a + d; //float + double = double
        float ry= a + e; //float + long = float
        double tt = d + e; //double + long = double 
        
        long re = num1 + nu;  // byte  + long = long
        
	}


}