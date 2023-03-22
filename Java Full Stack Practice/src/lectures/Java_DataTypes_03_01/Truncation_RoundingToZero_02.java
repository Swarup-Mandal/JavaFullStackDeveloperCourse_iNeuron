package lectures.Java_DataTypes_03_01;

/**Trancation/ Rounding of Zero => 
=================================
when we are doing expression in between two whole number then the result would be in
integer type irrespective of we are storing in float or others type.
int + int  = int
byte + byte = int
short + short = int
char + char = int

long + long = long  //**
byte  + long = long
short  + long = long
char  + long = long
int  + long = long

for float and Double it would the bigger data type---->
float + float = float
double + double = double

float + double = double
float + int = float
float + long = float
float + char = float
float + short  = float
float + byte = float


double + byte = double   //so, Double is a bigger data type in primitive 
double + short  = double  //this why every type of primitive type can be promoted 
double + char = double //Means we can store and we can do operation also with Double and it return always Double
double + int = double
double + long = double
double + float = double
double + double = double

**so, Double is a bigger data type in primitive this why every type of primitive
* can be promoted Means we can store and we can do operation also with Double and it 
* return always Double

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
        char aa = 'A';
        char bb = 'B';
        //char ress = aa + bb;
        int ress1 = aa + bb;
        System.out.println(ress1);
        
        
        
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