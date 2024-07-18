/*      
     Type casting
Converting a value from one data type to another data type is known as type casting.

There are two types of type casting:

	1. Widening Type Casting  (byte -> short -> char -> int -> long -> float -> double )
	
	2. Narrowing Type Casting (double -> float -> long -> int -> char -> short -> byte )    --covered in next program
*/

//widening A.K.A implicit typecasting (automatically done by the compiler)
// Targeted datatype must be large than the source datatype

public class program_15
{
	
	public static void main(String a[])
	{
		int var1 = 5;		//4 bytes
		
		double var2 = var1;    //8 bytes
		
		System.out.println("Value of Integer: " + var1);
		System.out.println("Value of Double : " + var2);
	}
}

//this program clearly shows how conversion is done.

//try changing values and datatypes for better understanding


