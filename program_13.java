//program for two dimensional array

public class program_13 
{
    public static void main(String[] args) 
    {       
        int[][] numbers = {                // Declaration and intialization
                            {1, 2, 3, 4}, 
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}         
                          };           

        System.out.println("Elements of the Two Dimensional array:");
        for (int r = 0; r < 3; r++) 
        {
            for (int c = 0; c < 4; c++) 
            {
                System.out.print(numbers[r][c] + " ");
            }
            System.out.println();          // Move to the next row.
        }
    }

}
