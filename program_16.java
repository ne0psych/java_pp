/* 
Narrow typecasting a.k.a Explicit Typecasting.

It is done manually by placing the target data type in parentheses 
before the value. 

can lead to data loss because the larger type might hold more information than the smaller type can store.

*/


public class program_16
{
    public static void main(String a[])
    {
        double var1 = 50.04;
        int num = (int) var1;  	// double to int (memory 8 bytes --> 4 bytes)
        System.out.println("Value of Double: " + var1);
        System.out.println("Value of integer after casting: " + num);
    }
}


//try changing values and datatypes for better understanding
