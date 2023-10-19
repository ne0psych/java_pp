public class program7 
{
    public static void main(String args[])
    {
        int i = 3;

        do                              //executing statement even the condition if false
        {
            System.out.println("The Value of i is " + i);
            i++;
        }while(i<=4);

        System.out.println("The value after condtion failed " + i);

    }
    
    
}
