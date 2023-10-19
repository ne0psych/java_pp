public class program5
{
    public static void main(String args[])
    {
        int n = 6;                               //Declaring variables

        switch(n)                                //using swtich for var n
        {
            case 1:                              //using of case different value
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            
            case 7:
                System.out.println("Sunday");
                break;

            default:                             // adding default - if no cases matched
                System.out.println("Enter a valid Input");
        }
    }
}
