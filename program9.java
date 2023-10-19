//printing weeks with days using nested loop

public class program9 
{
    public static void main(String args[])
    {
        int i = 1;                  
        
        while(i<=4)
        {
            System.out.println("WEEK " + i);

            int j=1;
            while(j<=3)
            {
                System.out.println("    " + "DAY " + j);
                j++;
            }

            i++;
        }
    }
}
