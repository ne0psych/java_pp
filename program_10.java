//printing Five working days with Working hours using nested loop

public class program10 
{
    public static void main(String args[])
    {
        for(int i=1; i<=5; i++)
        {  
            System.out.println("Day" + i);
            
            for(int j=1; j<=8; j++)
            {
                System.out.println("    " + (j+8) + " - " + (j+9));
            }
            
        }
    }
}
