public class program4 
{
    public static void main(String args[])
    {
        int i = 10;
        int j = 15;                                         //Declaring variables           
        int k = 20;

        if((i>j) && (i>k))                                  //Condition 1  
        {
            System.out.println("The largest is " + i);          
        }
        else if((j>i) && (j>k))                             //Condition 2   
        {
            System.out.println("The largest is " + j);
        }
        else
        {
            System.out.println("The largest is " + k);
        }

    }
}
